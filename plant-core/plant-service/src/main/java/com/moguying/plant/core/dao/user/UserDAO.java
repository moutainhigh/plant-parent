package com.moguying.plant.core.dao.user;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.moguying.plant.core.dao.BaseDAO;
import com.moguying.plant.core.entity.user.User;
import com.moguying.plant.core.entity.user.dto.UserPlantMoneyDto;
import com.moguying.plant.core.entity.user.vo.UserPlantMoneyVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * UserDAO继承基类
 */
@Repository
public interface UserDAO extends BaseDAO<User> {
    IPage<User> selectSelective(Page<User> page, @Param("wq") User user);

    List<User> selectSelective(@Param("wq") User user);

    User userInfoById(Integer id);

    User userInfoByPhoneAndPassword(User user);

    User userInfoByInviteCodeAndId(@Param("userId") Integer userId, @Param("inviteCode") String inviteCode);

    List<User> inviteUser(@Param("startTime") Date startTime, @Param("inviteId") Integer inviteId);

    IPage<UserPlantMoneyVo> userPlantMoneyList(Page<UserPlantMoneyVo> page, @Param("upm") UserPlantMoneyDto userPlantMoneyDto);

    Integer getUserNum(@Param("state") Integer state, @Param("i") Integer i);
}