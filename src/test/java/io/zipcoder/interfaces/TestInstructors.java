package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void estan(){
        Instructors instructors = Instructors.getInstance();

        Boolean leon = instructors.contains(instructors.findById(12));
        Boolean dolio = instructors.contains(instructors.findById(13));
        Boolean kris = instructors.contains(instructors.findById(14));

        Assert.assertTrue(leon);
        Assert.assertTrue(dolio);
        Assert.assertTrue(kris);
    }
}
