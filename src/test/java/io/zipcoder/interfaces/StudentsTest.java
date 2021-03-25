package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import io.zipcoder.interfaces.Students;
import io.zipcoder.interfaces.Person;

public class StudentsTest {

    @Test
    public void StudentsTest() {
        // Given
        long expectedId0 = 11L;
        long expectedId6 = 17L;
        // When
        long actualId0 = Students.getInstance().findById(11L).getId();
        long actualId6 = Students.getInstance().findById(17L).getId();
        // Then
        Assert.assertEquals(expectedId0, actualId0);
        Assert.assertEquals(expectedId6, actualId6);
    }

}
