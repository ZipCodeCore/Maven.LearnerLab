package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestEducator {

    @Before
    public void clearLists(){
//        Students students = Students.getInstance();
//        students.removeAll();
//        Instructors instructors = Instructors.getInstance();
//        instructors.removeAll();
    }

    @Test
    public void testTeach(){

        Students students = Students.getInstance();
        Student[] studArr = students.getArray();

        Educator.TARIQHOOK.teach(studArr[0], 500);
        Assert.assertEquals(studArr[0].getTotalStudyTime(), 500, 0.1);
        Assert.assertEquals(Educator.TARIQHOOK.getTimeWorked(), 500, 0.1);

    }

    @Test
    public void testLecture(){

    Students students = Students.getInstance();
    Student[] studArr = students.getArray();

    Educator.TARIQHOOK.lecture(studArr, 500);
    Assert.assertEquals(studArr.length, 28);
    Assert.assertEquals(studArr[0].getTotalStudyTime(), 500.0/studArr.length, 0.1);
    Assert.assertEquals(Educator.TARIQHOOK.getTimeWorked(), 500.0, 0.1);

    }


}
