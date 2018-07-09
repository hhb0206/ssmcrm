package com.hhb.crm.dao;

import com.hhb.crm.pojo.BaseDict;
import com.hhb.crm.pojo.BaseDictExample;
import java.util.List;

import com.hhb.crm.pojo.QueryVo;
import org.apache.ibatis.annotations.Param;

public interface BaseDictMapper {


    /**
     * 根据数据字典类型编码查询
     *
     *
     */
    List<BaseDict> queryBaseDictByTypeCode(String typeCode);



    int countByExample(BaseDictExample example);

    void deleteByExample(BaseDictExample example);

    void deleteByPrimaryKey(String dictId);

    void insert(BaseDict record);

    void insertSelective(BaseDict record);

    List<BaseDict> selectByExample(BaseDictExample example);

    BaseDict selectByPrimaryKey(String dictId);

    void updateByExampleSelective(@Param("record") BaseDict record, @Param("example") BaseDictExample example);

    void updateByExample(@Param("record") BaseDict record, @Param("example") BaseDictExample example);

    void updateByPrimaryKeySelective(BaseDict record);

    void updateByPrimaryKey(BaseDict record);
}