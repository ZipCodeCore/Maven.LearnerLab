package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class testPeople {

    People people =new People();
    Instructor person1=new Instructor(22);
    Student person2 =new Student(81);


    @Test
    public void addTest() throws Exception {
        int expected=1;
        people.add(person1);
        int actual=people.getCount();


        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findByIdTest() throws Exception {
        Person expected=person2;
        people.add(person1);
        people.add(person2);
        Person actual=people.findById(81);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTestByPerson() throws Exception {
        Person expected=null;
        people.add(person1);
        people.add(person2);
        people.remove(person1);
        Person actual=people.findById(22);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTestById() throws Exception {
        Person expected=null;
        people.add(person1);
        people.add(person2);
        people.remove(81);
        Person actual=people.findById(81);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCountTest() throws Exception {
        int expected=2;
        people.add(person1);
        people.add(person2);
        int actual=people.getCount();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getArrayTest() throws Exception {
        Person [] expected=new Person [] {person1, person2};
        people.add(person1);
        people.add(person2);
        Person [] actual=people.getArray();

        //System.out.println(expected);

        Assert.assertEquals(expected[0], actual[0]);
        Assert.assertEquals(expected[1],actual[1]);
    }

    @Test
    public void removeAllTest() throws Exception {
        int expected=0;
        people.add(person1);
        people.add(person2);
        people.removeAll();
        int actual=people.getCount();

        Assert.assertEquals(expected, actual);
    }

}