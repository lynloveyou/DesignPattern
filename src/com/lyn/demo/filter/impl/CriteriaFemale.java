package com.lyn.demo.filter.impl;

import java.util.ArrayList;
import java.util.List;

import com.lyn.demo.filter.Criteria;
import com.lyn.demo.filter.Person;

//过滤女性条件
public class CriteriaFemale implements Criteria{
    @Override
    public List<Person> filterCriteria(List<Person> list){
        List<Person> femalePersons = new ArrayList<Person>();
        for(Person person:list)
        {
            if("female".equalsIgnoreCase(person.getGender()))
            {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
