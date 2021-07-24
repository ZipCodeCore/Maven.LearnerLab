package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public enum ZipCodeWilmington {
     INSTANCE;
     final Students students = Students.getInstance();
     final Instructors instructors = Instructors.getInstance();

    public void hostLecture (Teacher teacher, double numberOfHours) {
        teacher.lecture(students.personList.toArray(new Learner[0]), numberOfHours);
    }

    public void hostLecture (long id, double numberOfHours) {
        Teacher teacher = instructors.findById(id);
        hostLecture(teacher, numberOfHours);
    }

    public Map<Student, Double> getStudyMap () {
        Map<Student, Double> result = new HashMap<>();
        for (Student student : students) {
            result.put(student, student.getTotalStudyTime());
        }
        return result;
    }
}
