package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestInstructors {
    @Test
    public void testInstructorInstance() {
        // Given
        Instructors instructors = Instructors.getInstance();
        Instructor leon = new Instructor(111L, "Leon");
        Instructor dolio = new Instructor(112L, "Dolio");
        Instructor kris = new Instructor(113L, "Kris");

        // When
        boolean containsLeon = instructors.contains(leon);
        boolean containsDolio = instructors.contains(dolio);
        boolean containsKris = instructors.contains(kris);


        // Then
        Assert.assertTrue(containsLeon);
        Assert.assertTrue(containsDolio);
        Assert.assertTrue(containsKris);

    }
}
