package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class InsturctorsTest {

   @Test
     public void InstrucorsTest(){
    //Given
    Instructors insturctors = Instructors.getInstance();

    //When
    int expected = 4;
    int actual = insturctors.personList.size();

    //Then

    Assert.assertEquals(expected,actual);
}



}