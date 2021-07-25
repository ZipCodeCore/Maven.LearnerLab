package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    @Test
    public void testAdd(){
        //given
        People people=new People();
        Person person = new Person(6l,"dumdum");
        Person person1=new Person(5l,"gumgum");
        Integer expected=2;
        //when
        people.add(person);
        people.add(person1);
        //then
        Assert.assertEquals(expected,people.count());
    }

    @Test
    public void testRemove(){
        //given
        People people=new People();
        Person person = new Person(6l,"dumdum");
        Person person1=new Person(5l,"gumgum");
        Integer expected=1;
        //when
        people.add(person);
        people.add(person1);
        people.remove(6l);
        //then
        Assert.assertEquals(expected,people.count());
    }

    @Test
    public void testRemove2(){
        //given
        People people=new People();
        Person person = new Person(6l,"dumdum");
        Person person1=new Person(5l,"gumgum");
        Integer expected=1;
        //when
        people.add(person);
        people.add(person1);
        people.remove("dumdum");
        //then
        Assert.assertEquals(expected,people.count());
    }

@Test
    public void testFindById(){
        People people = new People();
        Person person = new Person(6l,"dumdum");
        Person person1=new Person(5l,"gumgum");
        Person expected= person1;
         people.add(person);
         people.add(person1);
        //when
       Person actual= people.findById(5l);
        //then
    Assert.assertEquals(expected,actual);
}
}
