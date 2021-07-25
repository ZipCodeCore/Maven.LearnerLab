package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmingtonTest {

    @Test
    public void testHostLecture_byTeacher(){
        ZipCodeWilmington zcw = ZipCodeWilmington.getInstance();
        Teacher leon = ZipCodeWilmington.getInstructors().findById(0);

        zcw.hostLecture(leon, 20.0);
        Map<Student, Double> studyMap =  ZipCodeWilmington.getStudyMap();

        Double actual = studyMap.get(ZipCodeWilmington.getStudents().findById(0));
        Double expected = 5.0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHostLecture_byId(){
        //given
        ZipCodeWilmington zcw = ZipCodeWilmington.getInstance();
        //when
        zcw.hostLecture(1,40.0);
        Map<Student, Double> studyMap =  ZipCodeWilmington.getStudyMap();
        Double actual = studyMap.get(ZipCodeWilmington.getStudents().findById(1));
        Double expected = 10.0;

        //then
        Assert.assertEquals(expected,actual);
    }

}
