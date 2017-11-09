package io.zipcoder.interfaces.classes;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {

    private Students students = Students.getINSTANCE();
    private Instructors instructors = Instructors.getInstance();

    @Test
    public void testHostLecture() {
        ZipCodeWilmington test = new ZipCodeWilmington();
        String expected = "";

        test.hostLecture((Instructor) instructors.findById(0), 10);
        String actual = students.personList.get(1).getName();

        Assert.assertEquals(expected, actual);

    }

}