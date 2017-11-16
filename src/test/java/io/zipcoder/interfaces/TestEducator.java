package io.zipcoder.interfaces;

import io.zipcoder.interfaces.donald.fountain.classroomLab.Educator;
import io.zipcoder.interfaces.donald.fountain.classroomLab.Learner;
import io.zipcoder.interfaces.donald.fountain.classroomLab.Students;
import io.zipcoder.interfaces.donald.fountain.classroomLab.Teacher;
import org.junit.Assert;
import org.junit.Test;

public class TestEducator {

    @Test
    public void testConstructor(){
        Assert.assertTrue(Educator.Tariq instanceof Teacher);
    }

    @Test
    public void testTeach(){
        double teachHours = 10;

        Educator.Dolio.teach(Students.getInstance().findById(1), teachHours);
        double actualHours = Educator.Dolio.timeWorked;

        Assert.assertEquals(teachHours, actualHours, 0);
    }

    @Test
    public void testLecture(){
        double teachHours = 10;

        Educator.Leon.lecture(Students.getInstance().getArray(), teachHours);
        double actualHours = Educator.Leon.timeWorked;

        Assert.assertEquals(teachHours, actualHours, 0);
    }
}
