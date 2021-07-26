package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class TestZipcodeWilmington {
    @Test
    public void testHostLecture(){
        //given
        Students students=Students.getInstance();
        double expectedValue=2.0;
        //when
        ZipcodeWilmington zcw=new ZipcodeWilmington();
        zcw.hostLecture(1l,10);
        Student actualStudent=students.personList.get(0);
        double actualValue=actualStudent.getTotalStudyTime();
        //then
        Assert.assertEquals(expectedValue,actualValue,0.0);
    }

    @Test
    public void testHostLectureByEducator(){
        //given
        Educator educator=Educator.LEON;
        Students students=Students.getInstance();
        double expectedValue=5.0;
        //when
        ZipcodeWilmington zcw=new ZipcodeWilmington();
        zcw.hostLecture(educator,25);
        double actualValue=zcw.getStudyMap().get(students.findByID(2l));
        //then
        Assert.assertEquals(expectedValue,actualValue,0.0);
    }
}
