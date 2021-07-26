package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public final class ZipCodeWilmington {

    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    private ZipCodeWilmington(){}

    public void hostLecture(Teacher teacher, double numberOfHours){
        Learner[] learners = new Learner[0];
        teacher.lecture(students.personList.toArray(new Learner[0]), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        hostLecture((Teacher) instructors.findById(id), numberOfHours);
    }

    public Map<Student, Double> getStudyMap(){
        Map<Student, Double> map = new HashMap<>();
        for(Person person : students){
            Student student = (Student) person;
            Double totalStudyTime =  student.getTotalStudyTime();
            map.put(student, totalStudyTime);
        }
        return map;
    }
    public static ZipCodeWilmington getInstance(){
        return  INSTANCE;
    }

}
