package io.zipcoder.interfaces;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.stream.Collector;

public class ZipCodeWilmington {

    private static final Students students=Students.getInstance();
    private static final Instructors instructors=Instructors.getInstance();
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    private ZipCodeWilmington(){
    }

    public static ZipCodeWilmington getInstance(){
        return INSTANCE;
    }

    public void hostLecture(Teacher passedTeacher, double passedNumberOfHours){

        passedTeacher.lecture(Students.getInstance().getArray(), passedNumberOfHours);

    }

    public void hostLecture(long passedId, double passedNumberOfHours){

          for (Educator e : Educator.values()){
              if (e.getInstructor().getId()==passedId){
                  this.hostLecture(e, passedNumberOfHours);
                  break;
              }
          }

    }

    public void hostLecture(Educator educator, double passedNumberOfHours){

        educator.lecture(students.getArray(), passedNumberOfHours);

    }

}
