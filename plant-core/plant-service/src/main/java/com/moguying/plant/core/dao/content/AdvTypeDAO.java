package com.moguying.plant.core.dao.content;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.moguying.plant.core.dao.BaseDAO;
import com.moguying.plant.core.entity.content.AdvType;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * AdvTypeDAO继承基类
 */
@Repository
public interface AdvTypeDAO extends BaseDAO<AdvType> {
    List<AdvType> selectSelective(AdvType advType);
}