package io.zipcoder.interfaces;

public class ZipCodeWilmington {

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();

    private ZipCodeWilmington(){



    }
    public static ZipCodeWilmington getInstance(){
        return INSTANCE;
    }

    //call the lecture method on teacher and the lecture
    public void hostLecture(Teacher teacher, double numberOfHours){
        // this method is supposed to increase the number of hours of studied time of students
        Student[] s = students.getStudentArray();
        teacher.lecture(s, numberOfHours);

    }
    public void hostLecture(long id, double numberOfHours){
       Instructor currentInstructor = instructors.findById(id);
       hostLecture(currentInstructor, numberOfHours);

    }
}
