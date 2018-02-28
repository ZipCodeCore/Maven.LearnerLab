package io.zipcoder.interfaces;

import io.zipcoder.interfaces.Enums.Educator;
import io.zipcoder.interfaces.People.Instructors;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * filename:
 * project: interfaces-1
 * author: https://github.com/vvmk
 * date: 2/28/18
 */
public class InstructorsTest {
    private Instructors instructors;

    @Before
    public void setup() {
        instructors = Instructors.getInstance();
    }

    @Test
    public void testInstructorsListFull() {
        int expected = Educator.values().length;
        int actual = instructors.getCount();
        Assert.assertEquals(expected, actual);
    }
}