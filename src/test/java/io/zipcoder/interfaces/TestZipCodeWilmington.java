package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class TestZipCodeWilmington {

    @Before
    public void setUp() {
        Students students = Students.getInstance();
        for (Student student : students.personList) {
            student.totalStudyTime = 0;
        }
        Educator educator = Educator.LEON;
        educator.timeWorked = 0;
    }

    @Test
    public void hostLectureTest_CheckStudentStudyTime() {
        // Given
        Students students = Students.getInstance();
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
        Integer expectedNewStudyTime = 3;
        Integer hoursOfLecture = 54;

        // When
        zipCodeWilmington.hostLecture(Educator.LEON, hoursOfLecture);
        Map<Student, Double> map = zipCodeWilmington.getStudyMap();

        // Then
//        Iterator iterator = students.iterator();
//        while (iterator.hasNext()) {
//            Student student = (Student)iterator.next();
//            Double actualNewStudyTime = student.getTotalStudyTime();
//            Assert.assertEquals(expectedNewStudyTime, actualNewStudyTime, 0);
//        }
        Assert.assertEquals(expectedNewStudyTime, map.get(students.findById(1)), 0);
        Assert.assertEquals(expectedNewStudyTime, map.get(students.findById(2)), 0);
        Assert.assertEquals(expectedNewStudyTime, map.get(students.findById(3)), 0);
        Assert.assertEquals(expectedNewStudyTime, map.get(students.findById(4)), 0);
        Assert.assertEquals(expectedNewStudyTime, map.get(students.findById(5)), 0);
        Assert.assertEquals(expectedNewStudyTime, map.get(students.findById(6)), 0);
        Assert.assertEquals(expectedNewStudyTime, map.get(students.findById(7)), 0);
        Assert.assertEquals(expectedNewStudyTime, map.get(students.findById(8)), 0);
        Assert.assertEquals(expectedNewStudyTime, map.get(students.findById(9)), 0);
        Assert.assertEquals(expectedNewStudyTime, map.get(students.findById(10)), 0);
        Assert.assertEquals(expectedNewStudyTime, map.get(students.findById(11)), 0);
        Assert.assertEquals(expectedNewStudyTime, map.get(students.findById(12)), 0);
        Assert.assertEquals(expectedNewStudyTime, map.get(students.findById(13)), 0);
        Assert.assertEquals(expectedNewStudyTime, map.get(students.findById(14)), 0);
        Assert.assertEquals(expectedNewStudyTime, map.get(students.findById(15)), 0);
        Assert.assertEquals(expectedNewStudyTime, map.get(students.findById(16)), 0);
        Assert.assertEquals(expectedNewStudyTime, map.get(students.findById(17)), 0);
        Assert.assertEquals(expectedNewStudyTime, map.get(students.findById(18)), 0);

    }

    @Test
    public void hostLectureTest_CheckEducatorTeachingTime() {
        // Given
        Students students = Students.getInstance();
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
        Integer expectedNewTeachingTime = 54;
        Integer hoursOfLecture = 54;

        // When
        zipCodeWilmington.hostLecture(Educator.LEON, hoursOfLecture);
        Double actualNewTeachingTime = Educator.LEON.timeWorked;

        // Then
        Assert.assertEquals(expectedNewTeachingTime, actualNewTeachingTime, 0);
    }
}
