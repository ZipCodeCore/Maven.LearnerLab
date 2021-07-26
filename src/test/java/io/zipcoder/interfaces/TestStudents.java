package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {
    @Test
    public void getStudents(){
        //Given
        Students students = Students.getInstance();
        Integer expected = 3;

        //When
        Integer actual = students.personList.size();

        //Then
        Assert.assertEquals(expected, actual);

    }

}
