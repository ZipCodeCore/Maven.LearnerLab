package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class InstructorSTest {
    @Test
    public void realTest(){
        Instructors instructors = Instructors.getInstance();
        Instructor retrievedLeon = instructors.findById(0);

        boolean instructorHasLeon = instructors.contains(retrievedLeon);

        Assert.assertTrue(instructorHasLeon);
    }


}
