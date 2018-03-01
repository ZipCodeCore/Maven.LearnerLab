package io.zipcoder.interfaces;

public final class Students extends People <Student>{

    private static final Students INSTANCE= new Students();

    private Students(){
    Student Karl = new Student(444);
    Student George = new Student(555);
    Student Pete = new Student(666);
    Student Chuck = new Student(777);
    Student Chris = new Student(888);
    Student Alburto = new Student(999);

    this.add(Karl);
    this.add(George);
    this.add(Pete);
    this.add(Chuck);
    this.add(Chris);
    this.add(Alburto);

    }

    public static Students getInstance(){
//        if (INSTANCE == null){
//            INSTANCE = new Students();
//        }
        return INSTANCE;
    }

    public Student[] getStudentArray(){

        Student[] arrayOfStudents = new Student[getArray().length];

        for(int i = 0; i < getArray().length; i++){
            arrayOfStudents[i] = getArray()[i];
        }
        return arrayOfStudents;
    }

    public Student[] getArray(){

//        Student[] arrayOfPerson = new Student[personList.size()];
        return personList.toArray(new Student[personList.size()]);
    }



}
