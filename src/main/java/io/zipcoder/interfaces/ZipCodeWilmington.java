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
        Student[] learners = students.getArray();
        teacher.lecture(learners, numberOfHours);
    }

    public void hostLecture(Long id, Double numberOfHours){
        Teacher teacher = instructors.findById(id);
        Student[] learners = students.getArray();
        teacher.lecture(learners, numberOfHours);
    }

    public Map<Student, Double> getStudyMap(){
        Map<Student, Double> studyMap = new HashMap<>();

        for (Student student : students.personList) {
            studyMap.put(student, student.getTotalStudyTime());
        }
        return studyMap;
    }
}
