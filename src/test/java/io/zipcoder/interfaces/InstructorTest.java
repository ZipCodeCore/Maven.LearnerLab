package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class InstructorTest {

    @Test
    public void testImplementation()
    {
        //Given
        Instructor instructor = new Instructor("Will", -1L);

        // When
        // When I check the type of the instructor
        // : Then
        // Then they type should be 'Teacher'
        Assert.assertTrue(instructor instanceof Teacher);

    }

    @Test
    public void testInheritance()
    {
        //Given
        Instructor instructor = new Instructor("Bill", -1L);

        //When

        //Then
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach()
    {
        //Given
        Teacher teacher = new Instructor("Tim",-1L); //Cannot instantiant an Interface
        Student student = new Student("Will", -1L);
        double numberOfHours = 72;

        //When
        teacher.teach(student, numberOfHours);
        double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(numberOfHours, actual, 0);
    }

    @Test
    public void testLecture()
    {
        //Given
        Teacher teacher = new Instructor("Tom",-1);
        Student student1 = new Student("Kathy",-1);
        Student student2 = new Student("Jake",-2);
        Student [] studentArray = new Student[]{student1, student2};
        double numberOfHours = 10;
        double expected = 5;

        //When
        teacher.lecture(studentArray, numberOfHours);

        //Then
        for (Student student : studentArray)
        {
            double actual = student.getTotalStudyTime();
            Assert.assertEquals(expected, actual, 0);


        }
    }


}
