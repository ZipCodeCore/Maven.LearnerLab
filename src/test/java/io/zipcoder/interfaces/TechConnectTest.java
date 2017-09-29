package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TechConnectTest {

/*
Create a method named setup which is annotated with @Before, takes has no parameters, and returns void.
Ensure this method invokes the .removeStudents method on TechConnect
Create a testRemoveStudents method which ensures that our studentList in our TechConnect class isEmpty upon invokation.
Create a testRecruitStudent method which ensures that our studentList is populated with respective Student objects.
*/

    @Before
    public void setup() {
        TechConnect.removeStudents();
    }

    @Test
    public void testRemoveStudents() {
        Assert.assertTrue(TechConnect.getStudents().isEmpty());
    }

    @Test
    public void testRecruitStudent() {

        Student firstStudent = new Student("Jade");
        Student secondStudent = new Student("Shae");
        Student thirdStudent = new Student("Richa");

        TechConnect.recruitStudent(firstStudent);
        TechConnect.recruitStudent(secondStudent);
        TechConnect.recruitStudent(thirdStudent);

        double actual = TechConnect.getStudents().size();
        double expected = 3;

        Assert.assertEquals(expected, actual, 0);
    }

}
