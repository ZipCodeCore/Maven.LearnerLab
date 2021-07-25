package io.zipcoder.interfaces;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Stream;

public class ZipCodeWilmington {
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    private static final Students students = Students.getInstance();
    private static final Instructors instructors = Instructors.getInstance();

    private ZipCodeWilmington() {
    }

    public static ZipCodeWilmington getInstance(){
        return INSTANCE;
    }

    public void hostLecture(Teacher teacher, Double numberOfHours){
        teacher.lecture(students.toArray(), numberOfHours);
    }

    public void hostLecture(long id, Double numberOfHours){
        Teacher teacher = instructors.findById(id);
        hostLecture(teacher,numberOfHours);
    }

    public static Map<Student,Double> getStudyMap(){
        Map<Student,Double> studyMap = new HashMap<>();
//        Stream
//                .of(students.toArray())
//                .forEach(student -> studyMap.put(student,student.getTotalStudyTime()));
        Iterator iterator = students.iterator();
        while(iterator.hasNext()){
            Student student = (Student) iterator.next();
            studyMap.put(student,student.getTotalStudyTime());
        }
        return studyMap;
    }

    public static Instructors getInstructors() {
        return instructors;
    }

    public static Students getStudents() {
        return students;
    }
}