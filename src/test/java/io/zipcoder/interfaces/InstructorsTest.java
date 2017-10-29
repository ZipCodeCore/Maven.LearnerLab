package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorsTest {
    private String[] teacherNameList = new String[]{
            "Tariq Hook",
            "Dolio Durant",
            "Leon Hunter",
            "Mikaila Akeredolu",
            "Yassu"
    };

    @Test
    public void testConstructor(){
        Instructors instructors = Instructors.getInstance();
        int numCount = 0;
        for (int i = 0; i <= teacherNameList.length-1; i++) {
            if (instructors.personList.get(i).getName() == teacherNameList[i]) {
                numCount++;
            }
        }
        int expected = teacherNameList.length;
        int actual = numCount;
        Assert.assertEquals(expected, actual);
    }


}