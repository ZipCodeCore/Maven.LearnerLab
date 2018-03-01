package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {

    @Test
    public void testHostLecture() {
        // given

        //when

        //then

    }

    @Test
        public void testGetStudentArray(){

        // given
        Students students = Students.getInstance();
        students.add(new Student(12345678));
        students.add(new Student(15555555));
        students.add(new Student(12767677));
        students.add(new Student(98765454));
        int actual = students.getArray().length;
        //then


        Student[] studentarray = students.getArray();
        //when
        Student expected = 12345678;
        Student actual = studentarray[0];
        Assert.assertEquals(expected, actual);
    }
}




