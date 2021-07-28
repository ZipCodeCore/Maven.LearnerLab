package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPeople {
    @Test
    public void testAdd(){
        //given
        List<Person> personList = new ArrayList<Person>();
        People people = Students.getInstance();
        Person person1 = new Person(39L,"john");
        Person person2 = new Person(34L,"rob");
        Person person3 = new Person(293L,"haley");
        Person person4 = new Person(30L,"rick");

        //when
        people.addPerson(person1);
        people.addPerson(person2);
        people.addPerson(person3);
        people.addPerson(person4);

          Integer actual = people.count();
          Integer expected = 4;

        //given
        Assert.assertEquals(expected,actual);


    }
    @Test
    public void testRemove(){
        People people = Students.getInstance();
        Person person1 = new Person(null, null);
        Person person2 = new Person(null,null);

        people.addPerson(person1);
        people.addPerson(person2);

        people.removePerson(person1);

        Integer expected = people.count();
        Integer actual = 1;

        Assert.assertEquals(expected,actual);

    }
    @Test
    public void testFindById(){
        //given
        People migos = Students.getInstance();
        Person quavo = new Person(100L, "Quavo");
        Person takeoff = new Person(101L, "Takeoff");
        Person offset = new Person(102L, "Offset");

        //when
        migos.addPerson(quavo);
        migos.addPerson(takeoff);
        migos.addPerson(offset);

        Person actual = migos.findById(101L);
        Person expected = takeoff;

        //then
        Assert.assertEquals(actual,expected);
    }
}
