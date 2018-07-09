package com.hhb.crm.service.impl;

import com.hhb.crm.dao.CustomerMapper;
import com.hhb.crm.pojo.Customer;
import com.hhb.crm.pojo.CustomerExample;
import com.hhb.crm.pojo.QueryVo;
import com.hhb.crm.service.CustomerService;
import com.hhb.crm.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName : CustomerServiceImpl
 * @Author : River
 * @Description (这里用一句话描述这个类的作用)
 * @Date: Create in 21:24 2018/6/30
 * @Modified By:
 */
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    //注入customerMapper
    @Autowired
    private CustomerMapper customerMapper;

    /**
     * 查询所有客户
     * @param  queryVo 查询条件
     * @return
     */
    public List<Customer> queryCustomer(QueryVo queryVo) {

        CustomerExample customerExample = new CustomerExample();

        CustomerExample.Criteria criteria = customerExample.createCriteria();

        //用户名
        String custName = queryVo.getCustName();
        //客户来源
        String custSource = queryVo.getCustSource();
        //所属行业
        String custIndustry = queryVo.getCustIndustry();
        //客户级别
        String custLevel = queryVo.getCustLevel();

        if (custName != null) {
            criteria.andCustNameLike(custName);
        }
        if (custSource != null) {
            criteria.andCustSourceEqualTo(custSource);
        }
        if (custIndustry != null) {
            criteria.andCustIndustryEqualTo(custIndustry);
        }
        if (custLevel != null) {
            criteria.andCustLevelEqualTo(custLevel);
        }




        return  customerMapper.selectByExample(customerExample);
    }


    /**
     * 分页查询客户列表数据
     * @param queryVo 查询参数
     * @return
     */
    public Page<Customer> pageCustomersList(QueryVo queryVo) {

        //计算开始索引
        //第一页:0 ,第二页 10
        int start = (queryVo.getPage() - 1) * queryVo.getRows();
        queryVo.setStart(start);


        //查询客户列表数据
        List<Customer> list = customerMapper.queryCustomerList(queryVo);


        //统计总记录数

        Integer totals = customerMapper.countCustomers(queryVo);

        //创建分页对象
        Page<Customer> page = new Page<Customer>(totals, queryVo.getPage(), queryVo.getRows(),list);

        return page;
    }

    @Override
    public Customer queryCustomerById(Long id) {


        return customerMapper.selectByPrimaryKey(id);
    }

    /**
     * 更新客户
     * @param customer
     */
    @Override
    public void updateCustomer(Customer customer) {

        customerMapper.updateByPrimaryKeySelective(customer);
    }

    /**
     * 根据id删除客户
     * @param id
     *           客户id
     */
    public void deleteCustomerById(Long id) {

        customerMapper.deleteByPrimaryKey(id);

    }
}
