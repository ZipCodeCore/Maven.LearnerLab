package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentsTest {
    People listofPeople;

    @Before
    public void setUp() throws Exception {

        listofPeople = new People();
        long id = 0;
        for (StudentNames names : StudentNames.values()) {
            id++;
            listofPeople.add(new Student(id));
            Person person = listofPeople.findById(id);
            person.setName(names.toString());
        }
    }

    @Test
    public void getInstance() {
        Person[] expected = listofPeople.getPersonAsArray();
        Students actual = Students.getInstance();

        Assert.assertEquals(expected, actual);

    }
}