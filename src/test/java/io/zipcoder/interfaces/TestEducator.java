package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {
    @Test
    public void testImplementation(){

        //then
        Assert.assertTrue(Educator.LEON instanceof Teacher);
    }


    @Test
    public void testEducatorTeach(){
        // Given
        Instructor instructor = new Instructor(8);
        Student student = new Student(10);
        double expected = 150.00;
        // When
        Educator.KRIS.teach(student, 150.00);
        // Then
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testEducatorLecture(){
        // Given
        Instructor instructor = new Instructor(666);
        Student student0 = new Student(0);
        Student student1 = new Student(1);
        Student student2 = new Student(2);

        Student[] students = new Student[3];
        students[0] = student0;
        students[1] = student1;
        students[2] = student2;

        // When
        double expected = 50.00;
        Educator.TARIQ.lecture(students, 150);
        // Then
        double actual = student0.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testHostLectureEducator(){
        //Given

        ZipCodeWilmington.getInstance().hostLecture(Educator.KRIS,150);
        Student student = (Student) Students.getInstance().personList.get(0);
        double expected = 30;
        //When
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual,0);

    }

    @Test
    public void testEducatorGetTimeWorked(){

            //Given
            ZipCodeWilmington.getInstance().hostLecture(Educator.LEON,150);
            Student student = (Student) Students.getInstance().personList.get(0);
            double expected = 150;
            //When
            double actual = Educator.LEON.getTimeWorked();
            Assert.assertEquals(expected, actual,0);

        }
    }


