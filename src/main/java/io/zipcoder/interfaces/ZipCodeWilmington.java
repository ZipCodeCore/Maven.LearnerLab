package io.zipcoder.interfaces;

public class ZipCodeWilmington {

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    private Students students;
    private Instructors instructors;

   private  ZipCodeWilmington() {
        this.students = students.getInstance();
        this.instructors = instructors.getInstance();
    }



    public  void hostLecture(Instructor teacher, double numberOfHours) {
        Student[] arrayStudents = students.getArray();

        for (int i = 1; i < arrayStudents.length; i++) {
           teacher.teach( arrayStudents[i], numberOfHours);
        }


    }

    public void hostLecture(int id, double numberOfHours) {

       hostLecture (instructors.getArray()[id], numberOfHours);


    }

    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }
}