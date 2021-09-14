package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public final class Students extends People<Student>{

public static final Students INSTANCE = new Students();

private Students (){
       Student Tati = new Student(9098, "Tati");
        Student jen = new Student(8383, "jen");
        Student John = new Student(4242, "John");

       add(Tati);
        add(jen);
       add(John);

}

    public static Students getInstance(){
        return INSTANCE;
    }




        @Override
        public Student[] toArray() {
                //return new Student[0];
                Student[] studentArray = new Student[personList.size()];
                personList.toArray(studentArray);
                return studentArray;
        }







}
