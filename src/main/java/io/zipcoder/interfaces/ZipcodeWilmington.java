package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public class ZipcodeWilmington {

    Students students=Students.getInstance();
    Instructors instructors=Instructors.getInstance();

    public void hostLecture(Teacher teacher,double numberOfHours){
        teacher.lecture(students.getArray(),numberOfHours);
    }

    public void hostLecture(long id,double numberOfHours){
        Teacher teacher=instructors.findByID(id);
        hostLecture(teacher,numberOfHours);
    }

    public Map<Student,Double> getStudyMap(){
        Map<Student,Double> studyMap=new HashMap<Student, Double>();
        for (Student student : students) {
            studyMap.put(student,student.getTotalStudyTime());
        }
        return studyMap;
    }
}
