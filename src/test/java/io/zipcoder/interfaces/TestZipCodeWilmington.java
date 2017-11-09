package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;


public class TestZipCodeWilmington {
    Instructor leon = new Instructor(1);
    ZipCodeWilmington zipcode = ZipCodeWilmington.getINSTANCE();
    Students students = Students.getINSTANCE();

    @Test
    public void testHostLecture() {
        double expected = 0;
        double expected1 = 3;

        Map<Student, Double> preStudyMap = zipcode.getStudyMap();
        Student preLecture = (Student) students.findById(10);

        double thisStudentsPreTotalStudyTime = preStudyMap.get(preLecture);

        zipcode.hostLecture(leon, 72);

        Map<Student, Double> postStudyMap = zipcode.getStudyMap();
        Student postLecture = (Student) students.findById(15);

        double newStudentsTotalStudyTime = postStudyMap.get(postLecture);

        Assert.assertEquals(expected, thisStudentsPreTotalStudyTime, 0.01);
        Assert.assertEquals(expected1, newStudentsTotalStudyTime, 0.01);

    }

    @Test
    public void testHostLecture2(){
        Map<Student, Double> preStudyMap = zipcode.getStudyMap();
        Student preLecture = (Student) students.findById(12);

        double studentPreTotalStudyTime = preStudyMap.get(preLecture);

        zipcode.hostLecture(1, 96);

        Map<Student, Double> postStudyMap = zipcode.getStudyMap();
        Student postLecture = (Student) students.findById(22);

        double newStudentTotalStudyTime = postStudyMap.get(postLecture);

        Assert.assertEquals(0, studentPreTotalStudyTime, 0.01);
        Assert.assertEquals(4, newStudentTotalStudyTime, 0.01);
    }
}
