package io.zipcoder.interfaces;
import interfaces.Teacher;

import java.util.HashMap;
import java.util.Map;

public final class ZipCodeWilmington {

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    private static Students students = Students.getInstance();
    private static Instructors instructors = Instructors.getInstance();
    private static Map<Student, Double> studyMap;


    public static ZipCodeWilmington getInstance(){
        return INSTANCE;
    }


    // static so it can be accessed directly
    public static void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.toArray(),numberOfHours);
    }

    public static void hostLecture(long id, double numberOfHours){
        instructors.findById(id).lecture(students.toArray(),numberOfHours);
    }

    public static Map<Student,Double> getStudyMap(){
        studyMap = new HashMap<Student, Double>();
        for (Student eachStudent : students){
            studyMap.put(eachStudent,eachStudent.getTotalStudyTime());
        }
        return studyMap;
    }
}
