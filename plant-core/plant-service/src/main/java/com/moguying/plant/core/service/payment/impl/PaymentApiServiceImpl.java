package com.moguying.plant.core.service.payment.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.moguying.plant.constant.MessageEnum;
import com.moguying.plant.core.entity.ResultData;
import com.moguying.plant.core.entity.account.UserMoney;
import com.moguying.plant.core.entity.payment.PayRequestInfo;
import com.moguying.plant.core.entity.payment.response.PayResponse;
import com.moguying.plant.core.entity.payment.response.PaymentResponse;
import com.moguying.plant.core.entity.seed.vo.SendPayOrder;
import com.moguying.plant.core.entity.system.PayOrder;
import com.moguying.plant.core.entity.user.User;
import com.moguying.plant.core.entity.user.UserMoneyOperator;
import com.moguying.plant.core.service.account.UserMoneyService;
import com.moguying.plant.core.service.payment.PaymentApiService;
import com.moguying.plant.core.service.payment.PaymentService;
import com.moguying.plant.utils.PasswordUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.math.BigDecimal;

@Service
public class PaymentApiServiceImpl implements PaymentApiService {

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private UserMoneyService userMoneyService;

    @Transactional
    @Override
    @DS("write")
    public ResultData<PaymentResponse<PayResponse>> payOrder(SendPayOrder payOrder, PayOrder orderDetail, User userInfo) {
        ResultData<PaymentResponse<PayResponse>> resultData = new ResultData<>(MessageEnum.ERROR,null);
        // 仅全额由余额支付时校验支付密码
        if (orderDetail.getAccountPayAmount().add(orderDetail.getReducePayAmount())
                .compareTo(orderDetail.getBuyAmount().add(orderDetail.getFeeAmount())) == 0) {
            if (null == userInfo.getPayPassword() || StringUtils.isEmpty(userInfo.getPayPassword()))
                return resultData.setMessageEnum(MessageEnum.NEED_PAY_PASSWORD);
            if (!PasswordUtil.INSTANCE.encode(payOrder.getPayPassword().getBytes()).equals(userInfo.getPayPassword()))
                return resultData.setMessageEnum(MessageEnum.PAY_PASSWORD_ERROR);
        }

        // 余额支付
        if (orderDetail.getAccountPayAmount().compareTo(new BigDecimal("0")) > 0) {
            // 资金操作
            UserMoneyOperator operator = new UserMoneyOperator();
            operator.setOpType(orderDetail.getOpType());
            UserMoney money = new UserMoney(userInfo.getId());
            money.setAvailableMoney(orderDetail.getAccountPayAmount().negate());
            operator.setUserMoney(money);
            operator.setOperationId(orderDetail.getOrderNumber());
            if (userMoneyService.updateAccount(operator) != null) {
                resultData.setMessageEnum(MessageEnum.SUCCESS);
            }
        }

        // 卡支付
        if (orderDetail.getCarPayAmount().compareTo(new BigDecimal("0")) > 0) {

            PayRequestInfo payRequestInfo = new PayRequestInfo();
            payRequestInfo.setUserId(userInfo.getId());
            payRequestInfo.setMoney(orderDetail.getCarPayAmount().toString());
            payRequestInfo.setMerOrderNo(orderDetail.getOrderNumber());
            payRequestInfo.setOrderSubject(orderDetail.getOpType().getTypeStr() + orderDetail.getOrderNumber());
            payRequestInfo.setSmsCode(payOrder.getPayMsgCode());
            payRequestInfo.setSeqNo(payOrder.getSeqNo());
            payRequestInfo.setBankId(payOrder.getBankId());
            ResultData<PaymentResponse<PayResponse>> payResult = paymentService.pay(payRequestInfo);
            if (null != payResult && payResult.getMessageEnum().equals(MessageEnum.SUCCESS)) {
                resultData.setMessageEnum(MessageEnum.SUCCESS);
            } else if (null != payResult) {
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                return resultData.setMessageEnum(MessageEnum.ERROR).setData(payResult.getData());
            }
        }
        return resultData;
    }
}
