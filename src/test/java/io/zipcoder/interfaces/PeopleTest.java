package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class PeopleTest {
    @Test
    public void testAdd(){
        //Given
        People people = new People();
        Person expected = new Person(-1L);


        //when
        people.add(expected);
        Person actual = people.findById(expected.getId());


        //then
        Assert.assertEquals(expected, actual);


    }
    @Test
    public void testremove(){
        //Given
        People people = new People();
        Person person = new Person(-1L);
        Person expected = null;
        people.remove(expected);
        //when

        Person actual = people.findById(person.getId());


        //then
        Assert.assertEquals(expected,  actual);
    }
    @Test
    public void testFindById(){
        long id = -1;
        People people = new People();
        Person expected = new Person(id);
        people.add(expected);
//when
       Person actual = people.findById(id);
//Then
       Assert.assertEquals(expected, actual);

    }
}
