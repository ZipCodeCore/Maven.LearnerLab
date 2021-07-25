package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        //given
        String name = "Farland";
        Long id = 7463L;

        //when
        Object student = new Student(id, name);

        //then
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){
        //given
        String name = "Farland";
        Long id = 7463L;

        //when
        Object student = new Student(id, name);

        //then
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn(){
        //given
        String name = "Farland";
        Long id = 7463L;
        Student student = new Student(id, name);

        //when
        Double hours = 4.0;
        student.learn(hours);
        Double actual = student.getTotalStudyTime();

        //then
        Assert.assertEquals(hours, actual);

    }
}
