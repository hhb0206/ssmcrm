package com.hhb.crm.service;

import com.hhb.crm.pojo.BaseDict;

import java.util.List;

/**
 * @ClassName : BaseDictService
 * @Author : River
 * @Description 数据字典service接口
 * @Date: Create in 19:06 2018/6/30
 * @Modified By:
 */
public interface BaseDictService {


    /**
     * 根据数据字典类型编码查询
     */
    List<BaseDict> queryBaseDictByTypeCode(String typeCode);

}
