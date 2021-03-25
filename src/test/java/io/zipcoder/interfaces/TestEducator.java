package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestEducator {
    Educator educator = Educator.ZAN;
    Instructor instructor;
    Student student;

    @Before
    public void testCon(){
        instructor = new Instructor(11, "Zan");
        student = new Student(01, "Johnny");
    }

    @Test
    public void getTimeWorked(){
        educator.teach(student, 5);

        Double expected = 5.0;
        Double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected,actual);


    }

    @Test
    public void testImplementation(){
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
        Learner[] learners = {student};
        instructor.lecture(learners,6);

        Double expected = 6.0;
        Double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual);
    }


}
