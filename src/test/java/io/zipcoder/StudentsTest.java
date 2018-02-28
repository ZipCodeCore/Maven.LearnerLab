package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentsTest {

    @Test
    public void singleStudentTest(){
        Person tempStudent = Students.getInstance().findById(1000L);
        Assert.assertEquals("Keith", tempStudent.getName());
    }

}
