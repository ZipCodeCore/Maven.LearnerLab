package io.zipcoder.interfaces;

import Interfaces.Teacher;
import org.junit.Assert;
import org.junit.Test;

public class EducatorTest {
    Student student1 = new Student("Amy", 3);
    Student student2 = new Student("Sally", 9);
    @Test
    public void implementationTest(){
        Assert.assertTrue(Educator.LEON instanceof Teacher);
    }

    @Test
    public void teachTest(){
        //Given
        double expected = 15;
        //When
        Educator.LEON.teach(student1, 15);
        double actual = student1.getTotalStudyTime();
        //Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void lectureTest(){
        //Given
        Student[] studentListTest = new Student[2];
        studentListTest[0] = student1;
        studentListTest[1] = student2;
        double expected = 70.00;
        //When
        Educator.TARIQ.lecture(studentListTest, 140);
        double actual =  student1.getTotalStudyTime();
        //Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void getTimeWorkedInTeachMethodTest(){
        //Given
        double expected = 15;
        //When
        Educator.LEON.teach(student1, 15);
        double actual = Educator.LEON.getTimeWorked();
        //Then
        Assert.assertEquals(expected, actual, 0);

    }
    @Test
    public void getTimeWorkedInLectureMethodTest(){
        //Given
        Student[] studentListTest = new Student[2];
        studentListTest[0] = student1;
        studentListTest[1] = student2;
        double expected = 140.00;
        //When
        Educator.TARIQ.lecture(studentListTest, 140);
        double actual =  Educator.TARIQ.getTimeWorked();
        //Then
        Assert.assertEquals(expected, actual, 0);
    }
}
