package io.zipcoder.interfaces;

public final class Students extends People<Student> {

    //Singleton - a student collection (meaning that we have one
    // collection of however many students
    //eg- think of a Bank. they have one collection of customers BUT each customer is unique
    //just like each student is unique in our student class

    //one ARRAYLIST instance which is where we can add our students

    private  static final Students INSTANCE = new Students();

    private Students() {

    }

    public static Students getInstance() {
        return INSTANCE;
    }
//created
//    public Student[] getStudentArray (){
//        Student[] student = new Student[getArray().length];
//        for (int i = 0; i < student.length; i++){
//            student[i] = (Student) getArray()[i];
//        }
//
//        return student;
//
//    }

    @Override
    public Student[] getArray() {
        return personList.toArray(new Student[0]);

    }
}
