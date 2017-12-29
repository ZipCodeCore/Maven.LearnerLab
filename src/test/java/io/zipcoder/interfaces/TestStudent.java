package io.zipcoder.interfaces;
import io.zipcoder.interfaces.Student;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class TestStudent {


    Student student1;


    @Before
    public void setUp() {
        student1 = new Student(111);
    }

    @Test
    public void testImplementation() {
        Assert.assertNotNull(student1 instanceof Learner);
    }

    @Test
    public void testInheritance() {


        Assert.assertNotNull(student1 instanceof Person);
    }


    //Student's totalStudyTime instance variable is
    // incremented by the specified numberOfHours by
    // invoking the .learn method.

    @Test
    public void testLearn() {

        double expected = 2;
        student1.learn(2);
        double actual = student1.getTotalStudyTime();
        Assert.assertEquals(expected, actual, .02);

    }
}



//delta = allowed variance




//
//    @Test
//    public void testImplementation() throws Exception {
//        //assertTrue(student1 instanceof Learner);
//
//        Method methodToBeTested = student1.getClass().getMethod("learn", double.class);
//        assertNotNull(methodToBeTested);
//
//    }
//
//    @Test
//    public void testInheritance() throws Exception {
//        //assertTrue(student1 instanceof Person);
//        Method methodTest = student1.getClass().getMethod("", double.class);
//        assertNotNull(methodTest);
//    }
//
//}
