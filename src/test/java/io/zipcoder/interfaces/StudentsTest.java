package io.zipcoder.interfaces;

import io.zipcoder.interfaces.Enums.ZipcodeStudents;
import io.zipcoder.interfaces.People.Students;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * filename:
 * project: interfaces-1
 * author: https://github.com/vvmk
 * date: 2/27/18
 */
public class StudentsTest {
    private Students students;

    @Before
    public void setup() {
        students = Students.getInstance();
    }

    @Test
    public void testStudentsListFull() {
        int expected = ZipcodeStudents.values().length;
        int actual = students.getCount();
        Assert.assertEquals(expected, actual);
    }
}