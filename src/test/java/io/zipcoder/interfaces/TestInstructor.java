package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementation(){
        Instructor i = new Instructor(1, "Dolio");

        Assert.assertTrue(i instanceof Teacher);
    }
    @Test
    public void testInheritance(){
        Instructor i = new Instructor(1, "Dolio");

        Assert.assertTrue(i instanceof Person);
    }
    @Test
    public void testTeach(){
        Instructor i = new Instructor(2, "Bobbu");
        Student student = new Student(1, "Timmy");
        i.teach(student, 5.0);
        Assert.assertEquals(5, student.getTotalStudyTime(), .00001);
        i.teach(student, 4.0);
        Assert.assertEquals(9, student.getTotalStudyTime(), .0001);
    }
    @Test
    public void testLecture(){
        Instructor i = new Instructor(2, "Babadook");
        Student s1 = new Student(1, "Grace");
        Student s2 = new Student(2, "Barry");
        Student s3 = new Student(3, "Joby");
        Student[] sArr = {s1, s2, s3};
        i.lecture(sArr, 9.0);
        Assert.assertEquals(3, s1.getTotalStudyTime(), .00001);
        Assert.assertEquals(3, s2.getTotalStudyTime(), .00001);
        Assert.assertEquals(3, s3.getTotalStudyTime(), .00001);
    }
}