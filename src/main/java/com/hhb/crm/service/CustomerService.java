package com.hhb.crm.service;

import com.hhb.crm.pojo.Customer;
import com.hhb.crm.pojo.CustomerExample;
import com.hhb.crm.pojo.QueryVo;
import com.hhb.crm.utils.Page;

import javax.management.Query;
import java.util.List;

/**
 * @ClassName : CustomerService
 * @Author : River
 * @Description (这里用一句话描述这个类的作用)
 * @Date: Create in 21:22 2018/6/30
 * @Modified By:
 */
public interface CustomerService {


    /**
     * 查询所有客户
     */
    List<Customer> queryCustomer(QueryVo queryVo);

    /**
     * 分页查询客户列表数据
     */
    Page<Customer> pageCustomersList(QueryVo queryVo);

    /**
     * 根据客户id查询客户
     */
    Customer queryCustomerById(Long custId);

    /**
     * 更新客户
     */
    void updateCustomer(Customer customer);

    /**
     * 根据id删除客户
     */
    void deleteCustomerById(Long id);
}
