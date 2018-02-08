package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EducatorTest {
    Instructor instructor = new Instructor(123, "Hook");
    Educator Tariq = Educator.Tariq;
    double initialTimeWorked = Tariq.getTimeWorked();
    Student testStudent = new Student(2,"Mary");


   @Test
   public void getTimeWorked(){
       double expected = 20;
       Tariq.teach(testStudent,20);
       double actual = testStudent.getTotalStudyTime();
       Assert.assertEquals(expected,actual,0);
   }


    @Test
    public void teachTest(){

        double expected = 20;
        Tariq.teach(testStudent,20.0);
        double actual = testStudent.getTotalStudyTime();
        Assert.assertEquals(expected,actual,0);
        Assert.assertEquals(initialTimeWorked+20, Tariq.getTimeWorked(),0);
    }
    @Test

    public void testImplementation(){
        boolean instructorIsTeacher;

        if(instructor instanceof Teacher){
            instructorIsTeacher = true;
        }else {
            instructorIsTeacher = false;
        }

        Assert.assertTrue(instructorIsTeacher);
    }
    @Test
    public void testInheritance(){
        boolean instructorIsPerson;

        if(instructor instanceof Person){
            instructorIsPerson = true;
        }else {
            instructorIsPerson = false;
        }

        Assert.assertTrue(instructorIsPerson);
    }

    @Test
    public void testLecture(){
        instructor.teach(testStudent,10);

        double expected = 10;
        double actual = testStudent.getTotalStudyTime();
        Assert.assertEquals(expected,actual,0);
    }


}