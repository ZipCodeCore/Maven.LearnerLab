package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;



public class StudentsTest {

    private String[] studentNameList = new String[]{
            "Aaron Herion",
            "Abrar Mohammed",
            "Andrea Susnick",
            "Andrew Kutchen",
            "Brian Sutton",
            "Claude McAlpin",
            "Donal Fountain",
            "Gabriela Lisboa",
            "Graham Nielsen",
            "Greg Patselas",
            "Jeff Lawrence",
            "Katherine Anderson",
            "Lina Zhang",
            "Linda Qiu",
            "Logan Hanner",
            "Merin Jose",
            "Oleg Stirbu",
            "Pavel Parfenov",
            "Raul Cubila Perez",
            "Rob Kruzel",
            "Ryan Maiale",
            "Samuel Haile",
            "Timothy Rager",
            "Vince Paris",
            "Wesley Connors",
            "Zan Cheema"
    };

    @Test
    public void testConstructor(){
        Students students = Students.getInstance();
        int numCount = 0;
        for (int i = 0; i <= studentNameList.length-1; i++) {
            if (students.personList.get(i).getName() == studentNameList[i]) {
                numCount++;
            }
        }
        int expected = studentNameList.length;
        int actual = numCount;
        Assert.assertEquals(expected, actual);
    }
}