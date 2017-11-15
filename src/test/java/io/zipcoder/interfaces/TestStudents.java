package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void allStudentsTest(){
        Students students = Students.getINSTANCE();
        String[] studentsNames = {
                "Ivan Groznii", "Debi Grigorevichi", "Kovo Eshe"
        };
        boolean actual = true;
        String expected = String.valueOf(students.contains(studentsNames));
        Assert.assertTrue(expected, actual);

    }
}
