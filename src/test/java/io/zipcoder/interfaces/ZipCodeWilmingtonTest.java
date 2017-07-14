package io.zipcoder.interfaces;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ZipCodeWilmingtonTest {

/*
Create a method named setup which is annotated with @Before, takes has no parameters, and returns void.
Ensure this method invokes the .fireStaff method on ZipCodeWilmington
Create a testFireStaff method which ensures that our instructorList in our ZipCodeWilmington class isEmpty upon invokation.
Create a testHireStaff method which ensures that our instructorList is populated with respective Instructor objects.
*/

    @Before
    public void setup() {
        ZipCodeWilmington.fireStaff();
    }

    @Test
    public void testFireStaff() {
        Assert.assertTrue(ZipCodeWilmington.getInstructorList().isEmpty());
    }

    @Test
    public void testHireStaff() {

        //given
        Instructor firstInstructor = new Instructor("Froilan");
        Instructor secondIntstructor = new Instructor("Tariq");
        Instructor thirdIntstructor = new Instructor("Zach");


        //when
        ZipCodeWilmington.hire(firstInstructor);
        ZipCodeWilmington.hire(secondIntstructor);
        ZipCodeWilmington.hire(thirdIntstructor);


        double actual = ZipCodeWilmington.getInstructorList().size();
        double expected = 3;

        //then
        Assert.assertEquals(expected, actual, 0);
    }


}
