package com.moguying.plant.core.entity.dto.payment.response;

public class PayAuthAndSignResponse implements PaymentResponseInterface {
    private String merOrderNo;

    public String getMerOrderNo() {
        return merOrderNo;
    }

    public void setMerOrderNo(String merOrderNo) {
        this.merOrderNo = merOrderNo;
    }
}
