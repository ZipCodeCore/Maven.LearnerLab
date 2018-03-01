package io.zipcoder.interfaces;

public final class ZipCodeWilmington extends People {
    private static ZipCodeWilmington instance = null;
    private Students students;
    private Instructors instructors;

    private ZipCodeWilmington(){

    }

    public void hostLectures(Teacher teacher, double numberOfHours) {
        teacher.lecture(students.getStudentArray(), numberOfHours);
    }

    public void hostLectures(long id, double numberOfHours) {
       Instructor name =  (Instructor) instructors.findById(id);
       hostLectures(name, numberOfHours);
    }


    public static ZipCodeWilmington getInstance() {
        if (instance == null) {
            instance = new ZipCodeWilmington();
        }
        return instance;
    }
}
