package com.moguying.plant.core.dao.farmer;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.moguying.plant.core.dao.BaseDAO;
import com.moguying.plant.core.entity.farmer.FarmerEnergy;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * FarmerEnergyDAO继承基类
 */
@Repository
public interface FarmerEnergyDAO extends BaseDAO<FarmerEnergy> {
    List<FarmerEnergy> selectSelective(FarmerEnergy where);

    FarmerEnergy selectByIdAndUserId(FarmerEnergy where);
}