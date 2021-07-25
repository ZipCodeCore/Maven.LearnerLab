package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void instanceOfTest(){
        //given
        Student student = new Student(20L, "Bob");

        //when
        Boolean instanceOfLearner = student instanceof Learner;
        Boolean instanceOfPerson = student instanceof Person;

        //then
        Assert.assertTrue(instanceOfLearner);
        Assert.assertTrue(instanceOfPerson);
    }
    @Test
    public void learnTest(){
        //given
        Student student = new Student(34L, "Jared");

        //when
        student.learn(5);
        student.learn(3);
        double expected = 8;
        double actual = student.getTotalStudyTime();
        Boolean result = expected == actual;

        //then
        Assert.assertTrue(result);
    }



}
