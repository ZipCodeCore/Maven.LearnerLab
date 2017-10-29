package io.zipcoder.interfaces;

public final class ZipCodeWilmington extends People {
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

        studyTime="";
         for (int i=0; i<students.getCount(); i++) {
             studyTime+="ID: "+ students.getArray()[i].getId()+"TotalStudyTime: "+students.getArray()[i].getTotalStudyTime()+"\n";
         }
             System.out.println(studyTime);

        teacher.lecture(students.getArray(), numberOfHours);

    }

    public void hostLectures(long id, double numberOfHours) {

        Teacher teacher = instructors.findById(id);

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
