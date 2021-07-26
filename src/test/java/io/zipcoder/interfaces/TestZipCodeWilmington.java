package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.Set;

public class TestZipCodeWilmington {

    @Test
    public void testHostLecture(){
        //Given
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
        Instructors instructors = Instructors.getInstance();
        Students students = Students.getInstance();
        Instructor instructor = (Instructor) Instructors.getInstance().findById(10l);
        Map<Student, Double> preStudyMap = zipCodeWilmington.getStudyMap();
        Double numberOfHoursToTeach = 9999.0;
        Double expectedNumberOfHoursLearned = numberOfHoursToTeach / students.count();

        //When
        zipCodeWilmington.hostLecture(instructor, numberOfHoursToTeach);
        Map<Student, Double> postStudyMap = zipCodeWilmington.getStudyMap();
        Set<Student> keySet = postStudyMap.keySet();
        for(Student student : keySet){
            Double preStudyTime = preStudyMap.get(student);
            Double expectedStudyTime = preStudyTime + expectedNumberOfHoursLearned;
            Double actualStudyTime = postStudyMap.get(student);

        //Then
            Assert.assertEquals(expectedStudyTime, actualStudyTime);
        }

    }

    @Test
    public void testEducator(){
        //Given
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();

        Students students = Students.getInstance();
        Educator oracle  = Educator.ORACLE;
        Map<Student, Double> preStudyMap = zipCodeWilmington.getStudyMap();
        Double numberOfHoursToTeach = 9999.0;
        Double expectedNumberOfHoursLearned = numberOfHoursToTeach / students.count();

        //When
        zipCodeWilmington.hostLecture(oracle, numberOfHoursToTeach);
        Map<Student, Double> postStudyMap = zipCodeWilmington.getStudyMap();
        Set<Student> keySet = postStudyMap.keySet();
        for(Student student : keySet){
            Double preStudyTime = preStudyMap.get(student);
            Double expectedStudyTime = preStudyTime + expectedNumberOfHoursLearned;
            Double actualStudyTime = postStudyMap.get(student);

            //Then
            Assert.assertEquals(expectedStudyTime, actualStudyTime);
        }

    }
}
