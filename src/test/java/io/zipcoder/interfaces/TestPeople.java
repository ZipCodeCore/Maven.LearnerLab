package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    @Test
    public void addPersonTest(){
        //given
        People people = Instructors.getInstance();
        Person person2 = new Instructor(5555L, "Dr.Jay");
        int expected = 4;

        //when
        people.add(person2);
        int actual = people.count();

        //then
        Assert.assertEquals(expected, actual);
        people.remove(person2);
    }

    @Test
    public void removePersonTest(){
        //given
        People people = Students.getInstance();
        Person person1 = new Student(76767L, "James");

        people.add(person1);
        Assert.assertEquals(person1,people.findById(person1.getId()));
        //when
        people.remove(person1);



        //then
        Assert.assertEquals(null,people.findById(person1.getId()));


    }

    @Test
    public void findByIdTest(){
        //given
        People people = Students.getInstance();
        Person person1 = new Student(76767L, "James");


        //when
        people.add(person1);
        people.removeById(76767L);
        Person actual = people.findById(76767L);

        //then
        Assert.assertNull(actual);
    }
}
