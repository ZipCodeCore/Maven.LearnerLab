package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PeopleTest extends TestCase {
    @Test
    public void testAdd(){
        //given
        Person person1=new Person(null,null);
        Person person2=new Person(null,null);
        Person person3=new Person(null,null);
        List<Person> personList=new ArrayList<Person>();
        personList.add(person1); personList.add(person2); personList.add(person3);
        People people=new People(personList);
        //when
        int expectedNoOfPersons=4;
        Person person4=new Person(null,null);
        people.add(person4);
        //then
        int actualNoOfPersons=people.count();
        Assert.assertEquals(expectedNoOfPersons,actualNoOfPersons);
    }

    @Test
    public void testRemove(){
        //given
        Person person1=new Person(9l,"Leon");
        Person person2=new Person(10l,"Dolio");
        List<Person> personList=new ArrayList<Person>();
        personList.add(person1); personList.add(person2);
        People people=new People(personList);
        //when
        people.remove(person2);
        boolean expectedValue=people.contains(person2);
        //then
        Assert.assertFalse(expectedValue);
    }

    public void testFindById(){
        //given
        Person person1=new Person(9l,"Leon");
        Person expectedValue=new Person(10l,"Dolio");
        List<Person> personList=new ArrayList<Person>();
        personList.add(person1); personList.add(expectedValue);
        People people=new People(personList);
        //when
        Person actualValue=people.findById(10l);
        //then
        Assert.assertEquals(expectedValue,actualValue);
    }
}