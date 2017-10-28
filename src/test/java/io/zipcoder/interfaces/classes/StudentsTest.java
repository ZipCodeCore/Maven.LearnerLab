package io.zipcoder.interfaces.classes;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {
    @Test
    public void testGetINSTANCE(){

        Students testStudents = new Students();

        System.out.println(testStudents.getINSTANCE());
    }

}