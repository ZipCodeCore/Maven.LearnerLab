package io.zipcoder.interfaces;

import interfaces.Learner;
import interfaces.Teacher;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ZipCodeWilmington {

    private static final ZipCodeWilmington INSTANCE =new ZipCodeWilmington();

    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();
    private Map<Student, Double> studyMap;

    private ZipCodeWilmington(){
        // constructor;
    }

    public static ZipCodeWilmington getInstance(){
        return INSTANCE;
    }



    public void hostLecture(Teacher teacher, double numberOfHours){
        for (Instructor eachInstructor : instructors){
            if (eachInstructor == teacher){
                eachInstructor.lecture(students.toArray(),numberOfHours);
            }
        }
    }

    public void hostLecture(long id, double numberOfHours){
        for (Instructor eachInstructor : instructors){
            if (eachInstructor.getId() == id){
                eachInstructor.lecture(students.toArray(),numberOfHours);
            }
        }
    }

    public Map<Student,Double> getStudyMap(){
        studyMap = new HashMap<Student, Double>();
        for (Student eachStudent : this.students){
            studyMap.put(eachStudent,eachStudent.getTotalStudyTime());
        }
        return studyMap;
    }
}
