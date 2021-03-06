package com.moguying.plant.core.dao.user;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.moguying.plant.core.dao.BaseDAO;
import com.moguying.plant.core.entity.mall.vo.ProductInfo;
import com.moguying.plant.core.entity.user.vo.UserMoneyDetail;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface UserMoneyDetailDAO extends BaseDAO<UserMoneyDetail> {

    /**
     * 获取用户资金明细
     */
    IPage<UserMoneyDetail> findUserMoney(Page<UserMoneyDetail> page, @Param("userId") Integer userId, @Param("dateTime") String dateTime, @Param("list") List<Integer> list);

    /**
     * 根据ID获取资金详情
     */
    UserMoneyDetail findUserMoneyById(Integer id);

    /**
     * 根据商品详情ID获取商品详情
     */
    List<ProductInfo> findProducts(String detailId);

    /**
     * 根据商品详情ID获取购买菌包
     */
    List<ProductInfo> findInSeeds(String detailId);

    /**
     * 根据商品详情ID获取出售菌包
     */
    List<ProductInfo> findOutSeeds(String detailId);

    /**
     * 根据商品详情ID获取出售菌包
     */
    List<ProductInfo> findInvitation(String detailId);

    /**
     * 收入/支出
     */
    BigDecimal getTotal(@Param("userId") Integer userId, @Param("dateTime") String dateTime, @Param("list") List<Integer> list);

}
