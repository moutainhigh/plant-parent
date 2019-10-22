package com.moguying.plant.core.service.mall;

import com.moguying.plant.core.annotation.DataSource;
import com.moguying.plant.core.entity.PageResult;
import com.moguying.plant.core.entity.ResultData;
import com.moguying.plant.core.entity.dto.MallOrder;
import com.moguying.plant.core.entity.dto.MallOrderSearch;
import com.moguying.plant.core.entity.dto.UserSaleCoin;
import com.moguying.plant.core.entity.dto.payment.response.PaymentResponse;
import com.moguying.plant.core.entity.vo.*;

import java.util.List;

public interface MallOrderService {

    @DataSource("read")
    PageResult<MallOrder> mallOrderList(Integer page, Integer size, MallOrderSearch where);

    @DataSource("read")
    PageResult<UserMallOrder> userMallOrderListByState(Integer page, Integer size, Integer userId, Integer state);

    @DataSource("read")
    void setUserMallOrderItemList(List<UserMallOrder> orderList, Integer userId);

    @DataSource("write")
    Integer saveOrder(MallOrder order);

    @DataSource("read")
    MallOrder selectOrderById(Integer id);

    @DataSource("write")
    ResultData<PaymentResponse> payOrder(SendPayOrder payOrder, Integer userId);

    @DataSource("write")
    ResultData<SendPayOrderResponse> checkPayOrder(SendPayOrder payOrder, Integer userId);

    @DataSource(value = "write")
    ResultData<Integer> cancelOrder(CancelOrder cancelOrder, Integer userId);

    String getStateStr(Integer state);

    @DataSource("write")
    ResultData<Integer> orderRefund(Integer orderId, Integer userId);

    @DataSource(value = "read")
    List<MallOrder> needPayOrders();

    @DataSource("read")
    MallOrder mallOrderDetail(Integer id);

    String synQueryData(TraceInfoParam traceInfoParam);

    @DataSource("read")
    MallOrder findByIdAndNum(Integer userId, String orderNumber);

    @DataSource("write")
    Boolean orderSuccess(MallOrder order, UserSaleCoin userSaleCoin);
}
