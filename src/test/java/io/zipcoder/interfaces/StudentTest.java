package io.zipcoder.interfaces;

import org.junit.Test;
import static org.junit.Assert.*;
public class StudentTest {
    Student s = new Student();
    @Test
    public void testImplementation(){
        assertTrue(s instanceof Learner);
    }

    @Test
    public void testInheritance(){
        assertTrue(s instanceof Person);
    }

    @Test
    public void testEnsuresTotalStudyHoursValueIsDefaultedBy0(){
        assertEquals(0.0, s.getTotalStudyTime(), 0.00001);
    }

    @Test
    public void testLearn(){
        double numberOfHours = 5.7;
        s.learn(numberOfHours);
        assertEquals(numberOfHours, s.getTotalStudyTime(), 0.00001);
    }
}
