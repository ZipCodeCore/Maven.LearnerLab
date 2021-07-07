package io.zipcoder.interfaces;

import io.zipcoder.interfaces.Person.Person;
import io.zipcoder.interfaces.Person.Person;
import io.zipcoder.interfaces.Person.Student;
import org.junit.Assert;
import org.junit.Test;

/**
 * filename:
 * project: interfaces-1
 * author: https://github.com/vvmk
 * date: 2/27/18
 */
public class StudentTest {
    @Test
    public void testImplementation() {
        String expected = "Learner";
        String actual = Student.class.getInterfaces()[0].getSimpleName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInheritance() {
        Student s = new Student(9);
        Assert.assertTrue(Person.class.isInstance(s));
    }

    @Test
    public void testLearn() {
        Student s = new Student(9);
        double expected = 64l;
        s.learn(expected);
        double actual = s.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0.01);
    }
}