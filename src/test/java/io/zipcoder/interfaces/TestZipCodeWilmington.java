package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestZipCodeWilmington {
    @Test
    public void testHostLectureByTeacher() {
        //declarations
        ZipCodeWilmington zcwINSTANCE = ZipCodeWilmington.getInstance();
        Students students = Students.getInstance();
        Instructors instructors = Instructors.getInstance();
        double numberOfHours = 7;
        Instructor instructor = instructors.findById(103L);
        zcwINSTANCE.hostLecture(instructor,7);
        Student grace= students.findById(5L);
Assert.assertEquals(17.63,grace.getTotalStudyTime(),0.01);
    }
    @Test
    public void testHostLectureByStudent() {
        //declarations
        ZipCodeWilmington zcwINSTANCE = ZipCodeWilmington.getInstance();
        Students students = Students.getInstance();
        Instructors instructors = Instructors.getInstance();
        double numberOfHours = 110;
      Student student= students.findById(10L);
        zcwINSTANCE.hostLecture(103L,110);
        Student Ryan= students.findById(10L);
        Assert.assertEquals(14.0,Ryan.getTotalStudyTime(),0.01);
    }

}






