package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class InstructorTest {

    @Test
    public void testImplementation(){
        //Given
            //given that there is an instructor
            Instructor instructor = new Instructor(-1);

        //When
            //when I check the type of instructor
        //Then
            //then the type should be 'Teacher'
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        //Given
            //given that there is an instructor
        Instructor instructor = new Instructor(-1);

        //When
            //when I check the type of the instructor
        //Then
            //then the type should be "Person"

        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        //Given
            Teacher teacher = new Instructor(-1);
            Student student = new Student(-1);
            double numberOfHours = 72;

        //When
            //the instructor teachers the learner for the specified num of hours
            teacher.teach(student,numberOfHours);
            double actual = student.getTotalStudyTime();

        //Then
            Assert.assertEquals(numberOfHours, actual, 0);
    }

    @Test
    public void testLecture(){
        //Given
            //
        Teacher teacher = new Instructor(-1);
        Student student1 = new Student(-1);
        Student student2 = new Student(-2);
        Student[] studentArray = new Student[]{student1, student2};
        double numberOfHours = 10;
        double numberOfHoursPerStudent = 5;

        //When
            //
            teacher.lecture(studentArray, numberOfHours);

        //Then
        for (Student element: studentArray) {
            double numberOfHoursStudied = student1.getTotalStudyTime();
            double actual = numberOfHoursStudied;
            Assert.assertEquals(numberOfHoursPerStudent, actual, 0);

        }


    }
}
