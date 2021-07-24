package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class TestZipCodeWilmington {

    @Test
    public void testHostLecture(){
        ZipCodeWilmington zcw = ZipCodeWilmington.getInstance();
        Educator teacher = Educator.LEON;

        zcw.hostLecture(teacher, 100.00);
        HashMap<Student, Double> studyMap =  zcw.getStudymap();

        Double actual = studyMap.get(zcw.getStudents().personList.get(0));
        Double expected = 20.00;

        Assert.assertEquals(expected, actual);
    }

}
