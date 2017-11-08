package io.zipcoder.interfaces;

//Part 5.0 - Test Instructor DO FOR EDUCATOR
//
//        Create a TestInstructor class.
//        Create a testImplementation method that asserts that an Instructor is an instanceof a Teacher.
//        Create a testInheritance method that asserts that a Instructor is an instanceof a Person.
//        Create a testTeach method that ensures when an Instructor invokes the .teach method, a respective student's
//        totalStudyTime instance variable is incremented.
//        Create a testLecture method that ensures when an Instructor invokes the .teach method, a respective student's
//        totalStudyTime instance variable is incremented by the specified numberOfHours.

import org.junit.Assert;
import org.junit.Test;

public class EducatorTest {

    @Test
    public void testEducatorHostLecture() {
        ZipCodeWilmington zippers = ZipCodeWilmington.getINSTANCE();

        zippers.hostLecture(Educator.TARIQ, 4);
        zippers.hostLecture(Educator.DOLIO, 3);
        zippers.hostLecture(Educator.LEON, 2);

        String expected = "Name: LEON\nID: 1\nHrs: 2.0";

        String actual = "Name: " + Educator.LEON.getInstructor().getName();
        actual += "\nID: " + Educator.LEON.getInstructor().getId();
        actual += "\nHrs: " + Educator.LEON.getTimeworked();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testEducatorTeach() {

        ZipCodeWilmington zippers = ZipCodeWilmington.getINSTANCE();
        Student student = new Student(9876);

        Educator.LEON.teach(student, 10);

        double expected = 10.0;
        double actual = student.getTotalStudyTime();

        Assert.assertTrue(expected == actual);

    }

}


