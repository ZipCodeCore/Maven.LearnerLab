package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorsTest {

    @Test
    public void getInstanceTest1() {
        Instructors instructors = Instructors.INSTANCE;

        Integer expectedSize = 2;
        Integer actualSize = instructors.personList.size();

        Assert.assertEquals(expectedSize,actualSize);
    }

    @Test
    public void getInstanceTest2(){
        Instructors instructors = Instructors.INSTANCE;
        Boolean instructor = false;

        for(Person person : instructors.personList){
            if(person.getId() == 2323L && person.getName().equals("Boop")){
                instructor = true;
                break;
            }
        }
        Assert.assertTrue(instructor);
    }
}