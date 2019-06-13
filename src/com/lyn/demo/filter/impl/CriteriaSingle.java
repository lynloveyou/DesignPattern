package com.lyn.demo.filter.impl;

import java.util.ArrayList;
import java.util.List;

import com.lyn.demo.filter.Criteria;
import com.lyn.demo.filter.Person;

public class CriteriaSingle implements Criteria{
    @Override
    public List<Person> filterCriteria(List<Person> list){
        List<Person> singlePersons = new ArrayList<Person>();
        for(Person person:list)
        {
            if("single".equalsIgnoreCase(person.getMaritalStatus()))
            {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
