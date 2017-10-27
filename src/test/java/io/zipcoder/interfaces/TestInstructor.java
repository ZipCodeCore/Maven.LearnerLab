package io.zipcoder.interfaces;

import org.junit.Test;
import org.junit.Assert;

public class TestInstructor {

    @Test
    public void testImplementation(){
        Instructor inst = new Instructor();
        Assert.assertTrue(inst instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Instructor inst = new Instructor();
        Assert.assertTrue(inst instanceof Person);
    }

    @Test
    public void testTeach(){
        Instructor teacher = new Instructor();
        Student myself = new Student();
        teacher.teach(myself, 23.4);

        Assert.assertEquals(myself.getTotalStudyTime(), 23.4, 0.01);
    }

    @Test
    public void testLecture(){
        Instructor teacher = new Instructor();
        Student[] cohort;
        cohort = new Student[30];
        for (int i=0; i<cohort.length; i++) {
            cohort[i] = new Student();
        }
        teacher.lecture(cohort, 30);

        Assert.assertEquals(cohort[2].getTotalStudyTime(), 1, 0.01);
    }

}
