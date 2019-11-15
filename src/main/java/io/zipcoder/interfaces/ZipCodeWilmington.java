package io.zipcoder.interfaces;

import interfaces.Learner;
import interfaces.Teacher;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZipCodeWilmington {


    private List<Student> students = Students.getInstance();
    private List<Instructor> instructors = Instructors.getInstance();
    private Map<Student, Double> studyMap;

    public void hostLecture(Teacher teacher, double numberOfHours){
        for (Instructor eachInstructor : instructors){
            if (eachInstructor == teacher){
                //              needed to cast (new Learner[0])
                eachInstructor.lecture(students.toArray(new Learner[0]),numberOfHours);
            }
        }
    }

    public void hostLecture(long id, double numberOfHours){
        for (Instructor eachInstructor : instructors){
            if (eachInstructor.getId() == id){
//              needed to cast (new Learner[0])
                eachInstructor.lecture(students.toArray(new Learner[0]),numberOfHours);
            }
        }
    }

    public Map<Student,Double> getStudyMap(){
        studyMap = new HashMap<Student, Double>();
        return studyMap;
    }
}
