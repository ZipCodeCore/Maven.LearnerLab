package io.zipcoder.interfaces;

import com.sun.org.apache.bcel.internal.generic.InstructionTargeter;

import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {

    private static final Students students = Students.getInstance();
    private static final Instructors instructors = Instructors.getInstance();
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    private ZipCodeWilmington(){
    }

    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }

    public void hostLecture(Educator teacher, double numberOfHours){
       teacher.lecture(students.elementList.toArray(new Learner[0]), numberOfHours);
    }

    public void hostLecture(Long id, double numberOfHours){
        Teacher teacher = (Teacher) instructors.findById(id);
        Learner[] learner = students.elementList.toArray(new Learner[0]);
        teacher.lecture(learner, numberOfHours);
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> map = new HashMap<>();
        for (int i = 0; i < students.elementList.size(); i++) {
            Student s = (Student) students.elementList.get(i);
            map.put(s,s.getTotalStudyTime());
        }
        return map;
    }
}
