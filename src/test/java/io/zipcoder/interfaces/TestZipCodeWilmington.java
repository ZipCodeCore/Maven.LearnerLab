package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;

public class TestZipCodeWilmington {

    @Test
    public void testHostLecture1(){

        Instructors.getInstance().createEducators();
        double preLectureStudents = 0;
        double postLectureStudents = 0;
        for(Person person : Students.getInstance().getArray()) {
            Student student = (Student) person;
            preLectureStudents += student.getTotalStudyTime();
        }


        ZipCodeWilmington.getInstance().hostLecture(1,20);
        for(Person person : Students.getInstance().getArray()) {
            Student student = (Student) person;
            postLectureStudents += student.getTotalStudyTime();
        }
        double expected = 20 + preLectureStudents;
        double actual = postLectureStudents;
//        ZipCodeWilmington.getInstance().hostLecture(1,20);
//        double expected = 5;
//        Student student = (Student) Students.getInstance().getArray()[0];
//        double actual = student.getTotalStudyTime();Assert.assertEquals(expected, actual, .005);
    }

    @Test
    public void  testHostLecture2(){
        double preLectureStudents = 0;
        double postLectureStudents = 0;
        for(Person person : Students.getInstance().getArray()) {
            Student student = (Student) person;
            preLectureStudents += student.getTotalStudyTime();
        }

        //Instructor instructor = (Instructor) Instructors.getInstance().findById(1);
        ZipCodeWilmington.getInstance().hostLecture(Educator.Leon,20);
        for(Person person : Students.getInstance().getArray()) {
            Student student = (Student) person;
            postLectureStudents += student.getTotalStudyTime();
        }
        double expected = 20 + preLectureStudents;
        double actual = postLectureStudents;

//        Student student = (Student) Students.getInstance().getArray()[0];
//        Student student2 = (Student) Students.getInstance().getArray()[1];
//        Student student3 = (Student) Students.getInstance().getArray()[2];
//        Student student4 = (Student) Students.getInstance().getArray()[3];
//        double beforeLectureStudyTime = student.getTotalStudyTime();
//        beforeLectureStudyTime += student2.getTotalStudyTime();
//        beforeLectureStudyTime += student3.getTotalStudyTime();
//        beforeLectureStudyTime += student4.getTotalStudyTime();
//        Instructor instructor = (Instructor) Instructors.getInstance().findById(1);
//        ZipCodeWilmington.getInstance().hostLecture(instructor,20);
//        double expected = 20 + beforeLectureStudyTime;
//        double actual = student.getTotalStudyTime();
//        actual += student2.getTotalStudyTime();
//        actual += student3.getTotalStudyTime();
//        actual += student4.getTotalStudyTime();

        Assert.assertEquals(expected, actual, .005);
    }

    @Test
    public void testFindById(){
        Student student5 = new Student(5);
        Students.getInstance().add(student5);
        Student actual = Students.getInstance().findById(5);
        Student expected = student5;
        Assert.assertEquals(actual, expected);
    }
}
