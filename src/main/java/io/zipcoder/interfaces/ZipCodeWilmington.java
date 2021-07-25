package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {


    static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    static final Students students = Students.getINSTANCE();
    static final Instructors instructors = Instructors.getINSTANCE();



    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students.toArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {
        instructors.findById(id).lecture(students.toArray(), numberOfHours);
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> studyMap = new HashMap<Student, Double>();
        for (Student element : students) {
            studyMap.put(element, element.getTotalStudyTime());
        }
        return studyMap;
    }

    public static ZipCodeWilmington getINSTANCE() {
        return INSTANCE;
    }
}
