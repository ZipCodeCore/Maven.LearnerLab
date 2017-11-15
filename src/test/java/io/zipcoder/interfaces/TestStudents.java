package io.zipcoder.interfaces;

import io.zipcoder.interfaces.Class.Student;
import io.zipcoder.interfaces.Class.Students;
import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void TestStudentsAreAddedToINSTANCE(){
        Students students = Students.getINSTANCE();

        String expected = "Wes";

        Student testStudent = (Student)students.findById(25);
        String actual = testStudent.getName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getArrayTest(){
        String expected = "Wes";
        String actual = Students.getINSTANCE().getArray().get(25).getName();
        Assert.assertEquals(expected,actual);
    }

}
