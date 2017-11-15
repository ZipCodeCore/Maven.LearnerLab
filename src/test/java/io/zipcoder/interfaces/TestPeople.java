//package io.zipcoder.interfaces;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//public class TestPeople {
//
//    Student testStudent = new Student(1, "Beavis");
//    Instructor testInstructor = new Instructor(666, "Beelzebub");
//    private Students students = Students.getInstance();
//
//    @Test
//    public void testAdd(){
//
//        Students.
//        //add(testStudent);
//
//        Person expected = testStudent;
//        Person actual = testPeople.findById(1);
//
//        Assert.assertEquals(expected,actual);
//
//    }
//
//    @Test
//    public void testRemove(){
//
//        testPeople.add(testStudent);
//        testPeople.add(testInstructor);
//
//        int expected = testPeople.getCount()-1;
//
//        testPeople.remove(testInstructor);
//
//        int actual = testPeople.getCount();
//
//        Assert.assertEquals(expected,actual);
//
//    }
//
//    @Test
//    public void testFindById(){
//
//        testPeople.add(testInstructor);
//
//        Person expected = testInstructor;
//
//        Person actual = testPeople.findById(666);
//
//        Assert.assertEquals(expected,actual);
//
//    }
//}
