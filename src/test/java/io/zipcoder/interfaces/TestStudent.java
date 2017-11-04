package io.zipcoder.interfaces;

import org.junit.*;

public class TestStudent {
    @Test
    public void testImplementation() {
        boolean studentIsLearner;
        Student student = new Student(40000, "Rob");

        if (student instanceof Learner) {
            studentIsLearner = true;
        } else {
            studentIsLearner = false;
        }

        Assert.assertTrue(studentIsLearner);
    }

    @Test
    public void testInheritance() {
        boolean studentIsPerson;
        Student student = new Student(40000, "Rob");

        if (student instanceof Person) {
            studentIsPerson = true;
        } else {
            studentIsPerson = false;
        }

        Assert.assertTrue(studentIsPerson);

    }

    @Test
    public void testLearn() {
        Student student = new Student(38402802, "Kruzel");
        student.learn(4.5);

        double expected = 4.5;
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);

    }

}