package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void learn() {
        Student student = new Student(null,null);
        Double expected = 10D;
        student.learn(expected);

        Assert.assertEquals(expected,student.getTotalStudyTime());
    }

    @Test
    public void testImplementation(){
        Student student = new Student(null,null);
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testInheritance(){
        Student student = new Student(null,null);
        Assert.assertTrue(student instanceof Learner);
    }
}