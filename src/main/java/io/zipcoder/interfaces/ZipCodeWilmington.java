package io.zipcoder.interfaces;

import java.util.LinkedHashMap;
import java.util.Map;

public class ZipCodeWilmington {
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    private static final Students students = Students.getInstance();
    private static final Instructors instructors = Instructors.getInstance();

    public static void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.toArray(), numberOfHours);
    }

    public static void hostLecture(long id, double numberOfHours){
        Teacher teacher = instructors.findById(id);
        teacher.lecture(students.toArray(), numberOfHours);

        //instructors.findById(id).lecture(students.toArray(), numberOfHours);
    }

    public static LinkedHashMap<Student, Double> getStudyMap(){
        LinkedHashMap<Student, Double> map = new LinkedHashMap<Student, Double>();
        for(Student student : students) {
            map.put(student, student.getTotalStudyTime());
        }
        return map;
    }
}
