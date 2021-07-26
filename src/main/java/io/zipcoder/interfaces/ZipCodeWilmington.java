package io.zipcoder.interfaces;

import java.util.LinkedHashMap;
import java.util.Map;

public class ZipCodeWilmington {
    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();
    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.personList.toArray(new Learner[0]),numberOfHours);
    }
    public void hostLecture(Long id, double numberOfHours){
        hostLecture((Teacher)instructors.findById(id),numberOfHours);
    }

    public Map<Student,Double> getStudyMap(){
        Map<Student,Double> studentMap = new LinkedHashMap<Student, Double>();
        for(Person student : students){
            Student student1 = (Student)student;
            studentMap.put(student1, student1.getTotalStudyTime());
        }

        return studentMap;
    }
}
