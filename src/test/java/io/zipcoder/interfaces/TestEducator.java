package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestEducator {

    @Test
    public void testTeach() {
        Student stu = new Student(Long.valueOf(56), "Stu");
        Educator.INSTRUCTOR1.teach(stu, 5000.0);
        Assert.assertEquals(stu.getTotalStudyTime(), Educator.INSTRUCTOR1.getTimeWorked(), 2);
    }

    @Test
    public void testLecture() {
        Student stu1 = new Student(Long.valueOf(344), "Stu");
        Student stu3 = new Student(Long.valueOf(5623), "Stu");
        Student stu2 = new Student(Long.valueOf(56123), "Stu");
        Student[] stus = {stu1, stu2, stu3};
        Educator.INSTRUCTOR2.lecture(stus, 6000.0);
        Double expected = 2000.0;
        for (Student stu : stus) {
            Double actual = stu.getTotalStudyTime();
            Assert.assertEquals(expected, actual, 2);
        }
    }

    @Test
    public void testGetTimeWorked() {
        Student stu = new Student(Long.valueOf(333), "Stu");
        Educator.INSTRUCTOR0.teach(stu, 5000.0);
        Double actual = Educator.INSTRUCTOR0.getTimeWorked();
        Double expected = 5000.0;
        Assert.assertEquals(expected, actual, 2);
    }
}