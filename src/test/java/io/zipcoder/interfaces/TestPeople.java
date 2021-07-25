package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPeople {
    People people = Students.getINSTANCE();;

    @Test
    public void testAdd(){
        //given
        Person person = new Person(6l,"dumdum");
        Person person1=new Person(5l,"gumgum");
        Integer expected=6;
        //when
        people.add(person);
        people.add(person1);
        //then
        Assert.assertEquals(expected,people.count());
    }

    @Test
    public void testRemove(){
        //given
        Integer expected=5;
        //when
        people.remove(4l);
        //then
        Assert.assertEquals(expected,people.count());
    }

    @Test
    public void testRemove2(){
        //given
        Integer expected=6;
        //when
        people.remove("baabaa");
        //then
        Assert.assertEquals(expected,people.count());
    }

@Test
    public void testFindById(){
        Person person = new Person(7l,"baabaa");
        Person expected= person;
         people.add(person);
//         people.add(person1);
        //when
       Person actual= people.findById(7l);
        //then
    Assert.assertEquals(expected,actual);
}
}
