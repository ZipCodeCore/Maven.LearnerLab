package io.zipcoder.interfaces;

import io.zipcoder.interfaces.donald.fountain.classroomLab.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Map;

public class TestZipCodeWilmington {
    // ZipCodeWilmington cohort = ZipCodeWilmington.getInstance();
    //Instructors instructor = Instructors.getInstance();
    Students students = Students.getInstance();


    @Test
    public void testHostLecture() {
        testHostLecture(Instructors.getInstance().getArray());
    }

    private void testHostLecture(Instructor[] array) {
        for(Instructor instructor : array) {
            // Given
            double numberOfHours = 26;
            Map<Student, Double> preLectureMap = students.getStudyMap();

            // When
            instructor.lecture(students.getArray(), numberOfHours);
            Map<Student, Double> postLectureMap = students.getStudyMap();

            // Then
            Assert.assertNotEquals(preLectureMap.values(), postLectureMap.values());
        }
    }
}


//    Teacher dolio = (Teacher) instructor.findById(1);
//    Student donald = (Student) students.findById(1);
//
//    @Test
//    public void testHostLectureByTeacherObject(){
//        int numberOfHours = 26;
//        double expected = 1;
//
//        cohort.hostLecture(dolio, numberOfHours);
//        double actual = donald.getTotalStudyTime();
//
//        Assert.assertEquals(expected, actual, 0);
//    }
//
//    @Test
//    public void testHostLectureById(){
//        int numberOfHours = 26;
//        double expected = 1;
//
//        cohort.hostLecture(1, numberOfHours);
//        double actual = donald.getTotalStudyTime();
//
//        Assert.assertEquals(expected, actual, 0);
//
//    }
//}
