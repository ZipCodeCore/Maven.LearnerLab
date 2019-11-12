package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test
    public void testSingleton() {
//        People people = new People();
//        for (int i = 0; i < 5; i++) {
//            people.add(new Student(Long.valueOf(i+1), "name"+i));
//        }
        Instructors instructors = Instructors.getInstance();
        Integer expected = 5;
        Integer actual = instructors.count();
        Assert.assertEquals(expected, actual);
    }
}
