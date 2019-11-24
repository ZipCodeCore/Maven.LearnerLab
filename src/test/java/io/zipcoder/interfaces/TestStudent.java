package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestStudent {
    Student student;

    @Before
    public void testConst(){
        student = new Student(01, "Johnny");
    }

    @Test
    public void testImplementation(){
        boolean studentIsLearner;
        if(student instanceof Learner){
            studentIsLearner = true;
        }
        else{
            studentIsLearner = false;
        }

        Assert.assertTrue(studentIsLearner);
    }

    @Test
    public void testInheritance(){
        boolean studentIsPerson;
        if(student instanceof Person){
            studentIsPerson = true;
        }
        else{
            studentIsPerson = false;
        }

        Assert.assertTrue(studentIsPerson);
    }

    @Test
    public void testLearn(){
        student.totalStudyTime = 1.0;
        student.learn(1.5);

        Double expectedTime = 2.5;
        Double actualTime = student.getTotalStudyTime();

        Assert.assertEquals(expectedTime, actualTime);
    }




}
