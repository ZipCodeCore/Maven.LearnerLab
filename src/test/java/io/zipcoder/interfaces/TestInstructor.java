package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor(Long.MAX_VALUE,"Dusty");

        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor(Long.MIN_VALUE,"DaeDae");

        Assert.assertTrue(instructor instanceof Person);
    }
    
    @Test
    public void testTeach(){
        Instructor instructor = new Instructor(Long.MIN_VALUE, "KidCudi");
        Learner student = new Student(Long.MAX_VALUE, "KanyeWest", 23.0);
        double numberOfHours = 10.0;
        
        instructor.teach(student, numberOfHours);
        Double expected = 33.0;
        Double actual = student.getTotalStudyTime();
        
        Assert.assertEquals(expected, actual);
        
    }
}
