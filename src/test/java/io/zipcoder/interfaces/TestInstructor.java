package io.zipcoder.interfaces;

import org.junit.*;


public class TestInstructor {
    Instructor instructor = new Instructor(0, "Tariq");

    @Test
    public void testImplementation(){
        boolean instructorIsTeacher;

        if (instructor instanceof Teacher) {
            instructorIsTeacher = true;
        } else {
            instructorIsTeacher = false;
        }

        Assert.assertTrue(instructorIsTeacher);
    }

    @Test
    public void testInheritance() {
        boolean instructorIsPerson;

        if (instructor instanceof Person) {
            instructorIsPerson = true;
        } else {
            instructorIsPerson = false;
        }

        Assert.assertTrue(instructorIsPerson);
    }


    @Test
    public void testTeach(){
        Student student = new Student(1, "Aaron Heiron");
        instructor.teach(student,20);

        double expected = 20;
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void testLecture(){
        Student student = new Student(1,"Aaron Heiron");
        instructor.teach(student,10);

        double expected = 10;
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);

    }

}