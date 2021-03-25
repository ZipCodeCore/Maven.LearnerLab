package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void getInstanceTest(){

        Instructors test = Instructors.getInstance();
        int actual = test.personList.size();

        Assert.assertEquals(2, actual);

    }
    @Test
    public void getInstanceTest2(){

        Instructors testTwo = Instructors.getInstance();

        boolean personOne = false;
        boolean personTwo = false;

        for(Person person : testTwo.personList){
            if(person.getId().equals(311412L) && person.getName().equals("Dolio"))
                personOne = true;

            if(person.getId().equals(24302L) && person.getName().equals("Roberto"))
                personTwo = true;
        }

        Assert.assertTrue(personOne);
        Assert.assertTrue(personTwo);
    }
}

