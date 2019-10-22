package com.moguying.plant.core.entity.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.moguying.plant.common.util.BigDecimalSerialize;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class HomeProduct implements Serializable {

    @JSONField(ordinal = 1)
    private Integer id;

    @JSONField(ordinal = 2)
    private String thumbPicUrl;

    @JSONField(ordinal = 3)
    private String name;

    @JSONField(ordinal = 4,serializeUsing = BigDecimalSerialize.class)
    private BigDecimal price;

    @JSONField(ordinal = 5,serializeUsing = BigDecimalSerialize.class)
    private BigDecimal oldPrice;

    @JSONField(ordinal = 6)
    private Integer hasCount;

    @JSONField(serialize = false)
    private Integer page = 1;

    @JSONField(serialize = false)
    private Integer size = 10;

    @JSONField(ordinal = 7)
    private Integer consumeCoins;

}
