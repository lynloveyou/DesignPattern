package com.lyn.demo.filter;

import java.util.ArrayList;
import java.util.List;

import com.lyn.demo.filter.impl.CriteriaAnd;
import com.lyn.demo.filter.impl.CriteriaFemale;
import com.lyn.demo.filter.impl.CriteriaMale;
import com.lyn.demo.filter.impl.CriteriaOr;
import com.lyn.demo.filter.impl.CriteriaSingle;

public class Client{
    /**
     * 备忘录模式(Filter Pattern)
     *  Person 用户信息
     *  Criteria 过滤数据接口
     *  ConcreteCriteria 具体过滤条件
     * @param args
     */
    
    public static void main(String[] args){
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Lily", "female", "single"));
        persons.add(new Person("Lyn", "male", "single"));
        persons.add(new Person("Bob", "male", "marry"));
        persons.add(new Person("JACK", "male", "marry"));
        persons.add(new Person("Luce", "female", "marry"));
        CriteriaMale male = new CriteriaMale();
        CriteriaFemale female = new CriteriaFemale();
        CriteriaSingle single = new CriteriaSingle();
        CriteriaAnd criteriaAndMS = new CriteriaAnd(male, single);
        CriteriaAnd criteriaAndFS = new CriteriaAnd(female, single);
        CriteriaOr criteriaOrFS = new CriteriaOr(female, single);
        System.out.println("Males: ");
        printPersons(male.filterCriteria(persons));
        System.out.println("\n FeMales: ");
        printPersons(female.filterCriteria(persons));
        System.out.println("\n Single and Males: ");
        printPersons(criteriaAndMS.filterCriteria(persons));
        System.out.println("\n Single Or Females:: ");
        printPersons(criteriaOrFS.filterCriteria(persons));
        System.out.println("\n Single and Females:: ");
        printPersons(criteriaAndFS.filterCriteria(persons));
        
    }
    
    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
           System.out.println("Person : [ Name : " + person.getName() 
              +", Gender : " + person.getGender() 
              +", Marital Status : " + person.getMaritalStatus()
              +" ]");
        }
     } 

}

