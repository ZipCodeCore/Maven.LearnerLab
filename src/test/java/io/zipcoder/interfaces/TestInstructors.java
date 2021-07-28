package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestInstructors {
    @Test
    public void instructorsSingletonTest() {
        //given
        String[] zipcodersNames = {"Leon", "Dolio", "Kris"};
        List<String> instructors = Arrays.asList(zipcodersNames);

        //when
        for (Person person : Instructors.getInstance()) {
            String personName = person.getName();

            //then
            Assert.assertTrue(instructors.contains(personName));

        }
    }
}
