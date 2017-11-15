package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;

public class TestZipCodeWilmington {

    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();
    ZipCodeWilmington cohort = ZipCodeWilmington.getInstance();

    ArrayList<Instructor> allInstructors = instructors.getArray();
    ArrayList<Student> allStudents = students.getArray();

    Educator testEducator = Educator.TARIQ_HOOK;
    Student student = allStudents.get(0);

    @Test
    public void testHostLecture(){
        cohort.hostLecture(testEducator, 28);
        double expected = 1;

        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected,actual,0);
    }

}