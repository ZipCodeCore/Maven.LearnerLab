package io.zipcoder.interfaces;

import org.junit.*;


public class EducatorTest {
    Instructor instructor = new Instructor(0, "Tariq");
    Student student = new Student(19, "Zan Cheema");
    Educator tariq = Educator.TARIQ;

    @Test
    public void getTimeWorked(){

        double initialTimeWorked = tariq.getTimeWorked();
        double expected = 20;
        tariq.teach(student,20);
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual,0);

    }


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

        instructor.teach(student,20);

        double expected = 20;
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void testLecture(){

        instructor.teach(student,10);

        double expected = 10;
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);

    }

}