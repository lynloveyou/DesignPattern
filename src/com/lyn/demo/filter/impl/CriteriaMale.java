package com.lyn.demo.filter.impl;

import java.util.ArrayList;
import java.util.List;

import com.lyn.demo.filter.Criteria;
import com.lyn.demo.filter.Person;

//过滤男性条件
public class CriteriaMale implements Criteria{
    @Override
    public List<Person> filterCriteria(List<Person> list){
        List<Person> malePersons = new ArrayList<Person>(); 
        for(Person person:list)
        {
            if("male".equalsIgnoreCase(person.getGender()))
            {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
