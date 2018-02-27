package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    Instructor testInstuctor = new Instructor(3);

    @Test
    public void testImplementation(){
        boolean isInstance = testInstuctor instanceof Teacher;
        Assert.assertTrue(isInstance);
    }

    @Test
    public void testInheritance(){
        boolean isPerson = testInstuctor instanceof Person;
        Assert.assertTrue(isPerson);
    }

    @Test
    public void testTeach(){
        Student testStudent = new Student(2);
        testInstuctor.teach(testStudent,10);
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
        testInstuctor.lecture(studentArray, 10);
        double expected = 5;
        double actual = testStudent.getTotalStudyTime();
        Assert.assertEquals(expected,actual,.005);
    }
}
