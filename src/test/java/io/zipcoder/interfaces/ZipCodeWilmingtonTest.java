package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class ZipCodeWilmingtonTest {

    @Test
    public void testhostLectureById() {
        Students cohort = Students.getInstance();
        Instructors teachers = Instructors.getInstance();

        ZipCodeWilmington.hostLecture(30L,90);

        Double expected = 30.0;
        for (Student eachStudent : cohort){
            Double actual = eachStudent.getTotalStudyTime();
            Assert.assertEquals(expected,actual,0.0);
        }

        ZipCodeWilmington.hostLecture(30L,-90);

    }

    @Test
    public void testHostLectureByInstructor() {

        Students cohort = Students.getInstance();
        Instructors teachers = Instructors.getInstance();

        ZipCodeWilmington.hostLecture(teachers.findById(30L),90);

        Double expected = 30.0;

        for (Student eachStudent : cohort){
            Double actual = eachStudent.getTotalStudyTime();
            Assert.assertEquals(expected,actual,0.0);
        }
        ZipCodeWilmington.hostLecture(30L,-90);
    }
}