package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void testImplementation() {
        boolean studentIsLearner;

        Student newStudent = new Student(123456789, "Steven");

        if(newStudent instanceof Learner){
              studentIsLearner = true;
        } else {
            studentIsLearner = false;
        }


        Assert.assertTrue(studentIsLearner);

    }

    @Test
    public void testInheritance() {
        boolean studentIsLearner;

        Student newStudent = new Student(123456789, "Steven");

        if(newStudent instanceof Person){
            studentIsLearner = true;
        } else {
            studentIsLearner = false;
        }

        Assert.assertTrue(studentIsLearner);

    }

    @Test
    public void testlearn() {
        Student newLearn = new Student(234567891, "Gerrard");
        newLearn.learn(20);

        double expected = 30;
        double actual = newLearn.getTotalStudyTime();


        Assert.assertEquals(expected,actual,0);

    }


}