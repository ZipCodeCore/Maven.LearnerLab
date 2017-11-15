package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {
    @Test
    public void testTeach(){
        Student student1 = new Student(1,"Mary",3.0);
        Educator.TARIQ.teach(student1,4.0);
        Assert.assertEquals(4,Educator.TARIQ.getTimeWorked(),.01);
    }
    @Test
    public void lecture(){
        Students students = Students.getInstance();
        Educator.TARIQ.lecture(students.getArray(),10.0);
        Assert.assertEquals(10.0, Educator.TARIQ.getTimeWorked(),.01);

    }

}
