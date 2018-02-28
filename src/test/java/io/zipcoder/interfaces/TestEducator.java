package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {


    @Test
    public void testImplementation(){
        boolean isInstance = Educator.Leon instanceof Teacher;
        Assert.assertTrue(isInstance);
    }


    @Test
    public void testTeach(){
        Student testStudent = new Student(2);
        Educator.Leon.teach(testStudent,10);
        double expected = 10;
        double actual = testStudent.getTotalStudyTime();
        Assert.assertEquals(expected,actual,.005);
    }

    @Test
    public void testLecture(){
        Student testStudent = new Student(1);
        Student testStudent2 = new Student(2);
        Student[] studentArray = new Student[2];
        studentArray[0] = testStudent;
        studentArray[1] = testStudent2;
        Educator.Leon.lecture(studentArray, 10);
        double expected = 5;
        double actual = testStudent.getTotalStudyTime();
        Assert.assertEquals(expected,actual,.005);
    }

    @Test
    public void testGetTimeWorked(){
        double currentTimeWorked = Educator.Leon.getTimeWorked();
        Student testStudent = new Student(1);
        Educator.Leon.teach(testStudent, 10);
        double expected = 10 + currentTimeWorked;
        double actual = Educator.Leon.getTimeWorked();
        Assert.assertEquals(actual, expected, .005);
    }
}
