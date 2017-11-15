package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public final class ZipCodeWilmington {

    private final static ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    private final static Students students = Students.getINSTANCE();

    private final static Instructors instructors = Instructors.getINSTANCE();

    private ZipCodeWilmington() {

    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students.getArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {
        Instructor instructor = instructors.findById(id);
        instructor.lecture(students.getArray(), numberOfHours);

    }

    public static ZipCodeWilmington getINSTANCE() {
        return INSTANCE;
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> map = new HashMap<>();
        for(Student student : students.getArray()) {
            map.put(student, student.getTotalStudyTime());
        }
        return map;
    }
}
