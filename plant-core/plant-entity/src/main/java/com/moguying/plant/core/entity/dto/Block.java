package com.moguying.plant.core.entity.dto;

import com.alibaba.fastjson.annotation.JSONField;
import com.moguying.plant.utils.BigDecimalSerialize;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * plant_block
 * @author 
 */
@Data
public class Block implements Serializable {

    @JSONField(ordinal = 1)
    private Integer id;

    /**
     * 土地编号
     */
    @JSONField(ordinal = 2)
    private String number;

    /**
     * 种植菌类
     */
    @JSONField(ordinal = 3)
    private Integer seedType;

    @JSONField(deserialize = false,ordinal = 4)
    private String seedTypeName;

    /**
     * 利率
     */
    @JSONField(serializeUsing = BigDecimalSerialize.class,ordinal = 5)
    private BigDecimal interestRates;


    /**
     * 土地等级
     */
    @JSONField(ordinal = 6)
    private Integer level;

    /**
     * 总额度
     */
    @JSONField(serializeUsing = BigDecimalSerialize.class,ordinal = 7)
    private BigDecimal totalAmount;

    /**
     * 单价
     */
    @JSONField(serializeUsing = BigDecimalSerialize.class,ordinal = 8)
    private BigDecimal perPrice;

    /**
     * 总份数
     */
    @JSONField(ordinal = 9)
    private Integer totalCount;

    /**
     * 剩余额度
     */
    @JSONField(ordinal = 10)
    private Integer leftCount;

    /**
     * 已用额度
     */
    @JSONField(ordinal = 11)
    private Integer hasCount;

    /**
     * 是否显示[0不显示，1已显示]
     */
    @JSONField(ordinal = 12)
    private Boolean isShow;

    /**
     * 状态[0未使用，1使用中]
     */
    @JSONField(ordinal = 13)
    private Integer state;

    /**
     * 添加时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss",ordinal = 14)
    private Date addTime;

    /**
     * 是否删除[0否，1是]
     */
    @JSONField(ordinal = 15)
    private Boolean isDelete;

    /**
     * 棚内培育菌包的生长周期
     */
    @JSONField(ordinal = 16)
    private Integer growDays;

    /**
     * 最高种植份数
     */
    @JSONField(ordinal = 17)
    private Integer maxPlant;

    /**
     * 最低种植份数
     */
    @JSONField(ordinal = 18)
    private Integer minPlant;

    /**
     * 图片
     */
    @JSONField(ordinal = 19)
    private String picUrl;

    /**
     * 缩略图
     */
    @JSONField(ordinal = 20)
    private String thumbPicUrl;

    private static final long serialVersionUID = 1L;

}