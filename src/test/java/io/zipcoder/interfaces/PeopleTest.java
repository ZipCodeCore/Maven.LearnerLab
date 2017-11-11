package io.zipcoder.interfaces;

//Part 6.0 - Test People
//
//        Create a TestPeople class.
//        Create a testAdd method which ensures that our personList in our People class populated with respective
//        Person objects following invocation of the add method.
//        Create a testRemove method which ensures that the personList in a People object is depopulated with a
//        respective Person object following the invocation of the remove method.
//        Create a testFindById method which ensures that a respective Person object with a respective id field is
//        returned upon invocation of the findById method on a respective People object.

import org.junit.Assert;
import org.junit.Test;

import java.sql.Array;
import java.util.ArrayList;

public class PeopleTest{

    @Test
    public void addPersonTest(){

        Students people = Students.getINSTANCE();
        Student expected = new Student(1235);

        people.addPerson(expected);

        Student actual = people.findById(1235);

        Assert.assertEquals(expected,actual);


    }

    @Test
    public void removePersonTest(){
        Instructors people = Instructors.getINSTANCE();
        Instructor instructorToRemove = new Instructor(1237);

        people.addPerson(instructorToRemove);
        people.removePerson(instructorToRemove);

        int expected = 0;
        int actual = people.getCount();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeByIDTest(){
        Students people = Students.getINSTANCE();
        people.addPerson(new Student(1236));
        people.removeById(1236);

        int expected = 0;
        int actual = people.getCount();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findById(){
        Instructors people = Instructors.getINSTANCE();
        Instructor expected = new Instructor(1232);
        people.addPerson(expected);

        Person actual = people.findById(1232);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getArray(){
        Students people1 = Students.getINSTANCE();
        Student addme = new Student(1232);
        for(int i =0; i<15; i++){
            people1.addPerson(addme);
        }
        int expected = 15;
        int actual = people1.getArray().length;

        Assert.assertEquals(expected,actual);


    }
}
