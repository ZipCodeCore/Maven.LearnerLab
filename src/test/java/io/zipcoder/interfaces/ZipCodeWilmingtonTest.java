package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class ZipCodeWilmingtonTest {

    @Test
    public void testHostLecture(){
        ZipCodeWilmington zipcodew = ZipCodeWilmington.getInstance();
        Students cohort = Students.getInstance();
        Instructors cohortInstructors = Instructors.getInstance();

        Student[] s = cohort.getStudentArray();
        Instructor instructor1 = new Instructor(1L);

        zipcodew.hostLecture( instructor1,45);

        double expected = 9;
        double actual = s[0].getTotalStudyTime();

        Assert.assertEquals(expected, actual,0);
    }
}
