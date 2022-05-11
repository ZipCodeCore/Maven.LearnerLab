package io.zipcoder.interfaces;
import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {
    ZipCodeWilmington zcw = ZipCodeWilmington.getInstance();

    @Test
    public void testHostLecture(){
        Students cohort = Students.getInstance();
        Instructors cohortInstructors = Instructors.getInstance();

        Student[] ppl = cohort.getStudentArray();
        Instructor instructor1 = new Instructor("Kris");

        zcw.hostLecture( instructor1,45);
        // When
        double expected = 3;
        double actual = ppl[0].getTotalStudyTime();
        //Then
        Assert.assertEquals(expected, actual,0.01);


    }
}
