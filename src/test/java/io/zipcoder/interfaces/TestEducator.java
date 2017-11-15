package io.zipcoder.interfaces;

import io.zipcoder.interfaces.Class.Person;
import io.zipcoder.interfaces.Class.Student;
import io.zipcoder.interfaces.Enum.Educator;
import io.zipcoder.interfaces.Interface.Learner;
import io.zipcoder.interfaces.Interface.Teacher;
import org.junit.Assert;
import org.junit.Test;

public class TestEducator {
    Educator educator =  Educator.DOLIO;
    Student student1 = new Student(1);
    Student student2 = new Student(2);

    @Test
    public void testImplementation() {

        boolean expected = true;

        boolean actual = educator instanceof Teacher;

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testTeach() {


        double expected = 5.0;
        educator.teach(student1, expected);

        double actual = student1.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testLecture() {

        Learner[] students = {student1, student2};
        double expected = 5.0;

        educator.lecture(students, 10);
        double actual1 = student1.getTotalStudyTime();
        double actual2 = student2.getTotalStudyTime();

        Assert.assertEquals(expected, actual1, 0);
        Assert.assertEquals(expected, actual2, 0);
    }
}
