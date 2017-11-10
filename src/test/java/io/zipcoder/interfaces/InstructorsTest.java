package io.zipcoder.interfaces;


import org.junit.Assert;
import org.junit.Test;

public class InstructorsTest {

    @Test
    public void test(){
        Instructors instructors = Instructors.getInstance();
        String actual = "";
        String expected = "Froilan Miranda\nIyassu Watts\nJanelle Bowman\nDolio Durant\nLeon Hunter\n" +
                          "Melanie Augustin\nMikaila Akeredolu\nSamantha Kooman\nTariq Hook";

        for (Person instructor : instructors.personList){
            actual += instructor.getName() + "\n";
        }
        actual = actual.trim();

        Assert.assertEquals(expected, actual);
    }

}