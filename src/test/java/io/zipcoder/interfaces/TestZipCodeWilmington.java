package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.Set;

public class TestZipCodeWilmington {
    @Test
    public void testHostLecture() {
        //given
        ZipCodeWilmington zipCodeWilmington = new ZipCodeWilmington();
        Instructors instructors = Instructors.getInstance();
        Students students = Students.getInstance();
        Instructor leon = instructors.findById(100L);
        Map<Student,Double> preStudyMap = zipCodeWilmington.getStudyMap();
        Double numberOfHoursToTeach = 1000.0;
        Double expectedNumberOfHoursLearned = numberOfHoursToTeach/students.count();

        //when
        zipCodeWilmington.hostLecture(leon, numberOfHoursToTeach);
        Map<Student, Double> postStudyMap = zipCodeWilmington.getStudyMap();
        Set<Student> keySet = postStudyMap.keySet();
        for(Student student : keySet) {
            Double preStudyTime = preStudyMap.get(student);
            Double expected = preStudyTime + expectedNumberOfHoursLearned;
            Double actual = postStudyMap.get(student);


            //then
            Assert.assertEquals(expected, actual);
        }
    }
}