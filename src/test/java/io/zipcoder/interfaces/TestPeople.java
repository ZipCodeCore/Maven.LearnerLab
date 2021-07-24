package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    @Test
    public void addPersonTest(){
        //given
        People people = new People();
        Person person1 = new Student(76767L, "James");
        Person person2 = new Instructor(5555L, "Dr.Jay");
        int expected = 2;

        //when
        people.add(person1);
        people.add(person2);
        int actual = people.count();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removePersonTest(){
        //given
        People people = new People();
        Person person1 = new Student(76767L, "James");
        Person person2 = new Instructor(5555L, "Dr.Jay");
        int expected = 1;

        //when
        people.add(person1);
        people.add(person2);
        people.remove(person1);
        int actual = people.count();
        Person present = people.personList.get(0);

        //then
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(person2, present);
    }

    @Test
    public void findByIdTest(){
        //given
        People people = new People();
        Person person1 = new Student(76767L, "James");
        Person person2 = new Instructor(5555L, "Dr.Jay");

        //when
        people.add(person1);
        people.add(person2);
        people.removeById(5555L);
        Person actual = people.findById(5555L);

        //then
        Assert.assertNull(actual);
    }
}
