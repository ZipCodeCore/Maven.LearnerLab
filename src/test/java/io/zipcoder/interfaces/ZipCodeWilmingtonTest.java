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
        zcw = ZipCodeWilmington.getINSTANCE();
        //Create instructor WITH NAME!
        froilan = new Instructor(21);
        //Create students
        kay = new Student(123);
        bo = new Student(124);
        //add students to instance
        testStudents.add(kay);
        testStudents.add(bo);
        //call method
        zcw.hostLecture(froilan, 12);
        //When
        double expected = 6;
        double actual = kay.getTotalStudyTime();
        //Then
        Assert.assertEquals(expected, actual, .01);
    }

}