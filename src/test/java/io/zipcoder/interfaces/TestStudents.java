package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestStudents {
    @Test
    public void studentsSingletonTest(){
        //given
        String[] zipcodersNames = {"Ray", "John", "Jeremy", "Zach","Tati", "Jen", "Dee"};
        List<String> zipcoders = Arrays.asList(zipcodersNames);

        //when
        for(Person person : Students.getInstance()){
            String personName = person.getName();

        //then
        Assert.assertTrue(zipcoders.contains(personName));

        }
    }
}
