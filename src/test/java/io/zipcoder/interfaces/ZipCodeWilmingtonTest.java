package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {

    Student kay;
    Student bo;
    Students testStudents;
    Instructor froilan;


    private ZipCodeWilmington zcw;

    @Test
    public void getINSTANCETest() {
    }

    @Test
    public void hostLectureTest() {
        //Given
        testStudents = Students.getINSTANCE();
//        zcw = ZipCodeWilmington.getINSTANCE();
        //Create instructor WITH NAME!
        froilan = new Instructor(200);
        //Create students
        kay = new Student(1);
        bo = new Student(2);
        //add students to instance
        testStudents.add(kay);
        testStudents.add(bo);
        //call method
        ZipCodeWilmington.getINSTANCE().hostLecture(froilan, 12);
        //When
        double expected = 6;
        double actual = kay.getTotalStudyTime();
        //Then
        Assert.assertEquals(expected, actual, .01);
    }

//    @Test
//    public void hostLectureTest1() {
//        //Given
//        testStudents = Students.getINSTANCE();
//        zcw = ZipCodeWilmington.getINSTANCE();
//        //Create instructor
//        tariq = new Instructor(20);
//        testInstructors = Instructors.getINSTANCE();
//        testInstructors.add(tariq);
//        //Create students
//        kay = new Student(123);
//        bo = new Student(124);
//        //add students to instance
//        testStudents.add(kay);
//        testStudents.add(bo);
//        //call method
//        zcw.hostLecture(20, 12);
//        //When
//        double expected = 6;
//        double actual = kay.getTotalStudyTime();
//        //Then
//        Assert.assertEquals(expected, actual, .01);
//    }

}