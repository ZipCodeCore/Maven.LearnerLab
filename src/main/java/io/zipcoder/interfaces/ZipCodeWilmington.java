package io.zipcoder.interfaces;

public class ZipCodeWilmington {
    protected static Students students = Students.getINSTANCE();
    private static Instructors instructors = Instructors.getINSTANCE();

    private ZipCodeWilmington(){

    }


    public static void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.asLearners(), numberOfHours);
    }

    public static void hostLecture(long id, double numberOfHours){
        Teacher teacher = (Teacher) instructors.findById(id);
        Learner[] learners = students.asLearners();

        teacher.lecture(learners, numberOfHours);
    }

    public static void hostLecture(Educator educator, double numberOfHours){
        Teacher teacher = educator;
        Learner[] learners = students.asLearners();

        teacher.lecture(learners, numberOfHours);
    }

    public static Students getStudents() {
        return students;
    }
}
