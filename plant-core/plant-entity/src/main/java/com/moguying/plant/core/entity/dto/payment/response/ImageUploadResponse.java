package com.moguying.plant.core.entity.dto.payment.response;

public class ImageUploadResponse implements PaymentResponseInterface{

    private String fileNum;

    public String getFileNum() {
        return fileNum;
    }

    public void setFileNum(String fileNum) {
        this.fileNum = fileNum;
    }
}
