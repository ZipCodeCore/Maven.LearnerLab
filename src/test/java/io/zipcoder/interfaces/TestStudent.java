package io.zipcoder.interfaces;

import io.zipcoder.interfaces.donald.fountain.classroomLab.Learner;
import io.zipcoder.interfaces.donald.fountain.classroomLab.Person;
import io.zipcoder.interfaces.donald.fountain.classroomLab.Student;
import io.zipcoder.interfaces.donald.fountain.classroomLab.Students;
import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    long idNumber = 1000000;

    @Test
    public void testImplementationLearner(){
//        //: Given
//        Student me = new Student(idNumber);

        //Then;
        Assert.assertTrue(Students.getInstance().findById(1) instanceof Learner);
    }

    @Test
    public void testImplementationPerson(){
//        //: Given
//        Student me = new Student(idNumber);

        //Then;
        Assert.assertTrue(Students.getInstance().findById(1) instanceof Person);
    }

    @Test
    public void studentCreator(){
        //: Given
//        Student me = new Student(idNumber);
//        String name = "Donald";
        String expected = "Donald";

        //: When
//        me.setName(name);
        String actual = Students.getInstance().findById(1).getName();

        //: Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTotalStudyTime(){
//        //: Given
//        Student me = new Student(idNumber);
        double expected = 100;

        //: When
        Students.getInstance().findById(1).learn(expected);
        double actual = Students.getInstance().findById(1).getTotalStudyTime();

        //: Then
        Assert.assertEquals(expected, actual, 0);
    }
}
