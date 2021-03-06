package com.moguying.plant.constant;

public enum  MessageEnum {
    SUCCESS("操作成功",20000),
    ERROR("操作失败",10000),
    LOGIN_ERROR("用户名或密码错误",10001),
    CODE_ERROR("图形验证码错误",10002),
    PHONE_ERROR("手机号码格式错误",10003),
    PHONE_EXISTS("手机号已存在",10004),
    IDCARD_EXISTS("身份证号已存在",10005),
    SEED_CLASS_NAME_EMPTY("菌包分类名不能为空",10006),
    ID_ERROR("删除ID不正确",10007),
    USER_IS_BAND("用户冻结",10008),
    SEED_CLASS_PARENT_NOT_EXISTS("上级分类不存在",10009),
    PARAMETER_ERROR("参数错误",10010),
    DAYS_EXISTS_ERROR("周期已存在",10011),
    SEED_NOT_EXISTS("菌包不存在",10012),
    SEED_HAD_REVIEWED("菌包记录已审核，无须再审",10013),
    FILE_UPLOAD_ERROR("图片上传失败",10014),
    FILE_EXISTS("文件已存在",10015),
    SEED_PIC_NOT_EXISTS("图片记录不存在",10016),
    REMAINDER_IS_NOT_ZERO("图片记录不存在",10017),
    SEED_BUY_CANCEL_ERROR("种植订单取消失败",10018),
    SEED_ONLY_FOR_NEWER("菌包只适用于新手",10019),
    PAY_PASSWORD_ERROR("支付密码错误",10020),
    SEED_NOT_IN_TIME("菌包不在销售期",10021),
    SEED_IS_FULL("菌包已售罄",10022),
    SEED_COUNT_NOT_RIGHT("购买数量不正确",10023),
    USER_MONEY_NOT_ENOUGH("用户余额不足",10024),
    RECHARGE_NOT_EXISTS("充值记录不存在",10025),
    RECHARGE_IS_REVIEWED("充值记录已审核，无需再审",10045),
    RECHARGE_NOT_AVAILABLE("无效充值金额",10026),
    UPDATE_ARTICLE_FAIL("更新文章失败",10027),
    UPDATE_ARTICLE_CONTENT_FAIL("更新文章内容失败",10028),
    ARTICLE_NOT_EXISTS("文章不存在",10029),
    DELETE_ARTICLE_CONTENT_FAIL("删除文件内空失败",10030),
    DELETE_ARTICLE_FAIL("删除文件内空失败",10031),
    BLOCK_NUMBER_USED("棚区编号已使用",10032),
    BLOCK_NOT_EXISTS("棚区不存在",10033),
    BLOCK_CANNOT_DELETE("棚区存在未采摘完成菌包，不可删除",10034),
    SEED_PRICE_ERROR("总价不可被单价整除",10035),
    SEED_MAX_OUT_RANGE("最大份数不可超过总份数",10036),
    SEED_ORDER_NOT_EXISTS("种植订单不存",10037),
    SEED_ORDER_UPDATE_FAIL("种植订单更新失败",10038),
    SEED_REAP_INFO_CREATE_FAIL("生成采摘信息失败",10039),
    USER_MONEY_UPDATE_FAIL("用户资金更新失败",10040),
    SEED_TIME_ERROR("销售时间或结束时间有误",10041),
    WITHDRAW_NOT_EXISTS("提现记录不存在",10042),
    USER_NOT_BIND_CARD("请先绑定银行卡",10043),
    WITHDRAW_MONEY_ERROR("提现金额无效",10044),
    SEED_ORDER_PLANT_BLOCK_TYPE_ERROR("菌包不可在此棚区种植",10045),
    BLOCK_IS_FULL("棚区已种满请更换其他棚区",10046),
    SEED_ORDER_IS_DONN("菌包订单已完成,不可再操作",10047),
    PLANT_COUNT_ERROR("种植份数与棚区种植份数限制不符",10048),
    BLOCK_UPDATE_FAIL("棚区信息更新失败",10049),
    USER_BANK_CARD_EXISTS("已绑定银行卡",10050),
    USER_ADDRESS_FULL("地址已达最大限制",10051),
    USER_NOT_EXISTS("用户不存在",10052),
    INVITE_USER_NOT_EXISTS("邀请人不存在",10053),
    BANNER_NAME_EXISTS("Banner名称已存在",10054),
    BANNER_NOT_EXISTS("Banner不存在",10055),
    PASSWORD_IS_EMPTY("密码不能为空",10056),
    MESSAGE_CODE_IS_EMPTY("短信验证码不能为空",10057),
    CAN_NOT_REPEAT_SEND_MESSAGE("time分钟内不可重复获取",10058),
    MESSAGE_CODE_LOGIN_ERROR("用户或验证码错误",10059),
    MESSAGE_CODE_ERROR("短信验证码错误",10060),
    LOGIN_METHOD_ERROR("登录方式错误",10061),
    OLD_PAY_PASSWORD_ERROR("旧支付密码错误",10062),
    USER_HAS_REAL_NAME("用户已实名",10063),
    NEED_LOGIN("请登录",10064),
    USER_NEED_REAL_NAME("请先实名",10065),
    USER_NEED_REGISTER_PAYMENT_ACCOUNT("请先注册第三方支付",10066),
    PAY_SMS_SEND_NO_SUCCESS("支付短信发送失败",10067),
    USER_HAS_LOGIN("用户已登录，无需重复登录",10068),
    USER_ADDRESS_NO_EXISTS("地址不存在",10069),
    OLD_PASSWORD_ERROR("旧登录密码错误",10070),
    NEW_PASSWORD_EQUAL_OLD("新密码请设置与旧密码不一致",10071),
    NEED_PAY_PASSWORD("请先设置支付密码",10072),
    MALL_PRODUCT_NOT_EXISTS("商品不存在",10073),
    MALL_PRODUCT_NOT_ENOUGH("商品库存不足",10074),
    MALL_ORDER_CREATE_ERROR("商城订单生成失败",10075),
    MALL_ORDER_DETAIL_CREATE_ERROR("商城订单详情生成失败",10076),
    OPERATE_MONEY_ERROR("操作金额错误",10077),
    MALL_ORDER_NOT_EXISTS("商城订单不存在",10078),
    MALL_CANCEL_REASON_EMPTY("订单取消原因不能为空",10079),
    TOKEN_ERROR("登录认证失败",10080),
    TOKEN_EXPIRE_TIME_OUT("请重新登录",10081),
    TOKEN_HAS_REFRESH("token 已刷新",10082),
    USER_PAYMENT_REGISTER_INFO_ERROR("用户第三方信息注册失败",10083),
    IDCARD_ERROR("身份证号格式错误",10084),
    USER_BANK_CARD_NOT_EXISTS("银行卡不存在",10085),
    PAY_PASSWORD_IS_EMPTY("支付密码不能为空",10086),
    USER_REAL_NAME_VERIFY_ING("实名正在审核中",10087),
    REAL_NAME_EMPTY("姓名不能为空",10088),
    ID_CARD_EMPTY("身份证不能为空",10089),
    MESSAGE_SERIAL_NO_EMPTY("短信流水号不能为空",10090),
    SEED_LEFT_COUNT_NOT_ENOUGH("菌包库存不足",10091),
    SEED_ORDER_DETAIL_NOT_EXISTS("菌包订单不存在",10092),
    SEED_ORDER_DETAIL_HAS_PAY("菌包订单已支付",10093),
    SEED_ORDER_PAY_TYPE_ERROR("菌包订单支付方式错误",10094),
    PAYMENT_AUTH_SUCCESS("支付认证成功",10095),
    PAYMENT_NEED_SIGN("支付需签约",10096),
    USER_BANK_CAR_FULL("银行卡已达绑定上限",10097),
    CAR_ITEM_LESS_ONE("购物车商品数量不能为0",10098),
    PLANT_COUNT_ZERO("种植份数不能为0",10099),
    SEED_ORDER_DETAIL_HAS_CLOSE("菌包订单已关闭",10100),
    SEED_REAP_NOT_EXISTS("成品信息不存在",10101),
    SEED_REAP_CAN_NOT_SALE("成品无可出售份数",10102),
    SEED_REAP_SALE_ERROR("成品出售失败",10103),
    BANK_CARD_ID_EMPTY("请选择提现银行卡",10104),
    WITHDRAW_NO_SUCCESS("未处理审核成功记录",10105),
    WITHDRAW_SEND_SMS_UPDATE_ERROR("更新提现短信流水号失败",10106),
    WITHDRAW_UPDATE_STATE_ERROR("更新提现状态失败",10107),
    WITHDRAW_PAYMENT_RETURN_NOT_MATCH("第三方提现返回不匹配",10108),
    NOT_NEED_OLD_PAY_PASSWORD("首次设置无须旧支付密码",10109),
    MALL_ORDER_UPDATE_ERROR("商城订单更新失败",10110),
    FERTILIZER_CAN_NOT_DELETE("此优惠券正在使用，不可删除",10111),
    PAY_ORDER_NOT_EXISTS("订单不存在",10112),
    PAY_ORDER_CAN_NOT_PAY("订单不可支付",10113),
    MALL_ORDER_PAY_TYPE_ERROR("商城订单支付方式错误",10114),
    MALL_ORDER_ITEM_EMPTY("商城订单为项目为空",10115),
    MALL_ORDER_NO_PAY_STATE("商城订单非支付完成状态",10116),
    MALL_ORDER_CAN_NOT_REFUND("此商城订单无法退款",10117),
    MALL_ORDER_TIMEOUT_CLOSED("订单超时关闭",10118),
    MALL_ORDER_REFUND_CLOSED("订单退款取消",10119),
    MALL_ORDER_ADDRESS_EMPTY("购买地址不能为空",10120),
    FERTILIZER_USER_ERROR("券无法在此条件下使用",10121),
    APK_NOT_EXIST("安装包不存在",10122),
    USER_HAS_SIGN("用户今日已签到，请勿重复签到",10123),
    USER_SIGN_SUCCESS("签到成功",10124),
    FARMER_INFO_EMPTY("田园种植个人信息不存在",10125),
    UPDATE_INVITE_INFO_SUCCESS("更新邀请信息成功",10126),
    FARMER_ENERGY_NO_EXIST("田园能量不存在",10127),
    FARMER_ENERGY_HAS_PICK("田园能量已采摘",10128),
    FARMER_ENERGY_HAS_LOSE("田园能量已失效",10129),
    FARMER_LEVEL_UP_GIFT_TRUE("等级礼包已领取，请勿重复领取",10130),
    FARMER_LEVEL_UP_GIFT_SUCCESS("等级礼包领取成功",10131),
    FARMER_ENERGY_CAN_NOT_GET("能量还不能收取哦",10132),
    ARTICLE_TYPE_NOT_EXIST("文章分类不存在",10133),
    NO_BLOCK_CAN_PLANT("暂无大棚可种植",10134),
    WITHDRAW_MONEY_OUT_RANGE("已超出今日最大提现额度",10135),
    USER_INFO_ERROR("用户信息不匹配",10136),
    FARMER_LEVEL_UP_GIFT_FALSE("未到达等级，无法领取礼包",10137),
    FERTILIZER_NOT_FOUND("券不存在",10138),
    FERTILIZER_TYPE_FALSE("券类型错误",10138),
    ADMIN_MENU_NOT_EXIST("路由菜单不存在",10139),
    USER_OUT_OF_AGE("用户已超年龄，请更换实名信息",10140),
    COINS_NOT_ENOUGH("蘑菇币不足，无法兑换",10141),
    SHARE_NOT_FOUND("分享订单无效",10143),
    HELPED_ORDER("已帮砍过了，无法重复帮砍",10144),
    HELPED_OVER("当天帮砍已达上限",10145),
    MAX_LIMIT("商品已达限量",10146),
    NOT_OWN_BARGAIN("自己已砍过了，邀请好友来砍",10147),
    ADMIN_ROLE_NOT_EXIST("用户角色不存在",10148),
    MALL_PRODUCT_TYPE_CAN_NOT_DELETE("此商品类型已绑定商品，不可删除",10149),
    IS_NOT_A_CHANNEL("非渠道用户",10150),
    SEED_TYPE_NOT_EXIST("菌包类型不存在",10151),
    SEED_TYPE_NOT_FOR_TASTE("非新手体验类型",10152),
    SEED_REAP_NOT_IN_TIME("成品未到采摘时间",10153),
    TASTE_APPLY_NOT_EXIST("试吃申请记录未查找到",10154),
    TASTE_HAS_APPLY("已申请试吃，请耐心等待结果",10155),
    TASTE_COUNT_NOT_ENOUGH("试吃份数不足，请尝试其他商品",10156),
    TASTE_BUY_SEED_COUNT_ERROR("体验购买份数只能1份",10157),
    POP_MESSAGE_ICON_EMPTY("弹幕ICON不能为空",10158),
    USER_REAP_WEIGH_INFO_NOT_EXISTS("用户产量信息不存在",10159),
    REAP_EXCHANGE_WEIGH_ERROR("成品需大于1800g才可兑换实物",10160),
    BARGAIN_SYMBOL_ERROR("砍价口令错误",10161),
    RETURN_FERTILIZER_ERROR("返券失败",10162),
    FERTILIZER_NOT("未满足满减券使用条件",10163),
    BARGAIN_AGAIN("已领取，快邀请好友帮忙砍价",10165),
    NOT_BARGAIN_RATE("该商品未设置砍价系数",10166),
    NOT_BARGAIN_DETAIL("砍价详情不存在",10178),
    ADD_BARGAIN_ORDER_FAIL("生成砍价详情失败",10167),
    ADD_BARGAIN_LOG_FAIL("生成砍价记录失败",10168),
    SHARE_MAX_ON_DAY("每日分享已上限，再次分享无法获取成长值",10169),
    PICK_UP_SEED("30天菌包奖励已领取",10170),
    SYMBOL_ERROR("标识错误",10172),
    TODAY_HELPED("今天已帮过该好友助力了，请明天再试",10173),
    OWN_HELPED("自己无法助力自己，快邀请好友帮忙",10174),
    INVITE_REWARD("邀请奖励已领取",10175),
    YI_TI_YAN("已体验，无须重复体验",10176),
    ONT_INVITE_LOG("目前还没有邀请记录，快邀请好友拿大奖",10177),
    REAP_WEIGH_NOT_ENOUGH("成品产量不足于兑换商品",10179),
    BANK_NUMBER_IS_EMPTY("银行卡号不能为空",10180),
    PHONE_IS_EMPTY("手机号不能为空",10181),
    LOTTERY_INFO_EMPTY("种植信息不存在，请种植后进行抽奖",10182),
    LOTTERY_RULE_ERROR("抽奖规则格式错误",10183),
    LOTTERY_RULE_OUT_OF_RANGE("您的抽奖条件已经超出我们的预期了！",10184),
    LOTTERY_DAILY_COUNT_USED("抽奖次数已用完，种植再来抽奖！",10185),
    WITHDRAW_MONEY_LIMIT_MIN("单笔提现最小100.00元起提",10186),
    WITHDRAW_MONEY_LIMIT_MAX("单笔提现最大200000.00元",10187),
    ADMIN_DEPT_CANNOT_DEL("存在部门成员，部门不可删除",10188);


    private String message;
    private Integer state;

    MessageEnum(String message, Integer state) {
        this.message = message;
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
