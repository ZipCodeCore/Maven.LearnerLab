package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentsTest extends PeopleTest{

    @Test
    public void allStudentsInCohortTest() {
        Students currentCohort = Students.getInstance();
        String[] names = {
                "Aaron Herion",
                "Abrar Mohammed",
                "Andrea Susnick",
                "Andrew Kutchen",
                "Brian Sutton",
                "Claude McAlpin",
                "Donald Fountain",
                "Elliott Kozulak",
                "Gabriela Lisboa",
                "Graham Nilsen",
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
                "Zachary Stimmel",
                "Zan Cheema"
        };

        boolean expected = true;
        boolean actual = allNamesInArray(names, currentCohort.getArray());
        Assert.assertTrue(actual);
    }

    @Test
    public void assignNextIdTest() {
        Students currentCohort = Students.getInstance();
        long nextId = -1;
        nextId = currentCohort.assignNextId();
        boolean expected = true;
        boolean actual = (nextId > 0);
        Assert.assertTrue(actual);
    }

}
