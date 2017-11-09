package io.zipcoder.interfaces.classes;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {

    @Test
    public void TestStudents() {

        Students test = Students.getINSTANCE();
        String expected = "Zach Stimmel";

        Student teststudent = (Student)test.findById(25);
        String actual = teststudent.getName();

        Assert.assertEquals(expected,actual);




    }

}