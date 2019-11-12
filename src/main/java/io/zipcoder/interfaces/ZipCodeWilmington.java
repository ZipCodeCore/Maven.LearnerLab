package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    private static final Students students = Students.getInstance();
    private static final Instructors instructors = Instructors.getInstance();

    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }

    public static void hostLecture (Teacher teacher, Double numberOfHours) {
        teacher.lecture((Student[]) students.toArray(), numberOfHours);
    }

    public static void hostLecture (Long id, Double numberOfHours) {
        Teacher teacher = (Instructor) instructors.findById(id);

        teacher.lecture((Student[]) students.toArray(), numberOfHours);
    }

    public static Map<Student, Double> getStudyMap() {
        Map<Student, Double> map = new HashMap<Student, Double>();
        for (Student student: students) {
            map.put(student, student.getTotalStudyTime());
        }
        return map;
    }

//    static {
//        INSTANCE = new ZipCodeWilmington();
//        students = Students.getInstance();
//        instructors = Instructors.getInstance();
//    }
}
