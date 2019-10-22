package com.moguying.plant.core.constant;

public enum ReapEnum {
    WAITING_REAP(0,"待采摘"),
    REAP_DONE(1,"已采摘"),
    SALE_ING(2,"售卖中"),
    SALE_DONE(3,"已售卖");
    private Integer state;

    private String stateName;

    ReapEnum(Integer state, String stateName) {
        this.state = state;
        this.stateName = stateName;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
}
