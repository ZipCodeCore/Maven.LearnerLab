package io.zipcoder.interfaces;

import io.zipcoder.interfaces.Class.Student;
import io.zipcoder.interfaces.Interface.Learner;
import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        Student student = new Student(123);

        boolean expected = true;

        boolean actual = student instanceof Learner;

        Assert.assertEquals(expected,actual);



    }

    @Test
    public void testInheritance(){
        Student student = new Student(123);
        String expected = "wes";
        student.setName(expected);
        String actual = student.getName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testLearn(){
        Student student = new Student(123);
        double expected = 25;
        student.learn(expected);
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected,actual,0);
    }


}
