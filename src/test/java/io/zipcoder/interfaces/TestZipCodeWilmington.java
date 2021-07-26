package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class TestZipCodeWilmington {
    @Test
    public void testHostLecture() {
        // Given
        Students students = Students.getInstance();
        Educator instructor = Educator.Leon;
        //Instructors instructors = Instructors.getInstance();

        Double expectedTime = 20.0 / students.personList.size();

        // When
        ZipCodeWilmington zipcode = new ZipCodeWilmington();
        zipcode.hostLecture(instructor,20.0);
        Map<Student, Double> getMap = zipcode.getStudyMap();
        Double actualTime = getMap.get(students.findById(122L));


        // Then
        Assert.assertEquals(expectedTime, actualTime);

    }
}
