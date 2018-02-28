package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestPeople {

    @Test
    public void addPersonTest() {
        Person person1 = new Student(11);
        person1.setName("Bob");
        Students.getInstance().addPerson(person1);

        String expected = "[Anthony: 1, Bo: 2, Brian: 3, Katrina: 4, Kay: 5, Bob: 11]";
        String actual = Arrays.toString(Students.getInstance().getArray());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removePersonTest() {
        Person person1 = new Student(12);
        Person person2 = new Student(13);
        Person person3 = new Student(14);

        person1.setName("Bob");
        person2.setName("Sally");
        person3.setName("Max");

        Students.getInstance().addPerson(person1);
        Students.getInstance().addPerson(person2);
        Students.getInstance().addPerson(person3);

        Students.getInstance().remove(person1);

        String expected = "[Anthony: 1, Bo: 2, Brian: 3, Katrina: 4, Kay: 5, Sally: 13, Max: 14]";
        String actual = Arrays.toString(Students.getInstance().getArray());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findByIdTest() {

        Person person1 = new Student(12);
        Person person2 = new Student(15);
        person1.setName("Sue");
        person2.setName("Max");

        Students.getInstance().addPerson(person1);
        Students.getInstance().addPerson(person2);

        Person expected = person1;
        Person actual = Students.getInstance().findById(12);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeByIdTest() {

        Person person1 = new Student(12);
        Person person2 = new Student(15);
        person1.setName("Sue");
        person2.setName("Max");

        Students.getInstance().addPerson(person1);
        Students.getInstance().addPerson(person2);

        Students.getInstance().remove(12);

        String expected = "[Anthony: 1, Bo: 2, Brian: 3, Katrina: 4, Kay: 5, Max: 15]";
        String actual = Arrays.toString(Students.getInstance().getArray());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCountTest() {

        Person person1 = new Student(12);
        Person person2 = new Student(15);
        person1.setName("Sue");
        person2.setName("Max");

        Students.getInstance().addPerson(person1);
        Students.getInstance().addPerson(person2);

        int expected = 7;
        int actual = Students.getInstance().getCount();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeAllTest() {

        Person person1 = new Student(12);
        Person person2 = new Student(15);
        person1.setName("Sue");
        person2.setName("Max");

        Students.getInstance().addPerson(person1);
        Students.getInstance().addPerson(person2);

        Students.getInstance().removeAll();

        int expected = 0;
        int actual = Students.getInstance().getCount();

        Assert.assertEquals(expected, actual);
    }
}
