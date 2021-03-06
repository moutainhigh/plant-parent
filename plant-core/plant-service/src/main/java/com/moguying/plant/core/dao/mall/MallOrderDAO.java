package com.moguying.plant.core.dao.mall;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.moguying.plant.core.dao.BaseDAO;
import com.moguying.plant.core.entity.mall.MallOrder;
import com.moguying.plant.core.entity.user.vo.UserMallOrder;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

/**
 * MallOrderDAO继承基类
 */
@Repository
public interface MallOrderDAO extends BaseDAO<MallOrder> {
    IPage<MallOrder> selectSelective(Page<MallOrder> page, @Param("wq") MallOrder where);

    List<MallOrder> selectSelective(@Param("wq") MallOrder where);

    IPage<UserMallOrder> userOrderListByState(Page<MallOrder> page, @Param("userId") Integer userId, @Param("state") Integer state);

    MallOrder findByIdAndNum(@Param("userId") Integer userId, @Param("number") String number);

    Integer closeOrder(@Param("ids") List<Integer> ids);

    Integer getMallOrderNum(@Param("state") Integer state);

    Integer getMallOrderUserNum(@Param("state") Integer state);

    BigDecimal getMallOrderAmount(@Param("state") Integer state);
}