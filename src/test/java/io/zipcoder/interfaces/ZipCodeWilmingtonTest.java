package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {

    @Test
    public void hostLecture() {
        List<Student> cohort = Students.getInstance();
        List<Instructor> teachers = Instructors.getInstance();

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

        ZipCodeWilmington testZCW = new ZipCodeWilmington();

        testZCW.hostLecture(30L,90);

        Double expected = 30.0;
        Double actual = 0.0;
        for (Student eachStudent : cohort){
            actual = eachStudent.getTotalStudyTime();
            Assert.assertEquals(expected,actual,0.0);
        }

    }

    @Test
    public void testHostLecture() {

        List<Student> cohort = Students.getInstance();
        List<Instructor> teachers = Instructors.getInstance();

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

        ZipCodeWilmington testZCW = new ZipCodeWilmington();

        testZCW.hostLecture(instructor2,90);

        Double expected = 30.0;
        Double actual = 0.0;
        for (Student eachStudent : cohort){
            actual = eachStudent.getTotalStudyTime();
            Assert.assertEquals(expected,actual,0.0);
        }
    }
}