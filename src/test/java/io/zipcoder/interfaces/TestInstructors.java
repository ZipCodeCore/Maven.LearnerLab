package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    Instructors instructors = Instructors.getInstance();

    @Test
    public void areAllInstructorsInInstructorsTest() {
        // Given
        Instructor leon = new Instructor(1, "Leon");
        Instructor dolio = new Instructor(2, "Dolio");
        Instructor kris = new Instructor(3, "Kris");

        // When
        boolean instructorsIncludesLeon = instructors.contains(leon);
        boolean instructorsIncludesDolio = instructors.contains(dolio);
        boolean instructorsIncludesKris = instructors.contains(kris);

        // Then
        Assert.assertTrue(instructorsIncludesLeon);
        Assert.assertTrue(instructorsIncludesDolio);
        Assert.assertTrue(instructorsIncludesKris);
    }
}
