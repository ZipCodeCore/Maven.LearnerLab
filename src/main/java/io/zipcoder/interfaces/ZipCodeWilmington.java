package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {

    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();
    Map<Student, Double> studyMap;

    public ZipCodeWilmington() {

    }

    public void hostLecture(Teacher teacher, double numberOfHours) {

        teacher.lecture((Learner[]) students.toArray(), numberOfHours);

    }

    public void hostLecture(Long id, double numberOfHours) {

        Teacher teacher = (Teacher) instructors.findById(id);

        teacher.lecture((Learner[]) students.toArray(), numberOfHours);

    }

    public void getStudyMap() {

        studyMap = new HashMap<Student, Double>();

        for (Person person : students) {
            Student student = (Student) person;

            studyMap.put(student, student.getTotalStudyTime());
        }

    }

}
