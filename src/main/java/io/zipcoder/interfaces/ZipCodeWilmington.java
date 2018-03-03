package io.zipcoder.interfaces;



public final class ZipCodeWilmington{

    private static Students students = Students.getINSTANCE();
    private static Instructors instructors = Instructors.getInstance();
    private static final ZipCodeWilmington zipCodeWilmington = new ZipCodeWilmington();


    private static void hostLecture(Teacher teacher, double numberOfHours){
       teacher.lecture(students.getListAsArray(), numberOfHours);

    }
    public static void hostOfLecture(long id, double numberOfHours) {
        Instructor forLecture = (Instructor) instructors.findPersonById(id);
        hostLecture(forLecture, numberOfHours);
    }

    public static ZipCodeWilmington getInstance () {
            return zipCodeWilmington;
        }

    }

