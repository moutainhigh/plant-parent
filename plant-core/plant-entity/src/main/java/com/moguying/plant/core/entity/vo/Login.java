package com.moguying.plant.core.entity.vo;

import lombok.Data;

import java.io.Serializable;


@Data
public class Login implements Serializable {
    private String phone;

    private String code;

    private String password;

}
