package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructor extends TestCase {

    @Test
    public void testImplementation(){
        //given
        Teacher instructor=new Instructor(3l,"sarangi");
        //when
        boolean expectedValue=instructor instanceof Teacher;
        //then
        Assert.assertTrue(expectedValue);
    }

    @Test
    public void testInheritance(){
        //given
        Person instructor=new Instructor(7l,"sangramjit");
        //when
        boolean expectedValue=instructor instanceof Person;
        //then
        Assert.assertTrue(expectedValue);
    }

    @Test
    public void testTeach(){
        //given
        Instructor instructor=new Instructor(5l,"pujari");
        Student student=new Student(null,null);
        double expectedValue=5.0;
        //when
        instructor.teach(student,5);
        double actualValue=student.getTotalStudyTime();
        //then
        Assert.assertEquals(expectedValue,actualValue,0);
    }

    @Test
    public void testLecture(){
        //given
        Instructor instructor=new Instructor(5l,"pujari");
        Student student1=new Student(null,null);
        Student student2=new Student(null,null);
        Student[] studentArray={student1,student2};
        double expectedValue=10/2;
        //when
        instructor.lecture(studentArray,10);
        double actualValue=student1.getTotalStudyTime();
        //then
        Assert.assertEquals(expectedValue,actualValue,0);
    }
}