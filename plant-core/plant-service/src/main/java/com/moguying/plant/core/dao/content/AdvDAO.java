package com.moguying.plant.core.dao.content;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.moguying.plant.core.dao.BaseDAO;
import com.moguying.plant.core.entity.content.Adv;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * AdvDAO继承基类
 */
@Repository
public interface AdvDAO extends BaseDAO<Adv> {
    List<Adv> selectSelection(Adv adv);
}