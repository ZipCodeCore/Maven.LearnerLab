package io.zipcoder.interfaces;

import java.util.ArrayList;

public class Students extends People<Student>  {
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
    public static Students getInstance() {
        return INSTANCE;
    }

    public Student[] getArray() {
        Student[] arrayOfStudent = new Student[personList.size()];

       for (int i = 0; i < arrayOfStudent.length; i++) {
            arrayOfStudent[i] = personList.get(i);
        }
        return arrayOfStudent;
    }

}
