package io.zipcoder.interfaces;

import java.util.ArrayList;

public final class ZipCodeWilmington {
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    private Instructors instructors = Instructors.getInstance();
    private Students students = Students.getInstance();
    private String studyTime;
    private ZipCodeWilmington() {
    }


    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }

    public void hostLectures(Teacher teacher, double numberOfHours) {
        Student[] studentsArray=students.getArray();
        for(Student ss:studentsArray){
            ss.getTotalStudyTime();
        }

        studyTime="Before\n****\n";
        for (int i=0; i<students.getCount(); i++) {
             studyTime+="ID: "+ students.getArray()[i]+"TotalStudyTime: "+students.getArray()[i].getTotalStudyTime()+"\n";
         }
            //System.out.println(studyTime);

        teacher.lecture(students.getArray(), numberOfHours);

        for (int i=0; i<students.getCount(); i++) {
            studyTime+="ID: "+ students.getArray()[i]+"TotalStudyTime: "+students.getArray()[i].getTotalStudyTime()+"\n";
        }
        System.out.println(studyTime);
    }

    public void hostLectures(long id, double numberOfHours) {


        Instructor teacher = instructors.findById(id);

       hostLectures(teacher, numberOfHours);
    }

    public String getStudyTime(){
        studyTime="";
        for (int i=0; i<students.getCount(); i++) {
            studyTime+="ID: "+ students.getArray()[i].getId()+"TotalStudyTime: "+students.getArray()[i].getTotalStudyTime()+"\n";
        }
        return studyTime;
    }

}
