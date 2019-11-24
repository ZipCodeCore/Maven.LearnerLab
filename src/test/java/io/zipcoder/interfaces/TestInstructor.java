package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestInstructor {
    Instructor instructor;
    Student student;
    Student student2;

    @Before
    public void testContr(){
        instructor = new Instructor(11, "Zan");
        student = new Student(01, "Johnny");
        student2 = new Student(02, "Elliot");
    }

    @Test
    public void testImplementation(){
        boolean instructorIsTeacher;
        if(instructor instanceof Teacher){
            instructorIsTeacher= true;
        }
        else{
            instructorIsTeacher = false;
        }
        Assert.assertTrue(instructorIsTeacher);
    }

    @Test
    public void testInheritance(){
        boolean instructorIsTeacher;
        if(instructor instanceof Teacher){
            instructorIsTeacher = true;
        }
        else{
            instructorIsTeacher = false;
        }
        Assert.assertTrue(instructorIsTeacher);
    }

    @Test
    public void testTeach(){
        instructor.teach(student, 3);

        Double expectedTime = 3.0;
        Double actualTime = student.getTotalStudyTime();

        Assert.assertEquals(expectedTime, actualTime);
    }

    @Test
    public void testLecture(){
        Learner[] learners = {student, student2};
        instructor.lecture(learners,6);

        Double expected = 3.0;
        Double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual);
    }





}
