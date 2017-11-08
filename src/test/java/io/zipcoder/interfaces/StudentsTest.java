package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentsTest {

    Students students = Students.getInstance();
    @Test
    void getArray() {
        int expected = 27;

        int actual = students.getArray().length;

        Assert.assertEquals(expected, actual);
    }

    @Test
    void getInstance() {

        String expected = "Aaron Herion,Abrar Mohammed,Andrea Susnick,Andrew Kutchen,Brian Sutton," +
                "Claude McAlpin,Donald Fountain,Elliott Kozulak,Gabriela Lisboa,Graham Nilsen," +
                "Greg Patselas,Jeff Lawrence,Katherine Anderson,Kevin Buckley,Lina Zhang,Linda Qiu," +
                "Logan Hanner,Oleg Stirbu,Pavel Parfenov,Raul Cubila Perez,Rob Kruzel,Ryan Maiale," +
                "SAMUEL HAILE,Timothy Rager,Vince Paris,Wesley Connors,Zan Cheema,";

        String actual = students.toString();
        Assert.assertEquals(expected, actual);
    }

}