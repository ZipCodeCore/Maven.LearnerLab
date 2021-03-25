package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class InstructorsTest {

    @Test
    public void InstructorsTest() {
        // Given
        long expectedId18L = 18L;
        long expectedId24L = 24L;
        // When
        long actualId18L = Instructors.getInstance().findById(18L).getId();
        long actualId24L = Instructors.getInstance().findById(24L).getId();
        // Then
        Assert.assertEquals(expectedId18L, actualId18L);
        Assert.assertEquals(actualId18L, actualId18L);
    }
}
