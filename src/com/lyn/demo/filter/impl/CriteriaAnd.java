package com.lyn.demo.filter.impl;

import java.util.ArrayList;
import java.util.List;

import com.lyn.demo.filter.Criteria;
import com.lyn.demo.filter.Person;

public class CriteriaAnd implements Criteria{
    private Criteria firstCriteria;
    
    private Criteria secondCriteria;


    public CriteriaAnd(Criteria firstCriteria, Criteria secondCriteria){
        this.firstCriteria = firstCriteria;
        this.secondCriteria = secondCriteria;
    }


    @Override
    public List<Person> filterCriteria(List<Person> list){
        List<Person> persons = new ArrayList<Person>(); 
        persons.addAll(firstCriteria.filterCriteria(list));
        return secondCriteria.filterCriteria(persons);
    }
}
