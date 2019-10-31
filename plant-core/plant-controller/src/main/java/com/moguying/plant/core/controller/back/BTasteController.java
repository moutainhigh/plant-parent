package com.moguying.plant.core.controller.back;

import com.moguying.plant.constant.MessageEnum;
import com.moguying.plant.core.entity.PageResult;
import com.moguying.plant.core.entity.PageSearch;
import com.moguying.plant.core.entity.ResponseData;
import com.moguying.plant.core.entity.ResultData;
import com.moguying.plant.core.entity.taste.Taste;
import com.moguying.plant.core.service.teste.TasteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/taste")
public class BTasteController {


    @Autowired
    private TasteService tasteService;


    /**
     * 试吃列表
     * @param search
     * @return
     */
    @PostMapping("/list")
    public PageResult<Taste> tasteList(@RequestBody PageSearch<Taste> search){
        return tasteService.tastePageResult(search.getPage(),search.getSize(),search.getWhere());
    }



    /**
     * 添加试吃内容
     * @return
     */
    @PostMapping
    public ResponseData<Taste> saveTasteItem(@RequestBody Taste taste) {
        ResultData<Boolean> resultData = tasteService.saveTaste(taste);
        return new ResponseData<>(resultData.getMessageEnum().getMessage(),resultData.getMessageEnum().getState());
    }


    /**
     * 删除项
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public ResponseData<Boolean> deleteTasteItem(@PathVariable String id){
        ResultData<Boolean> resultData = tasteService.deleteTaste(id);
        return new ResponseData<>(resultData.getMessageEnum().getMessage(),resultData.getMessageEnum().getState());
    }


    /**
     * 设置是否上下架
     * @param id
     * @return
     */
    @PutMapping("/{id}")
    public ResponseData<Boolean> setItemShowState(@PathVariable String id){
        if(tasteService.setShowState(id))
            return new ResponseData<>(MessageEnum.SUCCESS.getMessage(),MessageEnum.SUCCESS.getState());
        return new ResponseData<>(MessageEnum.ERROR.getMessage(),MessageEnum.ERROR.getState());
    }


}
