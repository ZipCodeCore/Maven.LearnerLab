package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testStudent(){
        Student student= new Student(23,"Serene",12);
        boolean expected = true;
        boolean actual= student instanceof Learner;

        Assert.assertEquals(expected,actual);
        boolean expected1= true;
        boolean actual1= student instanceof Person;
        Assert.assertEquals(expected1,actual1);

    }
    @Test
    public void testLearn(){
        Student student2= new Student(24,"Serene",8.9);
        double expected= 20.9;
        student2.learn(12);
        double actual= student2.getTotalStudyTime();
        System.out.println(expected+" "+actual);
        Assert.assertEquals(expected,actual,.00);

    }

}
