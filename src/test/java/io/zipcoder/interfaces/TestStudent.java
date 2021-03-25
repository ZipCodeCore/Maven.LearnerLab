package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation(){

        Student student=new Student(Long.MIN_VALUE,"",2);
        Assert.assertTrue(student instanceof Learner);
    }
    @Test
    public void testInheritance(){
        Student student=new Student(Long.MIN_VALUE,"",2);
        Assert.assertTrue(student instanceof Person);
    }
    @Test
    public void testLearn(){
        Student student=new Student(Long.MIN_VALUE,"",2);
        Double expectedTotalStudyTime=4.0;
        student.learn(2.0);
        Double actualTotalStudyTime=student.getTotalStudyTime();
        Assert.assertEquals(expectedTotalStudyTime,actualTotalStudyTime);
    }
}
