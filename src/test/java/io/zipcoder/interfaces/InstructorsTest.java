package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class InstructorsTest extends PeopleTest{

    @Test
    public void allInstructorsInCohortTest() {
        Instructors currentInstructors = Instructors.getInstance();
        String[] names = new String[3];
        int i = 0;
        for(Educator educator : Educator.values()) {
            names[i] = educator.getFullname();
            i++;
        }

        boolean expected = true;
        boolean actual = allNamesInArray(names, currentInstructors.getArray());
        Assert.assertTrue(actual);
    }
}
