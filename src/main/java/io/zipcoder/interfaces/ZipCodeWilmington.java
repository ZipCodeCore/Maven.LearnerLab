package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public enum ZipCodeWilmington{

    INSTANCE;
    Students classroom = Students.getInstance();
    Instructors instructors = Instructors.getInstance();

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(classroom.getArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {
        Teacher teacher = instructors.findByID(id);
        hostLecture(teacher, numberOfHours);
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> studyMap = new HashMap<>();
        for(Student student : classroom) {
            studyMap.put(student, student.getTotalStudyTime());
        }
        return studyMap;
    }


}
