package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructorsSingleton {

    @Test
    public void getInstructorsTest(){
        //given
        People people = Instructors.getInstance();
        int expected = 3;

        //when
        int actual = people.count();

        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void findByIdTest(){
        //given
        People people = Instructors.getInstance();
        Long id = 444L;
        Person expected = new Person(id, "Dolio");

        //when
        Person actual = people.findById(id);

        //then
        Assert.assertEquals(expected,actual);

    }
}
