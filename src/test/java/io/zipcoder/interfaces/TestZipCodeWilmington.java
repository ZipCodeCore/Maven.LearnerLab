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
        Teacher dolio = (Teacher) Instructors.getInstance().findById(444L);
        zipcode.hostLecture(dolio, 17.0);
        Double actual = zipcode.getStudyMap().get(student);

        //then
        Assert.assertEquals(expected, actual);


    }
}
