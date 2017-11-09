package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class ZipCodeWilmingtonTest {

   ZipCodeWilmington cohort = ZipCodeWilmington.getInstance();
   Students students = Students.getInstance();

    @Test
    public void testHostLecture() {

        Map<Student, Double> preStudyMap = cohort.getMap();
        Student preLesson = (Student) students.findById(101010);
        double studentsPreStudyTime = preStudyMap.get(preLesson);

//        double expected;
//        double otherExpected;
        //test is broken

        cohort.hostLecture(101010, 10);
        Map<Student, Double> postStudyMap = cohort.getMap();
        Student postLesson = (Student) students.findById(202020);
        double newStudentsTotalStudyTime = postStudyMap.get(postLesson);

        Assert.assertEquals(expected, studentsPreStudyTime, .01);
        Assert.assertEquals(otherExpected, newStudentsTotalStudyTime, .01);

    }

}