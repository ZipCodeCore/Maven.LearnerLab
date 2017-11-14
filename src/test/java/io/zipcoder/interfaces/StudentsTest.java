package io.zipcoder.interfaces;


import org.junit.Assert;
import org.junit.Test;

public class StudentsTest {

    @Test
    public void test(){
        Students students = Students.getInstance();
        String actual = "";
        String expected = "Aaron Herion\nAbrar Mohammed\nAndrea Susnick\nAndrew Kutchen\nBrian Sutton\n" +
                          "Claude McAlpin\nDonald Fountain\nElliott Kozulak\nGabriela Lisboa\nGraham Nilsen\n" +
                          "Greg Patselas\nJeff Lawrence\nKatherine Anderson\nLina Zhang\nLinda Qiu\nLogan Hanner\n" +
                          "Merin Jose\nMoose\nPavel Parfenov\nRaul Cubila Perez\nRob Kruzel\nRyan Maiale\n" +
                          "Samuel Haile\nTimothy Rager\nVince Paris\nWesley Connors\nZachary Stimmel\nZan Cheema";

        for (Person student : students.personList){
            actual += student.getName() + "\n";
        }
        actual = actual.trim();

        Assert.assertEquals(expected, actual);
    }

}