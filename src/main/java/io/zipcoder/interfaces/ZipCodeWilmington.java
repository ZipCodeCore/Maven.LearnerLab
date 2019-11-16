package io.zipcoder.interfaces;
import io.zipcoder.*;
import java.util.Arrays;
import java.util.HashMap;

public final class ZipCodeWilmington {
    Students students;
    Instructors instructors;

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();


    protected ZipCodeWilmington() {
        this.instructors = Instructors.getInstance();
        this.students = Students.getInstance();
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        Learner[] newArr = Arrays.copyOf(students.toArray(), students.count(), Learner[].class);
         teacher.lecture(newArr, numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {
        Teacher teacher = (Teacher) instructors.findById(id);
        hostLecture(teacher, numberOfHours);
    }

    public HashMap getStudyMap() {
        HashMap<Student, Double> studyMap = new HashMap<>();
        for (Person student : students.toArray()) {
            studyMap.put((Student) student,((Student) student).getTotalStudyTime());
        }
        return studyMap;
    }

    public static ZipCodeWilmington getInstance(){
        return INSTANCE;
    }
}
