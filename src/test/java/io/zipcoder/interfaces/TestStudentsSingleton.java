package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;


public class TestStudentsSingleton {
    Students students = Students.getInstance();
    @Test
  public  void testStudents(){
        int expected = 28;
        int actual = students.personList.size();
    }
    @Test
    public void testGetArray(){
        Student[] students1 = students.getArray();
        for (Student student:students.personList) {
            System.out.println(student.getName()+" "+student.getId());
        }
        for (Student student:students1) {
            Assert.assertTrue(students.personList.contains(student));
        }
    }


}
