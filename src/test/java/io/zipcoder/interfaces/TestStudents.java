package io.zipcoder.interfaces;

import org.junit.*;

public class TestStudents {

    Students students;
    Student testStudent;

    @Before
    public void setUp() {
        students = Students.getInstance();
        testStudent = new Student("Test Dummy", 5L);
        students.add(testStudent);
    }

    @After
    public void tearDown(){
        students.remove(testStudent);
    }

    @Test
    public void testAdd(){
        int expected = 27;
        int actual = students.getCount();

        Assert.assertEquals(expected, actual);
        Assert.assertTrue(students.getArray()[0] instanceof Student);
    }

    @Test
    public void getStudent(){
        for (Person person:
             students.getArray()) {
            System.out.println(person);
        }
    }

    @Test
    public void testRemove(){
        int fullCount = students.getCount();

        students.remove(12L);
        students.remove(testStudent);

        int halfCount = students.getCount();

        int expectedCount = 2;
        int diffCount = fullCount - halfCount;

        Assert.assertEquals(expectedCount, diffCount);
    }

    @Test
    public void testFindById(){
        Assert.assertEquals(testStudent, students.findById(5));
    }

}
