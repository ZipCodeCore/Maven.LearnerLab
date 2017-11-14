package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {


    @Test
    public void testZipCodeWilmington() {

        ZipCodeWilmington zcw = ZipCodeWilmington.getInstance();
        Instructor professor = (Instructor)Instructors.getInstance().findById(0);

        zcw.hostLecture(professor, 86);
        for (Person p: Students.getInstance().getArray()){
            Assert.assertEquals(86/Students.getInstance().getCount(), ((Student)p).getTotalStudyTime(), .1);
        }


    }

    @Test
    public void testZipCodeWilmingtonEducator() {

        ZipCodeWilmington zcw = ZipCodeWilmington.getInstance();


        zcw.hostLecture(Educator.TARIQHOOK, 86);
        for (Person p: Students.getInstance().getArray()){
            Assert.assertEquals(86/Students.getInstance().getCount(), ((Student)p).getTotalStudyTime(), .1);
        }


    }
}