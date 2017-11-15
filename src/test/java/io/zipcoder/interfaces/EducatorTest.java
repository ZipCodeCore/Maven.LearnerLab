package io.zipcoder.interfaces;


import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;


class EducatorTest {
    Educator educator;
    Student student;

    @Before
    public void assign(){
        educator = Educator.Michael_Rosbash;
        student = new Student(221);
        student = new Student(111);
    }

    @Test
    void teachTest() {
        double expected = 11.0;
        educator.teach(student, expected);

        double actual = educator.getTimeWorked();
        Assert.assertEquals(expected, actual, 0.1);

    }

    @Test
    void lectureTest() {
        double expected = 10;
        educator.teach(student, expected);

        double actual = educator.getTimeWorked();
        Assert.assertEquals(expected, actual, 0);
    }

}