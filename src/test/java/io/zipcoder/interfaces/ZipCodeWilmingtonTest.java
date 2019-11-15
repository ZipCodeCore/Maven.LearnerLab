package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {

    @Before
    public void singletonReset(){
        Students students = Students.getInstance();
        for(Student s: students.personList){
            s.setTotalStudyTime(0D);
        }
    }

    @Test
    public void hostLectureByTeacherTest() {
        Students students = Students.getInstance();
        Instructors instructors = Instructors.getInstance();
        Long expectedTeacherId = 2323L;
        Teacher teacher = instructors.findByID(expectedTeacherId);
        Long expectedStudentId = 34L;
        Student student = students.findByID(expectedStudentId);
        Double numberOfHours = 12D;
        ZipCodeWilmington zipCodeWilmington = new ZipCodeWilmington();
        zipCodeWilmington.hostLecture(teacher,numberOfHours);
        Double expectedHours = 3D;

        Assert.assertEquals(expectedHours, student.getTotalStudyTime());
    }

    @Test
    public void hostLectureByIdTest() {
        Students students = Students.getInstance();
        Long expectedTeacherId = 2323L;
        Long expectedStudentId = 34L;
        Student student = students.findByID(expectedStudentId);
        Double numberOfHours = 12D;
        ZipCodeWilmington zipCodeWilmington = new ZipCodeWilmington();
        zipCodeWilmington.hostLecture(expectedTeacherId,numberOfHours);
        Double expectedHours = 3D;

        Assert.assertEquals(expectedHours, student.getTotalStudyTime());
    }

    @Test
    public void getStudyMapTest(){
        Students students = Students.getInstance();
        Long expectedTeacherId = 2323L;
        Long expectedStudentId = 34L;
        Student student = students.findByID(expectedStudentId);
        Double expectedHours = 3D;
        Double numberOfHours = 12D;
        ZipCodeWilmington zipCodeWilmington = new ZipCodeWilmington();
        zipCodeWilmington.hostLecture(expectedTeacherId,numberOfHours);
        HashMap<Student, Double> expectedHashMap = new HashMap<>();

        expectedHashMap.put(student,expectedHours);
        HashMap<Student,Double> actualHashMap = zipCodeWilmington.getStudyMap(student);

        Assert.assertEquals(expectedHashMap.get(student), actualHashMap.get(student));
    }
}