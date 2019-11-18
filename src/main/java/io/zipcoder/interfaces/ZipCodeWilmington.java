package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZipCodeWilmington {
    private static final Students students = Students.getInstance();
    private static final Instructors instructors = Instructors.getInstance();
    private static final ZipCodeWilmington zcwINSTANCE = new ZipCodeWilmington();

    public ZipCodeWilmington() {

    }

   public void hostLecture(Teacher teacher, double numberOfHours) {

        teacher.lecture(students.toArray(), numberOfHours);
    }

   public void hostLecture(long id, double numberOfHours) {
        instructors.findById(id).lecture(students.toArray(), numberOfHours);
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> studyMap = new HashMap<Student, Double>();
        for (Student s : students) {
            studyMap.put(s, s.getTotalStudyTime());
        }
        return studyMap;
    }
    public static ZipCodeWilmington getInstance() {
        return zcwINSTANCE;
    }

}
