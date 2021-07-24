package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public final class ZipCodeWilmington {
    private static final Students students = Students.getInstance();
    private static final Instructors instructors = Instructors.getInstance();
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    private ZipCodeWilmington(){}


    public static ZipCodeWilmington getInstance(){
        return INSTANCE;
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        Learner[] learners = students.personList.toArray(new Learner[0]);
        teacher.lecture(learners, numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        Instructor instructor =   instructors.personList.get((int)id);
        Learner[] learners =  students.personList.toArray(new Learner[0]);
        instructor.lecture(learners, numberOfHours);
    }

    public HashMap<Student, Double> getStudymap(){
        Learner[] learners = students.personList.toArray(new Learner[0]);
        HashMap<Student, Double> studyMap = new HashMap<>();
        for(Learner element : learners){
            studyMap.put((Student) element, element.getTotalStudyTime());
        }
        return studyMap;
    }

    public Students getStudents() {
        return students;
    }

    public Instructors getInstructors() {
        return instructors;
    }
}
