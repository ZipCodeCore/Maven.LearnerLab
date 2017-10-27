package io.zipcoder.interfaces;

import org.junit.Test;
import org.junit.Assert;


public class TestPeople {

    @Test
    public void testAdd(){
        People people = new People();

        for (int i=0; i<5; i++) {
            Person person = new Person();
            people.add(person);
        }
        Assert.assertEquals(5, people.getArray().length);
    }

    @Test
    public void testRemove(){
        People people = new People();
        Person person = new Person();
        for (int i=0; i<5; i++) {
            person = new Person();
            people.add(person);
        }
        people.remove(person);

        Assert.assertEquals(4, people.personCount());
    }

    @Test
    public void testFindById(){
        People people = new People();
        Person tim = new Person(21907522,"tim");
        people.add(tim);

        Person person = new Person();
        for (int i=0; i<5; i++) {
            person = new Person();
            people.add(person);
        }

        person=people.findById(tim.getId());

        Assert.assertEquals(tim.getId(), person.getId(), 0.1);
    }

}
