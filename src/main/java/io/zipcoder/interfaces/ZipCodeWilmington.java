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

     public void hostLecture(Educator teacher, double numberOfHours){
          teacher.lecture(students.getArray(), numberOfHours);
     }

     public void hostLecture(long ID, double numberOfHours) {
          instructors.findByID(ID).lecture(students.getArray(), numberOfHours);
     }

}
