package io.zipcoder.interfaces;

import org.junit.*;

import java.util.Map;

public class TestZipCodeWilmington {

    ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
    Students students = Students.getInstance();

    @Test
    public void hostLectureTest() {
        Map<Student, Double> preStudyMap = zipCodeWilmington.getMap();

        Student preLesson = (Student) students.findById(1);

        double studentsPreStudyTime = preStudyMap.get(preLesson);

        double expected = 1.0;

        Assert.assertEquals(expected, studentsPreStudyTime, .01);


    }
    @Test
    public void hostLectureTest2(){
        zipCodeWilmington.hostLecture(1, 24);

        Map<Student, Double> postStudyMap = zipCodeWilmington.getMap();

        Student postLesson = (Student) students.findById(1);

        double otherExpected = 1.0;

        double newStudentsTotalStudyTime = postStudyMap.get(postLesson);

        Assert.assertEquals(otherExpected, newStudentsTotalStudyTime, .01);
    }

}