package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorsTest {

    @Test
    public void ensureAllInstructorsInSingleton() {
        //Given

        Instructors instance = Instructors.getINSTANCE();
        Instructors instance1 = Instructors.getINSTANCE();
        //When
        instance.add(new Instructor(12));
        instance.add(new Instructor(13));
        instance1.add(new Instructor(14));
        instance1.add(new Instructor(15));
        //Then
        Assert.assertEquals(instance, instance1);
    }

}