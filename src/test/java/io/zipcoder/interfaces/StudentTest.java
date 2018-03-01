package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    Student student6;

    @Test
    public void Testlearner() {
        student6 = new Student("Ahson",10);

        double expected  = 50;

        double actual = student6.getTotalStudyTime();


    }

    @Test
    public void getTotalStudyTime() {

    }
}