package io.zipcoder.singletons;

import io.zipcoder.Person;
import io.zipcoder.singletons.Students;
import org.junit.Assert;
import org.junit.Test;

public class StudentsTest {

    @Test
    public void singleStudentTest(){
        Person tempStudent = Students.getInstance().findById(1000L);
        Assert.assertEquals("Keith", tempStudent.getName());
    }

}
