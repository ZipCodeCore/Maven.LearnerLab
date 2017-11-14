package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test

    public void testImplementation(){

        Student student = new Student(12);

        Learner learner;

        Assert.assertTrue(student instanceof Learner);

    }
    @Test
    public void testInheritance(){

        Student student = new Student(12);

        Person person = new Person("raul");

        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn(){

        Student student = new Student(12);

        student.learn(78);

        double expected = 78;

        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);

    }







}
