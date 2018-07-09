package com.hhb.crm.dao;

import com.hhb.crm.pojo.Customer;
import com.hhb.crm.pojo.CustomerExample;
import java.util.List;

import com.hhb.crm.pojo.QueryVo;
import org.apache.ibatis.annotations.Param;

public interface CustomerMapper {


    /**
     * 查询当前页客户列表数据
     */

    List<Customer> queryCustomerList(QueryVo queryVo);

    /**
     * 统计客户总记录数
     */

    Integer countCustomers(QueryVo queryVo);

    int countByExample(CustomerExample example);

    void deleteByExample(CustomerExample example);

    void deleteByPrimaryKey(Long custId);

    void insert(Customer record);

    void insertSelective(Customer record);

    List<Customer> selectByExample(CustomerExample example);

    Customer selectByPrimaryKey(Long custId);

    void updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);

    void updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);

    void updateByPrimaryKeySelective(Customer record);

    void updateByPrimaryKey(Customer record);
}