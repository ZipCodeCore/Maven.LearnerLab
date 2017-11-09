package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public final class ZipCodeWilmington {

    private final static ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    private final static Instructors instructors = Instructors.getInstance();
    private final static Students students = Students.getInstance();

    private ZipCodeWilmington() {

    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students.getArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {
        Instructor instructor = (Instructor) instructors.findById(id);
        instructor.lecture(students.getArray(), numberOfHours);

    }

    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }

    public Map<Student, Double> getMap() {
        Map<Student, Double> map = new HashMap<Student, Double>();
        for(Student student : students.getArray()) {
            map.put(student, student.getTotalStudyTime());
        }
        return map;
    }
}