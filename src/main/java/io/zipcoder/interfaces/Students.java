package io.zipcoder.interfaces;


import java.util.ArrayList;

public final class Students extends People<Student> {

    private static final Students INSTANCE = new Students();
    private ArrayList<Student> studentsList= new ArrayList<>();

   private String[] studentName = {"Aaron Herion", "Abrar Mohammed","Andrea Susnick","Andrew Kutchen",
           "Brian Sutton","Claude McAlpin", "Donald Fountain" , "Elliott Kozulak", "Gabriela Lisboa",
           "Graham Nilsen", "Greg Patselas","Jeff Lawrence", "Katherine Anderson",
           "Kevin Buckley", "Lina Zhang", "Linda Qiu", "Logan Hanner", "Oleg Stirbu", "Pavel Parfenov",
           "Raul Cubila Perez", "Rob Kruzel", "Ryan Maiale", "SAMUEL HAILE", "Timothy Rager", "Vince Paris",
            "Wesley Connors","Zan Cheema"};


      Students(){

        for (int i=0; i< studentName.length ; i++) {
            Student student = new Student(i, studentName[i]);
            studentsList.add(student);

        }

    }

    public Student[] getArray() {
      Student[] student = new Student[studentsList.size()];

      for (int i = 0; i< student.length; i++)
         student[i] = studentsList.get(i);

        return student;
    }


    public static Students getInstance(){
        return INSTANCE;
    }

    @Override

    public String toString (){
        String studentName = "";

        for (Student s: studentsList)

      studentName +=  s.toString() + "," ;

        return  studentName;

    }





}
