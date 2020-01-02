package com.moguying.plant.core.service.admin.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.moguying.plant.core.dao.admin.AdminMenuDAO;
import com.moguying.plant.core.dao.admin.AdminMessageDAO;
import com.moguying.plant.core.dao.admin.AdminUserDAO;
import com.moguying.plant.core.dao.user.UserDAO;
import com.moguying.plant.core.entity.PageResult;
import com.moguying.plant.core.entity.admin.AdminMenu;
import com.moguying.plant.core.entity.admin.AdminMessage;
import com.moguying.plant.core.entity.admin.AdminUser;
import com.moguying.plant.core.service.admin.AdminMenuService;
import com.moguying.plant.core.service.admin.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class AdminUserServiceImpl implements AdminUserService {

    @Autowired
    private AdminUserDAO adminUserDAO;

    @Autowired
    private AdminMessageDAO adminMessageDAO;

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private AdminMenuService adminMenuService;

    @Autowired
    private AdminMenuDAO adminMenuDAO;



    @Override
    @DS("write")
    public AdminUser login(String phone,String ip) {
        AdminUser adminUser = adminUserDAO.selectOne(
                new QueryWrapper<AdminUser>().lambda()
                .eq(AdminUser::getPhone,phone)
                .eq(AdminUser::getIsLocked,false)
        );
        if(null == adminUser) return null;
        else {
            AdminUser update = new AdminUser();
            update.setId(adminUser.getId());
            update.setLastLoginTime(new Date());
            update.setLastLoginIp(ip);
            adminUserDAO.updateById(update);
            return adminUser;
        }
    }

    @Override
    @DS("read")
    public AdminUser userInfo(Integer id) {
        AdminUser user = adminUserDAO.adminUserInfoById(id);
        user.setHasNewMessage(adminMessageDAO.hasNewMessage(id) > 0);
        List<AdminMenu> menus = adminMenuService.generateMenuTree(Arrays.asList(user.getRole().getViewCode().split(",")));
        user.setRouters(menus);
        return  user;
    }

    @Override
    @DS("write")
    public Integer addAdminMessage(AdminMessage adminMessage) {
        return adminMessageDAO.insert(adminMessage);
    }


    @Override
    @DS("read")
    public PageResult<AdminMessage> adminMessageList(Integer page, Integer size, AdminMessage where) {
        IPage<AdminMessage> pageResult = adminMessageDAO.selectPage(new Page<>(page, size),
                new QueryWrapper<>(where).lambda().orderByDesc(AdminMessage::getAddTime));
        return new PageResult<>(pageResult.getTotal(),pageResult.getRecords());
    }

    @DS("write")
    @Override
    public Integer saveAdminUser(AdminUser adminUser) {
        if(null != adminUser.getId()){
            return adminUserDAO.updateById(adminUser);
        } else {
            return adminUserDAO.insert(adminUser);
        }
    }

    @Override
    @DS("read")
    public PageResult<AdminUser> adminUserList(Integer page, Integer size, AdminUser where) {
        IPage<AdminUser> pageResult = adminUserDAO.selectSelective(new Page<>(page, size), where);
        return new PageResult<>(pageResult.getTotal(),pageResult.getRecords());
    }

    @DS("write")
    @Override
    public Integer readMessage(Integer userId) {
        return adminMessageDAO.updateUserMessage(userId,1);
    }
}
