package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;


public class TestStudentsSingleton {
    @Test
  public  void testStudents(){
        Students students = Students.getInstance();
        int expected = 28;
        int actual = students.personList.size();
    }


}
