package com.lyn.demo.filter;

import java.util.List;

//查询规则调价
public interface Criteria{
    //过滤数据然后返回数据
    public List<Person> filterCriteria(List<Person> list);
}
