package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementation(){
        Instructor instructor=new Instructor(Long.MIN_VALUE,"");
        Assert.assertTrue(instructor instanceof Teacher);
    }
    @Test
    public void testInheritance(){
        Instructor instructor=new Instructor(Long.MIN_VALUE,"");
        Assert.assertTrue(instructor instanceof Person);
    }
    @Test
    public void testTeach(){
        Instructor instructor=new Instructor(Long.MIN_VALUE,"");
        Student student=new Student(Long.MIN_VALUE,"",2);
        Double expectedTotalStudyTime=4.0;
        instructor.teach(student,2);
        Double actualTotalStudyTime=student.getTotalStudyTime();
        Assert.assertEquals(expectedTotalStudyTime,actualTotalStudyTime);
        Assert.assertEquals(expectedTotalStudyTime,actualTotalStudyTime,0.0);
    }
    @Test
    public void testLecture(){
        Instructor instructor=new Instructor(Long.MIN_VALUE,"Froilan");
        Student s1=new Student(64L,"Usha",3);
        Student s2=new Student(23L,"Mike",6);
        Student[] vidyrthi={s1,s2};
       instructor.lecture(vidyrthi,8.0);
       Assert.assertEquals(7,s1.getTotalStudyTime(),0.0);
       Assert.assertEquals(10,s2.getTotalStudyTime(),0.0);
    }

}
