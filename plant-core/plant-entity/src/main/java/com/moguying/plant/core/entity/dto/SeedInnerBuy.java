package com.moguying.plant.core.entity.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class SeedInnerBuy implements Serializable {

    @JSONField(name = "seed_id")
    private Integer seedId;

    @JSONField(name = "user_count")
    private Integer userCount;

    @JSONField(name = "order_count")
    private Integer orderCount;

    @JSONField(name = "users")
    private List<UserInner> userInners;

}
