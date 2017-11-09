package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {

    @Test
    public void testStudents(){

        //Given
        Students students = Students.getInstance();

        //When
        int actual = students.personList.size();
        int expected = 28;
        //Then
        Assert.assertEquals(expected,actual);
    }


}