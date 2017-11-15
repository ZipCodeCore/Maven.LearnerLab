package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {

    Educator instructor = Educator.LEON;


    @Test
    public void testImplementation() {

        Assert.assertTrue(instructor instanceof Teacher);

    }

}
