package com.moguying.plant.core.service.mall;

import com.moguying.plant.core.entity.mall.MallCompany;

import java.util.List;

public interface MallCompanyService {

    /**
     * 根据公司编码获取公司详情
     */

    MallCompany findByCode(String companyCode);

    /**
     * 获取所以公司名称
     */

    List<MallCompany> getAllComName();

}
