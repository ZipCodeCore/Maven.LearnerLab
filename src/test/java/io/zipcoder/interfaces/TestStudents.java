package io.zipcoder.interfaces;


import org.junit.Test;
import org.junit.Assert;

public class TestStudents {

    @Test
    public void testStudents() {
        String[] listOfStudentNames =
                {"Aaron Herion", "Abrar Mohammed", "Andrea Susnick",
                        "Andrew Kutchen", "Brian Sutton", "Claude McAlpin",
                        "Donald Fountain", "Elliot Kozulak", "Gabriela Lisboa",
                        "Graham Nilsen", "Greg Patselas", "Jeff Lawrence",
                        "Katherine Anderson", "Lina Zhang", "Linda Qiu",
                        "Logan Hanner", "Merin Jose", "Oleg Stirbu",
                        "Pavel Parfenov", "Raul Cubila Perez", "Rob Kruzel",
                        "Ryan Maiale", "Samuel Haile", "Timothy Rager",
                        "Vince Paris", "Wesley Connors", "Zan Cheema",
                        "Zachary Stimmel"};

        Students students=Students.getInstance();

        for (Person p : students.getArray())
        {
            Assert.assertEquals(listOfStudentNames[(int)p.getId()], p.getName());
        }
    }
}
