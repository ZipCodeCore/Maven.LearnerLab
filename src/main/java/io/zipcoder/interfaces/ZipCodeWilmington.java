package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public final class ZipCodeWilmington {
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    private static final Students students = Students.getInstance();
    private static final Instructors instructors = Instructors.getInstance();


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

        for (Student s : students) {
            timeMap.put(s, s.getTotalStudyTime());
        }
        return timeMap;
    }

    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }


}
