package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentsTest {
    @Test
    public void testStudents(){
        Students testInstance1 = Students.getInstance();
        Students testInstance2 = Students.getInstance();

        //given
     testInstance1.add(new Student(0L));
     testInstance2.add(new Student(1L));

     Assert.assertEquals(testInstance1, testInstance2) ;
    }
}
