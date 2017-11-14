package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class testPeople {

    People people =Instructors.getInstance();
    Student person3 =new Student(81);
    Student person4 =new Student(82);


    @Test
    public void addTest() throws Exception {
        int expected=5;
        people.add(person3);
        int actual=people.getCount();


        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findByIdTest() throws Exception {
        Person expected=person3;
        people.add(person3);
        people.add(person4);
        Person actual=people.findById(81);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTestByPerson() throws Exception {
        Person expected=null;
        people.add(person3);
        people.add(person4);
        people.remove(person3);
        Person actual=people.findById(81);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTestById() throws Exception {
        Person expected=null;
        people.add(person3);
        people.add(person4);
        people.remove(82);
        Person actual=people.findById(82);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCountTest() throws Exception {
        int expected=4;
        people.add(person3);
        people.add(person4);
        int actual=people.getCount();


        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getArrayTest() throws Exception {
       // Person<Person>[] expected=new Person<Person>[] {person1, person2};
        people.add(person3);
        people.add(person4);
        //Person[] actual=people.getArray();

        //System.out.println(expected);

        //Assert.assertEquals(expected[0], actual[0]);
        //Assert.assertEquals(expected[1],actual[1]);
    }

    @Test
    public void removeAllTest() throws Exception {
        int expected=0;
        people.add(person3);
        people.add(person4);
        people.removeAll();
        int actual=people.getCount();

        Assert.assertEquals(expected, actual);
    }

}