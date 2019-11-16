package io.zipcoder.interfaces;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

 public class EducatorTest {

    @Test
    public void testImplementation() {
        Assert.assertTrue(Educator.DOLIO instanceof Teacher);
    }

    @Test
    public void testTeach() {
        Student student = new Student(23,"Miff");
        Educator.KRIS.teach(student, 12);
        Assert.assertEquals(12, student.getTotalStudyTime(), .01);
        Assert.assertEquals(12, Educator.KRIS.getTimeWorked(), .01);
    }

    @Test
    public void testLecture() {
        Student student1 = new Student(23,"Miff");
        Student student2 = new Student(24,"Biff");
        Educator.FROILAN.lecture(new Student[]{student1,student2}, 12);
        Assert.assertEquals(6, student1.getTotalStudyTime(), .01);
        Assert.assertEquals(6, student2.getTotalStudyTime(), .01);
        Assert.assertEquals(12, Educator.FROILAN.getTimeWorked(), .01);
    }
}
