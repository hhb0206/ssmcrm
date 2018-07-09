package com.hhb.crm.service.impl;

import com.hhb.crm.dao.BaseDictMapper;
import com.hhb.crm.pojo.BaseDict;
import com.hhb.crm.service.BaseDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName : BaseDictServiceImpl
 * @Author : River
 * @Description 数据字典service实现类
 * @Date: Create in 19:08 2018/6/30
 * @Modified By:
 */
@Service
@Transactional
public class BaseDictServiceImpl implements BaseDictService {

    //注入数据字典mapper
    @Autowired
    private BaseDictMapper baseDictMapper;


    /**
     * 根据数据字典类型编码查询
     * @param typeCode
     * @return
     */
    public List<BaseDict> queryBaseDictByTypeCode(String typeCode) {


        return baseDictMapper.queryBaseDictByTypeCode(typeCode);
    }
}
