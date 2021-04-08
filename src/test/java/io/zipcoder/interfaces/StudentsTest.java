package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentsTest {
    @Test
    public void testStudentsSingleton(){
        //Given
            //a Students singleton with students already in it
            Students ourListofStudents = Students.getInstance();

        //When
        //Then
            //we expect to see the exact students we added in it
        Assert.assertTrue(ourListofStudents.findById(1) != null);
        Assert.assertTrue(ourListofStudents.findById(2) != null);
        Assert.assertTrue(ourListofStudents.findById(3) != null);
        Assert.assertTrue(ourListofStudents.findById(4) != null);

    }


}
