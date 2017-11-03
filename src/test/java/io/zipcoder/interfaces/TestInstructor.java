package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    Instructor instructor = new Instructor(123,"Leon");
    Student student = new Student(12345,"Lina",5);
    Student student2 = new Student(123456, "Merin",3);
    @Test
    public void testImplementation(){

        Assert.assertTrue(instructor instanceof Teacher);

        Assert.assertTrue(instructor instanceof Person);

    }
    @Test
    public void testTeach(){
        instructor.teach(student,4);
        double expected = 9;
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected,actual,.01);
    }
    @Test
    public void testLecture(){
        Learner[] studentArray = {student,student2};
        instructor.lecture(studentArray, 10);
        double expected = 8;
        double actual = student2.getTotalStudyTime();
        System.out.println(actual);
        Assert.assertEquals(expected,actual,.01);

    }
}
