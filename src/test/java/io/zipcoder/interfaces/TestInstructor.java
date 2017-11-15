package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    Instructor instructor= new Instructor(34,"Leon");
    Student student1= new Student(23,"Merin",10);
    Student student2= new Student(24,"Lina",3);
    Student student3= new Student(25,"Sam",1);
    @Test

    public void testInstructor(){
        /***********instructor instanceof Teacher*********/

        Assert.assertTrue(instructor instanceof Teacher);
        /****************instructor instanceof Person********/

        Assert.assertTrue(instructor instanceof Person);
        /*********to test teach()*********/

        instructor.teach(student1,2);
        double expected= 12.00;
        double actual= student1.getTotalStudyTime();
        System.out.println(actual);
        Assert.assertEquals(expected,actual,.00);

    }
    @Test
    public void testLecture(){
        Learner[] learnerArray= {student1,student2,student3};
        instructor.lecture(learnerArray,9);
        double expected= 13;
        double actual= student1.getTotalStudyTime();
        System.out.println(actual);
        Assert.assertEquals(expected,actual,.00);
    }
}
