package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentsTest {

    @Test
    public void getInstance() {
        Students testStudents = Students.getInstance();

        for (Student eachS : testStudents){
            System.out.println(eachS.getName() + " - " + eachS.getId());
        }

        Integer expected = 3;
        Integer actual = testStudents.count();
        Assert.assertEquals(expected,actual);
    }
}