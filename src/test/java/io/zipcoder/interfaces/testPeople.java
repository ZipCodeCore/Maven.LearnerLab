package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class testPeople {
   // People people = new People();
//    Person person1= new Person(23,"Merin");
//    Person person2= new Person(24,"Lina");
//    Person person3= new Person(25,"Sam");
//    @Test
//    People<Instructor> listInstructors = new People<Instructor>() {
//       @Override
//       public Instructor[] getArray() {
//           return new Instructor[0];
//       }
//   };
    @Test
    public void testAdd(){
        Students students = Students.getInstance();
        Instructors instructors = Instructors.getINSTRUCTORSINSTANCE();
        Instructor instructor1= new Instructor(100,"Dolio");
        Student student1 = new Student(45,"Lina",8.00);
        Student student2 = new Student(46,"Merin",2.00);
        students.add(student1);
        students.add(student2);
        instructors.add(instructor1);
        Assert.assertEquals(instructors.personList.get(instructors.personList.size()-1).getName(),"Dolio");
        Assert.assertEquals(students.personList.get(students.personList.size()-1).getName(),"Merin");
    }
    @Test
    public void testRemove(){
        Students students = Students.getInstance();
        Instructors instructors = Instructors.getINSTRUCTORSINSTANCE();
        Instructor instructor1= new Instructor(25,"Dolio");
        instructors.add(instructor1);
        Student student1 = new Student(100,"Lina",8.00);
        students.add(student1);

        instructors.personList.remove(4);
        System.out.println(instructors.personList.size());
        Assert.assertEquals(4,instructors.personList.size());
        Assert.assertFalse(instructors.personList.contains(instructor1));
    }
    @Test
    public void testFindById(){
        Students students = Students.getInstance();
        Instructors instructors = Instructors.getINSTRUCTORSINSTANCE();
        Student student2 = new Student(34,"Merin",2.00);
        students.add(student2);
        Assert.assertEquals(students.findById(34),student2);

    }
    @Test
    public void testremoveObj(){
        Students students = Students.getInstance();
        Student student1 = new Student(24,"Lina",8.00);
        students.add(student1);
        students.removeObj(student1);
        Assert.assertFalse(students.personList.contains(student1));

    }
}
