package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {


    @Test
    public void testInstructors() {
        String[] listOfInstructors =
                {"Tariq Hook", "Iyasu Watts", "L. Dolio Durant", "Leon Hunter", "Froilan Miranda"};
        Instructors instructors = Instructors.getInstance();

        for (Person p : instructors.getArray()) {
            Assert.assertEquals(listOfInstructors[(int) p.getId()], p.getName());
        }
    }
}
