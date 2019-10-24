package com.moguying.plant.core.service.mall;

import com.moguying.plant.core.annotation.DataSource;
import com.moguying.plant.core.entity.PageResult;
import com.moguying.plant.core.entity.ResultData;
import com.moguying.plant.core.entity.coin.vo.ExchangeInfo;
import com.moguying.plant.core.entity.common.vo.BuyResponse;
import com.moguying.plant.core.entity.common.vo.HomeProduct;
import com.moguying.plant.core.entity.common.vo.HomeProductDetail;
import com.moguying.plant.core.entity.mall.MallProduct;
import com.moguying.plant.core.entity.mall.vo.OrderBuy;
import com.moguying.plant.core.entity.mall.vo.OrderBuyResponse;
import com.moguying.plant.core.entity.mall.vo.OrderSum;
import com.moguying.plant.core.entity.seed.vo.SubmitOrder;

public interface MallProductService {

    @DataSource("read")
    ResultData<OrderBuyResponse> orderBuy(Integer userId, OrderBuy orderBuy);

    @DataSource("write")
    ResultData<Integer> saveProduct(MallProduct addProduct);

    @DataSource("write")
    boolean showProduct(Integer id);

    @DataSource("read")
    PageResult<MallProduct> productList(Integer page, Integer size, MallProduct where);

    @DataSource("write")
    ResultData<BuyResponse> submitOrder(SubmitOrder submitOrder, Integer userId);

    @DataSource("read")
    ResultData<MallProduct> productDetail(Integer id);

    @DataSource("read")
    ResultData<OrderSum> sumOrder(SubmitOrder submitOrder);

    @DataSource("read")
    PageResult<HomeProduct> productListForHome(Integer page, Integer size, HomeProduct search);

    @DataSource("read")
    HomeProductDetail productDetailForAppMall(Integer id);

    /**
     * 兑换实物列表
     */
    @DataSource("read")
    PageResult<ExchangeInfo> showProducts(Integer page, Integer size);

    /**
     * 兑换实物日志列表
     */
    @DataSource("read")
    PageResult<ExchangeInfo> showProductLog(Integer page, Integer size, Integer userId);
}
