package io.zipcoder.interfaces;

import java.util.LinkedHashMap;

public class ZipCodeWilmington {
    //private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    //public ZipCodeWilmington getInstance() {
//        return INSTANCE;
//    }


    private static final Students students = Students.getInstance();
    private static final Instructors instructors = Instructors.getInstance();


    public static void hostLecture(Teacher teacher, Double numberOfHours) {
        teacher.lecture(numberOfHours, students.listToArray());
    }

    public static void hostLectureById(Long id, Double numberOfHours) {
        hostLecture(instructors.findById(id), numberOfHours);

    }

    public static  LinkedHashMap<Student, Double> getStudyMap() {
        LinkedHashMap<Student, Double> myMap = new LinkedHashMap<>();
        for (Student student : students) {
            myMap.put(student, student.getTotalStudyTime());
        }

//            for (int i = 0; i < students.listToArray().length; i++) {
//                 myMap.put(students.listToArray()[i], students.listToArray()[i]
//
//            }
        return myMap;
    }

}
