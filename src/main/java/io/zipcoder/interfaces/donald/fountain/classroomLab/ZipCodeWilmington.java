package io.zipcoder.interfaces.donald.fountain.classroomLab;

public final class ZipCodeWilmington {

    private final static ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    private ZipCodeWilmington(){
    }

    public Students students = Students.getInstance();
    public Instructors instructors = Instructors.getInstance();

    public void hostLecture(Teacher teacher, double numberOfHours){

        Learner[] learners = students.personList.toArray(new Learner[students.personList.size()]);
                teacher.lecture(learners, numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        Teacher teaching = (Teacher) instructors.findById(id);

        Learner[] learners = students.personList.toArray(new Learner[students.personList.size()]);
        teaching.lecture(learners, numberOfHours);
    }

    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }
}
