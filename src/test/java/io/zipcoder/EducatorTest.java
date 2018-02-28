package io.zipcoder;

import io.zipcoder.interfaces.Teacher;
import io.zipcoder.singletons.Instructors;
import org.junit.Assert;
import org.junit.Test;

public class EducatorTest {
    Educator tariq = Educator.TARIQ;
    Instructors instructors;

    @Test
    public void testImplementation(){
        Assert.assertTrue(tariq instanceof Teacher);
    }

    @Test
    public void teachTest(){
        Student bill = new Student("bill", 0);
        double expected = Educator.TARIQ.getTimeWorked() + 2;
        Educator.TARIQ.teach(bill, 2);
        Assert.assertEquals(expected, Educator.TARIQ.getTimeWorked(), 0);
    }

    @Test
    public void lectureTest(){
        Student bill = new Student("bill", 0);
        double expected = Educator.TARIQ.timeWorked + 2;
        Student[] students = new Student[]{bill};
        Educator.TARIQ.lecture(students, 2);
        double actual = Educator.TARIQ.getTimeWorked();
        Assert.assertEquals(expected, actual, 0);
    }

}
