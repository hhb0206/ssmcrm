package com.hhb.crm.pojo;

/**
 * @ClassName : QueryVo
 * @Author : River
 * @Description (这里用一句话描述这个类的作用)
 * @Date: Create in 15:40 2018/7/3
 * @Modified By:
 */

public class QueryVo {
    //客户名称
    private String custName;
    //    客户来源
    private String custSource;
    //    所属行业
    private String custIndustry;
    //    客户级别
    private String custLevel;

    //分页的参数:当前页 ,每一页显示大小,开始记录索引
    private Integer page=1; //默认查询第一页
    private Integer rows =10; //默认每页显示10条
    private Integer start;

    @Override
    public String toString() {
        return "QueryVo{" +
                "custName='" + custName + '\'' +
                ", custSource='" + custSource + '\'' +
                ", custIndustry='" + custIndustry + '\'' +
                ", custLevel='" + custLevel + '\'' +
                ", page=" + page +
                ", rows=" + rows +
                ", start=" + start +
                '}';
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustSource() {
        return custSource;
    }

    public void setCustSource(String custSource) {
        this.custSource = custSource;
    }

    public String getCustIndustry() {
        return custIndustry;
    }

    public void setCustIndustry(String custIndustry) {
        this.custIndustry = custIndustry;
    }

    public String getCustLevel() {
        return custLevel;
    }

    public void setCustLevel(String custLevel) {
        this.custLevel = custLevel;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }
}
