package io.zipcoder.interfaces;

import io.zipcoder.interfaces.Learner;
import io.zipcoder.interfaces.Person;
import io.zipcoder.interfaces.Student;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestStudent {

    @Test
    public void testImplementation() {
        boolean studentIsLearner;

        Student newStudent = new Student(123456789, "Martha");
        if (newStudent instanceof Learner) {
            studentIsLearner = true;
        } else {
            studentIsLearner = false;
        }
        Assert.assertTrue(studentIsLearner);
    }
    @Test
    public void testInheritance() {
        Student newStudent = new Student(123456789, "Martha");
        boolean studentIsPerson;

        if (newStudent instanceof Person) {
            studentIsPerson = true;
        } else {
            studentIsPerson = false;
        }
        Assert.assertTrue(studentIsPerson);
    }

    @Test
    public void testLearn(){
        Student newLearner = new Student(12345, "Biff");
        newLearner.learn(10);

        double expected = 10;
        double actual = newLearner.getTotalStudyTime();

        Assert.assertEquals(expected,actual,0);


    }

}