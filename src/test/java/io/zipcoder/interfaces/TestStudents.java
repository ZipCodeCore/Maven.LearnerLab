package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test

    public void testStudents() {

        //: Given
        Students students = new Students();
        //System.out.println(students.getStudents().getCount());
        ///System.out.println(students.getInstance().getArray().length);
        int expected;
        expected = 29;

        int actual = students.personList.size();
        //System.out.println(actual);

        //:then
        Assert.assertEquals(expected, actual);
    }
}
