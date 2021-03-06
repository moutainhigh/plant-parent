package com.moguying.plant.core.controller.back;

import com.moguying.plant.constant.MessageEnum;
import com.moguying.plant.core.entity.PageResult;
import com.moguying.plant.core.entity.PageSearch;
import com.moguying.plant.core.entity.ResponseData;
import com.moguying.plant.core.entity.ResultData;
import com.moguying.plant.core.entity.block.Block;
import com.moguying.plant.core.service.block.BlockService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/block")
@Api(tags = "大棚管理")
public class BBlockController {

    @Autowired
    private BlockService blockService;

    @PostMapping(value = "/list")
    @ApiOperation("大棚列表")
    public PageResult<Block> blockList(@RequestBody PageSearch<Block> search) {
        if (null == search.getWhere())
            search.setWhere(new Block());
        return blockService.blockList(search.getPage(), search.getSize(), search.getWhere());
    }

    /**
     * 添加棚区
     *
     * @param block
     * @return
     */
    @PostMapping
    @ApiOperation("添加棚区")
    public ResponseData<Integer> addBlock(@RequestBody Block block) {
        ResultData<Integer> resultData = blockService.addBlock(block);
        return new ResponseData<>(resultData.getMessageEnum().getMessage(), resultData.getMessageEnum().getState(), resultData.getData());
    }


    /**
     * 更新棚区
     *
     * @param update
     * @param id
     * @return
     */
    @PutMapping(value = "/{id}")
    @ApiOperation("更新棚区")
    public ResponseData<Integer> updateBlock(@RequestBody Block update, @PathVariable Integer id) {
        ResultData<Integer> resultData = blockService.updateBlock(id, update);
        return new ResponseData<>(resultData.getMessageEnum().getMessage(), resultData.getMessageEnum().getState(), resultData.getData());
    }


    /**
     * 删除一个棚区
     *
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}")
    @ApiOperation("删除一个棚区")
    public ResponseData<Integer> deleteBlock(@PathVariable Integer id) {
        ResultData<Integer> resultData = blockService.deleteBlock(id);
        return new ResponseData<>(resultData.getMessageEnum().getMessage(), resultData.getMessageEnum().getState(), resultData.getData());
    }


    /**
     * 获取棚区信息
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/{id}")
    @ApiOperation("获取棚区信息")
    public ResponseData<Block> blockInfo(@PathVariable Integer id) {
        ResultData<Block> resultData = blockService.blockInfo(id);
        return new ResponseData<>(resultData.getMessageEnum().getMessage(), resultData.getMessageEnum().getState(), resultData.getData());
    }


    /**
     * 设置是否显示
     *
     * @param id
     * @return
     */
    @PutMapping(value = "/show/{id}")
    @ApiOperation("设置是否显示")
    public ResponseData<String> showBlock(@PathVariable Integer id) {
        return new ResponseData<>(MessageEnum.SUCCESS.getMessage(), MessageEnum.SUCCESS.getState(), blockService.seeBlock(id).toString());
    }


}
