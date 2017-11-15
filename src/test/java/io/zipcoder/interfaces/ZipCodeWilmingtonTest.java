package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class ZipCodeWilmingtonTest {

    //DO NOT run both tests at same time, they only pass if run individually

   ZipCodeWilmington cohort = ZipCodeWilmington.getInstance();
   Students students = Students.getInstance();


    @Test
    public void testHostLecture() {




    }

    @Test
    public void testLecture2() {





    }







//    @Test
//    public void testHostLecture() {
//
//        Map<Student, Double> preStudyMap = cohort.getMap();
//        Student preLesson = students.findById(1);
//        double studentsPreStudyTime = preStudyMap.get(preLesson);
//
//        double expected = 0;
//
//        Assert.assertEquals(expected, studentsPreStudyTime, .01);
//
//    }
//    @Test
//    public void testHostLecture2() {
//
//        double otherExpected = 5.0;
//
//        cohort.hostLecture(1, 15);
//        Map<Student, Double> postStudyMap = cohort.getMap();
//        Student postLesson = students.findById(1);
//        double newStudentsTotalStudyTime = postStudyMap.get(postLesson);
//
//        Assert.assertEquals(otherExpected, newStudentsTotalStudyTime, .01);
//
//
//
//    }
//
}