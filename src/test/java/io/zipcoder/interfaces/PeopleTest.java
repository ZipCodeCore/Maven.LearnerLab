package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PeopleTest {

    People testPeople;
    Student testStudent;
    Instructor testInstructor;

    @Before
    public void setup() {
        testPeople = new People();
        testStudent = new Student(11);
        testInstructor = new Instructor(2);
    }

    @Test
    public void addTest() {
        testPeople.add(testStudent);
        testPeople.add(testInstructor);
        int expected = 2;
        int actual = testPeople.personList.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findByIdTest() {
        testPeople.add(testStudent);
        testPeople.add(testInstructor);
        Person expected = testStudent;
        Person actual = testPeople.findByID(11);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest1() {
        testPeople.add(testInstructor);
        testPeople.add(testStudent);
        Student anotherStudent = new Student(12);
        testPeople.add(anotherStudent);
        testPeople.remove(11);
        Assert.assertFalse(testPeople.personList.contains(testStudent));
    }

    @Test
    public void removeTest2() {
        testPeople.add(testStudent);
        testPeople.add(testInstructor);
        testPeople.remove(testInstructor);
        Assert.assertFalse(testPeople.personList.contains(testInstructor));
    }


    @Test
    public void getCountTest() {
        testPeople.add(testStudent);
        testPeople.add(testInstructor);
        int expected = 2;
        int actual = testPeople.getCount();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getArrayTest() {
        testPeople.add(testStudent);
        testPeople.add(testInstructor);
        int expected = 2;
        int actual = testPeople.getArray().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeAllTest() {
        testPeople.add(testStudent);
        testPeople.add(testInstructor);
        testPeople.removeAll();
        int expected = 0;
        int actual = testPeople.getCount();
        Assert.assertEquals(expected, actual);
    }


}
