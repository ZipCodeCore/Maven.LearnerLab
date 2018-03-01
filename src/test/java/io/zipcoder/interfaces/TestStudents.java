package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
        public void testInstanceOfStudent() {
            // given
            Students students = Students.getInstance();
            students.add(new Student(12345678));
           int expected =  6;
           int actual = students.getArray().length;
            //then
            Assert.assertEquals(expected, actual);
        }
    }
   // Create a test method which ensures that each of the students
   // in your current cohort are in your Students singleton.

