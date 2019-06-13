package com.lyn.demo.filter.impl;

import java.util.ArrayList;
import java.util.List;

import com.lyn.demo.filter.Criteria;
import com.lyn.demo.filter.Person;

public class CriteriaOr implements Criteria{
    private Criteria firstCriteria;
    
    private Criteria secondCriteria;


    public CriteriaOr(Criteria firstCriteria, Criteria secondCriteria){
        this.firstCriteria = firstCriteria;
        this.secondCriteria = secondCriteria;
    }
    
    @Override
    public List<Person> filterCriteria(List<Person> list){
        List<Person> fisrtList = firstCriteria.filterCriteria(list);
        List<Person> secondList = secondCriteria.filterCriteria(list);
        for(Person person :secondList)
        {
            if(!fisrtList.contains(person))
            {
                fisrtList.add(person);
            }
        }
        return fisrtList;
    }
}
