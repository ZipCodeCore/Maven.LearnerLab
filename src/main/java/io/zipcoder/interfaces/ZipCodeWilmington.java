package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    static final Instructors instructors = Instructors.getInstance();
    static final Students students = Students.getInstance();

    private ZipCodeWilmington(){}

    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }


    public void hostLecture(Teacher teacher, Double numberOfHours){
        Student[] learners = students.toArray();
        teacher.lecture(learners, numberOfHours);
    }

    public void hostLecture(Long id, Double numberOfHours){
        Teacher teacher = (Teacher) instructors.findById(id);
        Student[] learners = students.toArray();
        teacher.lecture(learners, numberOfHours);
    }

    public Map<Student, Double> getStudyMap(){
        Map<Student, Double> studyMap = new HashMap<>();

        for (Person student : students.personList) {
            Student thisStudent = (Student) student;
            studyMap.put(thisStudent, thisStudent.getTotalStudyTime());
        }
        return studyMap;
    }
}
