package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation(){
        Student  student = new Student(null,null,null);
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){
        Student student = new Student(null,null,null);
        Assert.assertTrue(student instanceof Person );
    }

    @Test
    public void testLearn(){
        //given
        Double expectedTotalStudyTime=5.0;
        Student student=new Student(null,null,0.0);
        //when
        student.learn(5.0);
        Double actual=student.getTotalStudyTime();
        //then
        Assert.assertEquals(expectedTotalStudyTime,actual);

    }

}
