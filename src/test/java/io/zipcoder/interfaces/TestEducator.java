package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestEducator {

    Educator educator;
    Student bob;
    Student bill;
    Student kelly;
    Student [] allTheStudents;

    @Before
    public void assignment(){
        educator = Educator.Tariq;
        bob = new Student(1, "bob");
        bill = new Student(2, "bill");
        kelly = new Student(3, "kelly");
        allTheStudents = new Student[]{bob, bill, kelly};
    }

    @Test
    public void testInstanceOf(){
        Assert.assertTrue(educator instanceof Teacher);
    }

    @Test
    public void testTeach(){
        double expected1 = 10;
        double expected2 = 10;

        educator.teach(bob, 10);

        double actual1 = bob.getTotalStudyTime();
        double actual2 = educator.getTimeWorked();

        Assert.assertEquals(expected1, actual1, 0.0);
        Assert.assertEquals(expected2, actual2, 0.0);
    }

    @Test
    public void testLecture(){
        double expected1 = 4;
        double expected2 = 12;

        educator.lecture(allTheStudents, 12);

        double actual1 = bill.getTotalStudyTime();
        double actual2 = educator.getTimeWorked();

        Assert.assertEquals(expected1, actual1, 0.0);
        Assert.assertEquals(expected2, actual2, 0.0);
    }
}
