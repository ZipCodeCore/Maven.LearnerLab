package io.zipcoder.interfaces;

import io.zipcoder.interfaces.donald.fountain.classroomLab.Learner;
import io.zipcoder.interfaces.donald.fountain.classroomLab.Person;
import io.zipcoder.interfaces.donald.fountain.classroomLab.Student;
import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    long idNumber = 1000000;

    @Test
    public void testImplementationLearner(){
        //: Given
        Student me = new Student(idNumber);

        //Then;
        Assert.assertTrue(me instanceof Learner);
    }

    @Test
    public void testImplementationPerson(){
        //: Given
        Student me = new Student(idNumber);

        //Then;
        Assert.assertTrue(me instanceof Person);
    }

    @Test
    public void studentCreator(){
        //: Given
        Student me = new Student(idNumber);
        String name = "Donald";
        String expected = idNumber + name;

        //: When
        me.setName(name);
        String actual = me.getId() + me.getName();

        //: Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void totalStudyTime(){
        //: Given
        Student me = new Student(idNumber);
        double expected = 100;

        //: When
        me.learn(expected);
        double actual = me.getTotalStudyTime();

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }
}
