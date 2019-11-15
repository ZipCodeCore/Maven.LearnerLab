package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public final class ZipCodeWilmington {
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    Students students = Students.getInstance();
    Instructors instructors;


    private ZipCodeWilmington() {

    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students.toArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {
        Teacher teacher = (Instructor) instructors.findById(id);
        teacher.lecture(students.toArray(), numberOfHours);

    }

    public Map getStudyMap() {
        Map<Student, Double> timeMap = new HashMap<Student, Double>();

        for (Person student : students) {
            timeMap.put(student, student.);
        }
        return timeMap;
    }


}
