package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorsTest {

    @Test
    public void getInstanceTest() {

        Instructors test = Instructors.getInstance();

        int actual = test.personList.size();

        Assert.assertEquals(3, actual);
    }

    @Test
    public void getInstance2Test() {

        Instructors test = Instructors.getInstance();

        boolean person1 = false;
        boolean person2 = false;

        for(Person person : test.personList) {
            if (person.getId().equals(100L) && person.getName().equals("Rick"))
                person1 = true;
            if(person.getId().equals(120L) && person.getName().equals("John"))
                person2 = true;
        }

        Assert.assertTrue(person1);
        Assert.assertTrue(person2);

    }

}