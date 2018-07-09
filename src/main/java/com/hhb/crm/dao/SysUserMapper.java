package com.hhb.crm.dao;

import com.hhb.crm.pojo.SysUser;
import com.hhb.crm.pojo.SysUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserMapper {
    int countByExample(SysUserExample example);

    void deleteByExample(SysUserExample example);

    void deleteByPrimaryKey(Long userId);

    void insert(SysUser record);

    void insertSelective(SysUser record);

    List<SysUser> selectByExample(SysUserExample example);

    SysUser selectByPrimaryKey(Long userId);

    void updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    void updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

    void updateByPrimaryKeySelective(SysUser record);

    void updateByPrimaryKey(SysUser record);
}