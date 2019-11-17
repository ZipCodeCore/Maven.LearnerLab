package io.zipcoder.interfaces;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class TestPeople {



    @Test
    public void addTest(){
        Person p1=new Person(12L,"Kendra");
        Person p2=new Person(13L,"Ron");


People people=new People();
        people.add(p1);
        people.add(p2);
        Assert.assertTrue(people.contains(p1));
        Assert.assertTrue(people.contains(p2));
    }

    @Test
    public void testRemove(){
        Person p1=new Person(12L,"Kendra");
        Person p2=new Person(13L,"Ron");
        //People people=new People(personList);
        People people=new People();
        people.remove(p1);
        Assert.assertFalse(people.contains(p1));
    }
    @Test
    public void testFindById(){
        Person p1=new Person(12L,"Kendra");
        Person p2=new Person(13L,"Ron");
        People people=new People();
        people.add(p1);
        people.add(p2);
        Person expected=p2;
        System.out.println(expected);
        Person actual=people.findById(13L);
        System.out.println(actual);
        Assert.assertEquals(expected,actual);
    }

}
