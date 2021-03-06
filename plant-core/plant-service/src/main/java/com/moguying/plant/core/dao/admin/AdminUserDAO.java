package com.moguying.plant.core.dao.admin;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.moguying.plant.core.dao.BaseDAO;
import com.moguying.plant.core.entity.admin.AdminUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * AdminUserDAO继承基类
 */
@Repository
public interface AdminUserDAO extends BaseDAO<AdminUser> {

    IPage<AdminUser> selectSelective(Page<AdminUser> page, @Param("wq") AdminUser where);

    List<AdminUser> selectSelective(@Param("wq") AdminUser where);

    AdminUser adminUserInfoById(Integer id);
}