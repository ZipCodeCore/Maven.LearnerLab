package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class InstructorsTest {
    @Test
    public void testInstructors(){

        Instructors testInstance1 = Instructors.getInstance();
        Instructors testInstance2 = Instructors.getInstance();

        testInstance1.add(new Instructor(0L));
        testInstance2.add(new Instructor(1L));

        Assert.assertEquals(testInstance1, testInstance2);
    }
}
//public class StudentsTest {
//    @Test
//    public void testStudents(){
//        Students testInstance1 = Students.getInstance();
//        Students testInstance2 = Students.getInstance();
//
//        //given
//        testInstance1.add(new Student(0));
//        testInstance2.add(new Student(1));
//
//        Assert.assertEquals(testInstance1, testInstance2) ;
//    }