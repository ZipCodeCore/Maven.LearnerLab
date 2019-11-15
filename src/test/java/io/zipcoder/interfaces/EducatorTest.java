package io.zipcoder.interfaces;

import interfaces.Teacher;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EducatorTest {

    @Test
    public void testImplementation(){
        Assert.assertTrue(Educator.DOLIO instanceof Teacher);
    }

    @Test
    public void getTimeWorked() {
        Student student1 = new Student(20L,"Joe");
        Student student2 = new Student(22L,"Jack");
        Student[] students = {student1,student2};

        Educator.DOLIO.lecture(students,20);
        Double expected = 20.0;
        Double actual = Educator.DOLIO.getTimeWorked();

        Assert.assertEquals(expected,actual,0.0);
    }

    @Test
    public void teach() {
        //each student
        Student student1 = new Student(20L,"Joe");
        Educator.ROBERTO.teach(student1,10);

        double expected = 10.0;
        double actual = student1.getTotalStudyTime();

        Assert.assertEquals(expected,actual,0.0);
    }

    @Test
    public void lecture() {
        // divide per nr of students
        Student student1 = new Student(20L,"Joe");
        Student student2 = new Student(21L,"Jack");
        Student[] students = {student1,student2};

        Educator.ROBERTO.lecture(students,90);

        double expected = 45;
        double actual = student1.getTotalStudyTime();

        Assert.assertEquals(expected,actual,0.0);
    }
}