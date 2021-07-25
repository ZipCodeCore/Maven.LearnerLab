package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

/**
 * Create a TestStudent class.
 * Create a testImplementation method that asserts that a Student is an instanceof a Learner.
 * Create a testInheritance method that asserts that a Student is an instanceof a Person.
 * Create a testLearn method that ensures a Student's totalStudyTime instance variable is
 * incremented by the specified numberOfHours by invoking the .learn method.
 *
 */

public class StudentTest {
    @Test
    public void studentImplementationTest(){
        Student student1 = new Student();
        Assert.assertTrue(student1 instanceof Learner);
    }

    @Test
    public void studentInheritanceTest(){
        Student student1 = new Student();
        Assert.assertTrue(student1 instanceof Person);
    }

    @Test
    public void studentLearnTest(){
        Student student1 = new Student();
        Double exp = 5.0;
        student1.learn(exp);
        Double act = student1.getTotalStudyTime();
        Assert.assertEquals(exp,act);

    }
}
