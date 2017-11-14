package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestEducator {

    Educator educator;
    Student student1;
    Student student2;
    Student student3;
    Student[] students;

    @Before
    public void setUp(){
        educator = Educator.DOLIO;
        student1 = new Student("Uncle Bob", 1L);
        student2 = new Student("Uncle Bob", 1L);
        student3 = new Student("Uncle Bob", 1L);
        students = new Student[]{student1, student2, student3};
    }

    @Test
    public void testImplementation(){
        Assert.assertTrue(educator instanceof Teacher);
    }

    @Test
    public void testTeach(){
        educator.teach(student1,50d);

        Double expectedTime = 50d;
        Double actualTime = student1.getTotalStudyTime();

        Assert.assertEquals(expectedTime, actualTime);
    }

    @Test
    public void testLecture(){
        educator.lecture(students,300d);

        Double expectedTime = 100d;
        Double actualTime = student1.getTotalStudyTime();

        Assert.assertEquals(expectedTime, actualTime);
    }
    
}
