package com.hhb.crm.web.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hhb.crm.pojo.BaseDict;
import com.hhb.crm.pojo.Customer;
import com.hhb.crm.pojo.QueryVo;
import com.hhb.crm.service.BaseDictService;
import com.hhb.crm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName : CustomerController
 * @Author : River
 * @Description (这里用一句话描述这个类的作用)
 * @Date: Create in 17:09 2018/6/30
 * @Modified By:
 */

@Controller
@RequestMapping("cust")
public class CustomerController {

    //注入BaseDictService
    @Autowired
    private BaseDictService baseDictService;

    //注入customerService
    @Autowired
    private CustomerService customerService;

    /**
     * 查询客户列表
     */
    @RequestMapping("/list")
    public String list(QueryVo queryVo, Model model){

        /**
         * 综合查询条件初始化
         */
        // 客户来源 002 : fromType
        List<BaseDict> fromType = baseDictService.queryBaseDictByTypeCode("002");
        //所属行业 : 001 industryType
        List<BaseDict> industryType = baseDictService.queryBaseDictByTypeCode("001");
        //客户级别 006 : levelType
        List<BaseDict> levelType = baseDictService.queryBaseDictByTypeCode("006");


        //响应综合查询条件数据
        model.addAttribute("fromType", fromType);
        model.addAttribute("industryType", industryType);
        model.addAttribute("levelType", levelType);


/*
        //分页查询客户列表数据
        Page<Customer> page = customerService.pageCustomersList(queryVo);*/

        PageHelper.startPage(queryVo.getPage(), 10);
        List<Customer> custList = customerService.queryCustomer(queryVo);

        PageInfo<Customer> pageInfo = new PageInfo<Customer>(custList);


        //响应客户列表数据
        model.addAttribute("page", pageInfo);

        //数据回显
        model.addAttribute("custName", queryVo.getCustName());
        model.addAttribute("custSource", queryVo.getCustSource());
        model.addAttribute("custIndustry", queryVo.getCustIndustry());
        model.addAttribute("custLevel", queryVo.getCustLevel());

        return "customer";
    }


    @RequestMapping("/edit")
    @ResponseBody
    public Customer queryCustomerById(Long id){

        Customer customer = customerService.queryCustomerById(id);

        return customer;

    }

    @RequestMapping("/update")
    @ResponseBody
    public void updateCustomer(Customer customer){

        customerService.updateCustomer(customer);


    }


    @RequestMapping("/delete")
    @ResponseBody
    public void deleteCustomerById(Long id){

        customerService.deleteCustomerById(id);
    }





}
