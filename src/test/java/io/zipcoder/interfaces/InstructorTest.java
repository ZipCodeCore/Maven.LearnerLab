package io.zipcoder.interfaces;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class InstructorTest {


    Instructor instructor1;

    @Before
    public void setUp() {
        instructor1 = new Instructor(999);

    }

    @Test
    public void testImplementation() throws Exception {
        //assertTrue(student1 instanceof Learner);

        Method methodToBeTested = instructor1.getClass().getMethod("teach", double.class);
        assertNotNull(methodToBeTested);

    }
        @Test
        public void testInheritance () throws Exception {
            assertTrue(instructor1 instanceof Person);
        }

}
