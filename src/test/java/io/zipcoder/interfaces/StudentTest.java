package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testImplementation(){
        Student student = new Student(4533, "Rob");
        boolean expected = true;
        boolean actual;

        if (student instanceof Learner){
            actual = true;
        } else {
            actual = false;
        }

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInheritance(){
        Student student = new Student(9583, "Moe");
        boolean expected = true;
        boolean actual;

        if(student instanceof Person){
            actual = true;
        } else {
            actual = false;
        }

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLearn(){
        Student student = new Student(94, "Kelly");
        double expected = 30;
        student.learn(15);
        student.learn(3);
        student.learn(12);
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0);
    }

}