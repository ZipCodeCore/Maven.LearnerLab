package io.zipcoder.interfaces;

import java.util.HashMap;

public class ZipCodeWilmington {
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    private static final Students students = Students.getInstance();
    private static final Instructors instructors = Instructors.getInstance();

    public void hostLecture(Teacher teacher, Double numberOfHours){
        teacher.lecture(students.toArray(), numberOfHours);
    }

    public void hostLecture(Long id, Double numberOfHours){
        Teacher teacher = instructors.findByID(id);
        teacher.lecture(students.toArray(),numberOfHours);
    }

    public HashMap<Student, Double> getStudyMap(Student student){
        HashMap<Student, Double> studyMap= new HashMap<>();
        studyMap.put(student, student.getTotalStudyTime());

        return studyMap;
    }
}
