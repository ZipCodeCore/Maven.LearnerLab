package io.zipcoder.interfaces;

import java.util.ArrayList;

public class Students extends People  {
    private static final Students INSTANCE =new Students();

    private  Students() {
    Student student1 = new Student("Eric",1);
    Student student2 = new Student("Katrina",2);
    Student student3 = new Student("Vince",3);
    Student student4 = new Student("Madeline",4);

    this.add(student1);
    this.add(student2);
    this.add(student3);
    this.add(student4);

    }

    public Person[] getArray() {
        Person[] personArray = new Person[personList.size()];

       for (int i = 0; i < personArray.length; i++) {
            personArray[i] = (Person)personList.get(i);
        }
        return personArray;
    }


    public static Students getInstance() {
        return INSTANCE;
    }


    public Student[] getStudentArray(){
        Student[] students = new Student[getArray().length];
        for(int i =0; i<students.length;i++){
            students[i]=(Student)getArray()[i];
        }
        return students;
    }


}
