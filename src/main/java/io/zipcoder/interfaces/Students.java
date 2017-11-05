package io.zipcoder.interfaces;



public final class Students extends People<Student> {

    private static final Students INSTANCE = null;

     Students(){

        for (long i=1; i<=29; i++) {
            Student student = new Student(i);
            this.personList.add(student);

        }

    }

    public Student[] getArray() {
      Student[] student = new Student[personList.size()];

      for (int i = 0; i< student.length; i++)
         student[i] = personList.get(i);

        return student;
    }


    public static Students getInstance(){
        return INSTANCE;
    }



}
