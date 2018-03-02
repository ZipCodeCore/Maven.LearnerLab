package io.zipcoder.interfaces;

public final class ZipCodeWilmington{

    Students students = Students.getINSTANCE();
    Instructors instructors = Instructors.getInstance();
    private static final ZipCodeWilmington zipCodeWilmington = new ZipCodeWilmington();


    public void hostLecture(Teacher teacher, double numberOfHours){
       teacher.lecture(new Students[]{students}, numberOfHours);

    }
    public void hostOfLecture(long id, double numberOfHours) {
        Instructor forLecture = (Instructor) instructors.findPersonById(id);
        hostLecture(forLecture, numberOfHours);
    }

    public static ZipCodeWilmington getInstance () {
            return zipCodeWilmington;
        }

    }

