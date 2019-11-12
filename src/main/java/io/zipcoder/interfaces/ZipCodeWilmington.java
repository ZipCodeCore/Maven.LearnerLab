package io.zipcoder.interfaces;

import java.util.LinkedHashMap;

public class ZipCodeWilmington {
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    private static final Students students = Students.getInstance();
    private static final Instructors instructors = Instructors.getInstance();

    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }

    public static void hostLecture (Teacher teacher, Double numberOfHours) {
        teacher.lecture(students.toArray(), numberOfHours);
    }

    public static void hostLecture (Long id, Double numberOfHours) {
        Teacher teacher = instructors.findById(id);

        teacher.lecture(students.toArray(), numberOfHours);
    }

    public static LinkedHashMap<Student, Double> getStudyMap() {
        LinkedHashMap<Student, Double> map = new LinkedHashMap<Student, Double>();
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
