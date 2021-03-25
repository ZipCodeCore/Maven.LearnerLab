package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public final class ZipCodeWilmington {

    private final Students students = Students.getInstance();
    private final Instructors instructors = Instructors.getInstance();
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    private ZipCodeWilmington(){
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.getArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        Teacher teacher = (Teacher) instructors.findById(id);
        hostLecture(teacher, numberOfHours);
    }

    public HashMap<Student, Double> getStudyMap(){
        HashMap<Student, Double> studyMap = new HashMap<Student, Double>();
        for(Person person : students.getArray()){
            Student student = (Student) person;
            studyMap.put(student, student.getTotalStudyTime());
        }
        return studyMap;
    }

    public static ZipCodeWilmington getInstance(){
        return INSTANCE;
    }


}
