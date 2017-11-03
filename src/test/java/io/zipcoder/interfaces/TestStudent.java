package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation(){
        Student student = new Student(12345,"Lina",10);
        boolean expected = true;
        boolean actual = student instanceof Learner ;
        Assert.assertEquals(expected,actual);

        boolean actual1 = student instanceof Person;
        Assert.assertEquals(expected,actual1);

    }
    @Test
    public void testLearn(){
        Student student1 = new Student(1234,"Lina",10);
        double expected = 13.5;
        student1.learn(3.5);
        double actual = student1.getTotalStudyTime();
        System.out.println(actual);
        Assert.assertEquals(expected,actual,.01);
    }
}
