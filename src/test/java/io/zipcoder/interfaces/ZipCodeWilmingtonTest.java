package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class ZipCodeWilmingtonTest {

    @Test
    public void testHostLecture(){
        Students students = ZipCodeWilmington.getStudents();
        Person[] instructors = Instructors.getINSTANCE().getArray();
        Teacher teacher = (Teacher) instructors[0];
        ZipCodeWilmington.hostLecture(teacher, 10.9);
        double postTotalStudentStudyTime = students.getTotalStudyTime();

        Assert.assertEquals(postTotalStudentStudyTime, 10.9, 0.001);


    }

    @Test
    public void testHostLectureById(){
        Students students = ZipCodeWilmington.getStudents();
        Instructor instructor = (Instructor)Instructors.getINSTANCE().findById(0);
        ZipCodeWilmington.hostLecture(instructor.getId(), 100);
        double postTotalStudentStudyTime = students.getTotalStudyTime();


            Assert.assertEquals(postTotalStudentStudyTime, 100, 0.001);
    }

    @Test
    public void testHostLectureByEducator(){
        Students students = ZipCodeWilmington.getStudents();
        ZipCodeWilmington.hostLecture(Educator.TARIQ, 10.9);
        double postTotalStudentStudyTime = students.getTotalStudyTime();

        Assert.assertEquals(postTotalStudentStudyTime, 10.9, 0.001);


    }
}
