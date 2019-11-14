package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {

    @Test
    public void getInstanceTest1() {
        Students students = Students.INSTANCE;

        Integer expectedSize = 4;
        Integer actualSize = students.personList.size();

        Assert.assertEquals(expectedSize,actualSize);
    }

    @Test
    public void getInstanceTest2(){
        Students students = Students.INSTANCE;
        boolean student = false;

        for(Person person : students.personList){
            if(person.getId() == 34L && person.getName().equals("Gau")){
                student = true;
                break;
            }
        }
        Assert.assertTrue(student);
    }
}