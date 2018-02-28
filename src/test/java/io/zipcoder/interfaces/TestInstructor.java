package io.zipcoder.interfaces;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class TestInstructor {

    Instructor instructor;
    Student student;

    @Before
    public void setUp() {
        student = new Student(1);
        instructor = new Instructor(12345678910L);
    }
    @Test
    public void testImplementation(){
        Assert.assertTrue(instructor instanceof Person);
    }
    @Test
    public void testInheritance(){
        Assert.assertTrue(instructor instanceof Person);
    }
    @Test
    public void testTeach(){
        double numberOfHoursStudentHasLearnedPriorToTeaching = student.getTotalStudyTime();
        double numberOfHoursTeacherWillTeach = 3;
        instructor.teach(student, numberOfHoursTeacherWillTeach);
        double numberOfHoursStudentHasLearnedAfterTeaching =  student.getTotalStudyTime();
        Assert.assertEquals(numberOfHoursStudentHasLearnedPriorToTeaching, numberOfHoursStudentHasLearnedAfterTeaching, numberOfHoursTeacherWillTeach);
        // number of hours prior to learning, then the instructor teaches which the student in turn learns
        // then we get the number of hours they've learned and the difference between them (delta)
    }
    @Test
    public void testLecture(){
        Student student1 = new Student(1);
        Student student2 = new Student(2);
        Student student3 = new Student(3);
        //create three new students

        Student[] stuArr = {student1, student2, student3};
        //create new student array with students in it

        double numberOfHoursOfLecture = 9;
        instructor.lecture(stuArr, numberOfHoursOfLecture);

        double expected = 3;
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 3);
    }
}
