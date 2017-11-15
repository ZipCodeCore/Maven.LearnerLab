package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestStudents {
    Students students = Students.getInstance();


    @Test
    public void testStudents(){
        int expected = 28;
        int actual = students.personList.size();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testGetArray(){
        List<String> studentNames = Arrays.asList(students.names);
        for(Student student : students.getArray()) {
            Assert.assertTrue(studentNames.contains(student.getName()));
        }
    }
}
