package io.zipcoder.interfaces;

import static org.junit.Assert.*;
import org.junit.Test;

public class InstructorTest {
    Instructor instructor = new Instructor(0);

    @Test
    public void testImplementation(){
        assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        Student student = new Student();
        instructor.teach(student, 5.7);
        assertEquals(5.7, student.getTotalStudyTime(), 0.001);
    }

    @Test
    public void testLecture(){
        // fill an array of students
        Student[] students = new Student[5];
        students[0] = new Student(56580);
        students[1] = new Student(56581);
        students[2] = new Student(56582);
        students[3] = new Student(56583);
        students[4] = new Student(56584);

        //lecture method test
        instructor.lecture(students, 10.7);
        for(Student student : students){
            assertEquals(10.7/students.length, student.getTotalStudyTime(), 0.001);
        }
    }
}
