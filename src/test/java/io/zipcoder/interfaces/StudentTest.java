package io.zipcoder.interfaces;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class StudentTest {

    Student student1;

    @Before
    public void setUp() {
        student1 = new Student(123);

    }

@Test
    public void testImplementation() throws Exception {
   //assertTrue(student1 instanceof Learner);

    Method methodToBeTested = student1.getClass().getMethod("learn", double.class);
    assertNotNull(methodToBeTested);

}

@Test
        public void testInheritance() throws Exception{
        assertTrue(student1 instanceof Person);
    }








}








