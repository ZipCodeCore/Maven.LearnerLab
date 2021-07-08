package io.zipcoder.singletons;

import io.zipcoder.Educator;
import io.zipcoder.Instructor;
import io.zipcoder.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InstructorsTest {

    @Test
    public void singleInstructorTest(){
        Assert.assertEquals(Educator.TARIQ.name().toLowerCase(), Instructors.getInstance().getArray()[0].getName().toLowerCase());
    }

}
