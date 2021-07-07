package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public final class ZipCodeWilmington {

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();
    Map<Student, Double> studyMap;

    public ZipCodeWilmington() {

        studyMap = new HashMap<Student, Double>();

    }

    public void hostLecture(Teacher teacher, double numberOfHours) {

        teacher.lecture(students.getArray(), numberOfHours);

    }

    public void hostLecture(Long id, double numberOfHours) {

        Teacher teacher = instructors.findById(id);

        teacher.lecture(students.getArray(), numberOfHours);

    }

    public Map<Student, Double> getStudyMap() {

        for (Student student : students) {

            studyMap.put(student, student.getTotalStudyTime());
        }

        return studyMap;
    }


    public static ZipCodeWilmington getInstance(){

        return INSTANCE;
    }

}
