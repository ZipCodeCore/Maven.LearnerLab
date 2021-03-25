package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {

    @Test
    public void getInstanceTest() {

        Students test = Students.getInstance();

        int actual = test.personList.size();

        Assert.assertEquals(2, actual);
    }

    @Test
    public void getInstance2Test() {

        Students test = Students.getInstance();

        boolean person1 = false;
        boolean person2 = false;

       for(Person person : test.personList) {
           if (person.getId().equals(10L) && person.getName().equals("Sam"))
               person1 = true;
           if(person.getId().equals(20L) && person.getName().equals("Dan"))
               person2 = true;
       }

       Assert.assertTrue(person1);
       Assert.assertTrue(person2);

    }

}
