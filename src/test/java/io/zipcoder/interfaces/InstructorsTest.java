package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class InstructorsTest extends PeopleTest{

    @Test
    public void allInstructorsInCohortTest() {
        Instructors currentInstructors = Instructors.getInstance();
        String[] names = {
                "Tariq Hook",
                "L. Dolio Durant",
                "Leon Hunter"
        };

        boolean expected = true;
        boolean actual = allNamesInArray(names, currentInstructors.getArray());
        Assert.assertTrue(actual);
    }
}
