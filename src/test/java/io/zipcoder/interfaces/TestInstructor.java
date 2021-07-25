package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementation(){
        Instructor instructor=new Instructor(null,null);
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Instructor instructor=new Instructor(null,null);
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        //given
        Instructor instructor=new Instructor(null,null);
        Student student= new Student(null,null,2.0);
        Double expectedTotalTime=7.0;
        //when
        instructor.teach(student,5.0);
        //then
        Assert.assertEquals(expectedTotalTime,student.getTotalStudyTime());
    }

    @Test
    public void testLecture(){
        //given
        Instructor instructor=new Instructor(null,null);
        Student student=new Student(null,null,5.0);
        Student student1=new Student(null,null,3.0);
        Double expected=6.0;
        Double expected1=4.0;
        Student[] studentArray={student,student1};
        //when
        instructor.lecture(studentArray,2.0);
        //then
        Assert.assertEquals(expected,student.getTotalStudyTime());
        Assert.assertEquals(expected1,student1.getTotalStudyTime());
    }
}
