package io.zipcoder.interfaces;

public final class ZipCodeWilmington {

     private static ZipCodeWilmington instance;
     Students students;
     Instructors instructors;


     private ZipCodeWilmington() {
          this.students = Students.getInstance();
          this. instructors = Instructors.getInstance();

     }

     public static ZipCodeWilmington getInstance(){
          if(instance == null){
               instance = new ZipCodeWilmington();
          }
          return instance;
     }

     public void hostLecture(Teacher teacher, double numberOfHours){

          for(Person p : students.getArray()){
               teacher.teach((Student) p, numberOfHours/students.getArray().length);
          }

     }

     public void hostLecture(long ID, double numberOfHours){
          Teacher teacher = (Instructor) instructors.findByID(ID);
          for(Person p : students.getArray()){
               teacher.teach((Student) p, numberOfHours/students.getArray().length);
          }
     }

}
