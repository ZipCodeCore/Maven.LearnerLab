package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class ZipCodeWilmingtonTest {

    @Test
    public void testhostLectureById() {
        Students cohort = Students.getInstance();
        Instructors teachers = Instructors.getInstance();

        Student student1 = new Student(20L,"Joe");
        Student student2 = new Student(21L, "Jack");
        Student student3 = new Student(22L,"Kane");

        Instructor instructor1 = new Instructor(30L,"Dolio");
        Instructor instructor2 = new Instructor(31L,"Roberto");

        cohort.add(student1);
        cohort.add(student2);
        cohort.add(student3);

        teachers.add(instructor1);
        teachers.add(instructor2);

        ZipCodeWilmington testZCW = ZipCodeWilmington.getInstance();

        testZCW.hostLecture(30L,90);

        Double expected = 30.0;
        for (Student eachStudent : cohort){
            Double actual = eachStudent.getTotalStudyTime();
            Assert.assertEquals(expected,actual,0.0);
        }

    }

    @Test
    public void testHostLectureByInstructor() {

        Students cohort = Students.getInstance();
        Instructors teachers = Instructors.getInstance();

        Student student1 = new Student(30L,"John");
        Student student2 = new Student(31L, "V");
        Student student3 = new Student(32L,"X");

        Instructor instructor1 = new Instructor(40L,"Kris");
        Instructor instructor2 = new Instructor(41L,"Chris");

        cohort.add(student1);
        cohort.add(student2);
        cohort.add(student3);

        teachers.add(instructor1);
        teachers.add(instructor2);

        ZipCodeWilmington testZCW = ZipCodeWilmington.getInstance();

        testZCW.hostLecture(instructor2,90);

        Double expected = 30.0;

        for (Student eachStudent : cohort){
            Double actual = eachStudent.getTotalStudyTime();
            Assert.assertEquals(expected,actual,0.0);
        }
    }
}