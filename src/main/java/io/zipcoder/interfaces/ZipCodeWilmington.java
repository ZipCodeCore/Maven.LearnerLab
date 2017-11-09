package io.zipcoder.interfaces;

public class ZipCodeWilmington {

    private Students students = Students.getInstance();
    private Instructors insturctors = Instructors.getInstance();

    public void hostLecture(Teacher teacher, double numberOfHours) {

    teacher.lecture(students.personList.toArray(new Learner[students.personList.size()]), numberOfHours);}

    public void hostLecture(long id, double numberOfHours){
        Instructor instructor = (Instructor) insturctors.findById(id);
        instructor.lecture(students.personList.toArray(new Learner[students.personList.size()]), numberOfHours);

    }

    }

