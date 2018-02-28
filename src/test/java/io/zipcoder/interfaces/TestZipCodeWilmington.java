package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {

    @Test
    public void hostLectureTest() {
        ZipCodeWilmington.getInstance().hostLecture(12, 9);
        People people = new People();
        Student student = new Student(1);
        people.addPerson(student);

        double expected = 9;
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual);
    }

}
