package io.zipcoder.interfaces;

import java.util.ArrayList;

public class Students extends People{



    private static final Students INSTANCE  = new Students();
   // public ArrayList<Student> studentList = new ArrayList<Student>();


   public String[] nameOfStudents = {"Aaron Herion", "Abrar Mohammed","Andrea Susnick","Andrew Kutchen",
                   "Brian Sutton","Claude McAlpin", "Donald Fountain" , "Elliott Kozulak", "Gabriela Lisboa",
                      "Graham Nilsen", "Greg Patselas","Jeff Lawrence", "Katherine Anderson",
                      "Kevin Buckley", "Lina Zhang", "Linda Qiu", "Logan Hanner", "Oleg Stirbu", "Pavel Parfenov",
                     "Raul Cubila Perez", "Rob Kruzel", "Ryan Maiale", "SAMUEL HAILE", "Timothy Rager", "Vince Paris",
                       "Wesley Connors","Zan Cheema","Merin Jose"};

      private   Students () {
    for (int i = 0; i < nameOfStudents.length; i++ ){
        Person person= new Student(i+1, ""+nameOfStudents);
        personList.add(person);
    }}

    public static Students getInstance() {
          return INSTANCE;
    }
}

