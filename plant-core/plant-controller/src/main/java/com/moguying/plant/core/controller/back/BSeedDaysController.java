package com.moguying.plant.core.controller.back;

import com.moguying.plant.constant.MessageEnum;
import com.moguying.plant.core.entity.PageResult;
import com.moguying.plant.core.entity.PageSearch;
import com.moguying.plant.core.entity.ResponseData;
import com.moguying.plant.core.entity.seed.SeedDays;
import com.moguying.plant.core.service.seed.SeedDaysService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.*;

/**
 * 菌包周期管理
 */
@RestController
@RequestMapping("/seedDays")
@Api(tags = "菌包周期管理")
public class BSeedDaysController {

    @Autowired
    SeedDaysService seedDaysService;

    /**
     * 菌包周期列表
     */
    @PostMapping("/list")
    @ApiOperation("菌包周期列表")
    public PageResult<SeedDays> seedDaysList(@RequestBody PageSearch search) {
        return seedDaysService.seedDaysList(search.getPage(), search.getSize());
    }


    /**
     * 添加菌包周期
     *
     * @return_
     */
    @PostMapping(value = "/add")
    @ApiOperation("添加菌包周期")
    public ResponseData seedDaysAdd(@RequestBody SeedDays days) {
        if (days.getGrowDays() == null || days.getGrowDays() == 0 || days.getGrowDays() < 0 || StringUtils.isEmpty(days.getGrowDaysName()))
            return new ResponseData(MessageEnum.PARAMETER_ERROR.getMessage(), MessageEnum.PARAMETER_ERROR.getState());
        try {
            if (seedDaysService.seedDaysAdd(days) > 0)
                return new ResponseData(MessageEnum.SUCCESS.getMessage(), MessageEnum.SUCCESS.getState());
        } catch (DuplicateKeyException exception) {
            return new ResponseData(MessageEnum.DAYS_EXISTS_ERROR.getMessage(), MessageEnum.DAYS_EXISTS_ERROR.getState());
        }
        return new ResponseData(MessageEnum.ERROR.getMessage(), MessageEnum.ERROR.getState());
    }


    /**
     * 菌包周期删除
     *
     * @return
     */
    @DeleteMapping(value = "/delete/{id}")
    @ApiOperation("菌包周期删除")
    public ResponseData seedDaysDelete(@PathVariable Integer id) {
        if (seedDaysService.seedDaysDelete(id) < 1)
            return new ResponseData(MessageEnum.ERROR.getMessage(), MessageEnum.ERROR.getState());
        return new ResponseData(MessageEnum.SUCCESS.getMessage(), MessageEnum.SUCCESS.getState());
    }


    /**
     * 编辑菌包周期
     *
     * @param seedDays
     * @return
     */
    @PutMapping(value = "/edit")
    @ApiOperation("编辑菌包周期")
    public ResponseData seedDaysEdit(@RequestBody SeedDays seedDays) {
        if (seedDaysService.seedDaysEdit(seedDays) < 1)
            return new ResponseData(MessageEnum.ERROR.getMessage(), MessageEnum.ERROR.getState());
        return new ResponseData(MessageEnum.SUCCESS.getMessage(), MessageEnum.SUCCESS.getState());
    }

}
