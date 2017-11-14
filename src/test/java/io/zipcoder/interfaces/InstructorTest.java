package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {

    Instructor instructor=new Instructor(0,Educator.values()[0]);
    Student student=new Student(666);
    Learner [] learners= new Learner []{student, new Student(222)};


    @Test
    public void testImplementation(){
        boolean expected=true;

        boolean actual=instructor instanceof Teacher;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInheritance(){
        boolean expected=true;

        boolean actual=instructor instanceof Person;

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void teach() throws Exception {
        double expected=10;

        instructor.teach(student, 10);

        double actual=student.getTotalStudyTime();

        Assert.assertEquals(expected, actual,.00);
    }

    @Test
    public void lecture() throws Exception {
        double expected =20;

        instructor.lecture(learners, 40);

        Student one=(Student) learners[0];
        double actual = one.getTotalStudyTime();
    }

}