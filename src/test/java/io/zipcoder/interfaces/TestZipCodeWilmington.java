package io.zipcoder.interfaces;

import io.zipcoder.interfaces.Class.Student;
import io.zipcoder.interfaces.Class.Students;
import io.zipcoder.interfaces.Class.ZipCodeWilmington;
import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {

    @Test
    public void hostLectureTest(){
        Students students = Students.getINSTANCE();
        ZipCodeWilmington zipCodeWilmington = new ZipCodeWilmington();
        zipCodeWilmington.hostLecture(100);
        double expected = 10;

        Student testStudent = (Student)students.findById(25);
        double actual = Math.floor(testStudent.getTotalStudyTime());

        Assert.assertEquals(expected,actual,0);

    }

}
