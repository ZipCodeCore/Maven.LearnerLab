package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {

    @Test
    public void hostLectureTest(){
        //given
        ZipCodeWilmington zipcode = ZipCodeWilmington.getInstance();
        Person student = zipcode.students.findById(650L);
        Double expected = 1.0;

        //when
        Teacher dolio = Instructors.getInstance().findById(444L);
        zipcode.hostLecture(dolio, 17.0);
        Double actual = zipcode.getStudyMap().get(student);

        //then
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void hostLectureLeonTest(){
        //given
        ZipCodeWilmington zipcode = ZipCodeWilmington.getInstance();
        Person student = zipcode.students.findById(651L);
        Double expected = 3.0;

        //when
        Teacher leon = Instructors.getInstance().findById(445L);
        zipcode.hostLecture(leon, 51.0);
        Double actual = zipcode.getStudyMap().get(student);

        //then
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void hostLectureInstanceTest(){
        //given
        ZipCodeWilmington zipcode = ZipCodeWilmington.getInstance();
        Person student = zipcode.students.findById(651L);
        Double expected = 3.0;

        //when
        Educator leon = Educator.LEON; //instance of Leon
        zipcode.hostLecture(leon, 51.0); //can host a lecture in Zip Code
        Double actual = zipcode.getStudyMap().get(student);

        //then
        Assert.assertEquals(expected, actual);


    }
}
