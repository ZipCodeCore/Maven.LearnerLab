package io.zipcoder.interfaces;

public class ZipCodeWilmington{

    private static Students students = Students.getInstance();
    private static Instructors instructors = Instructors.getInstance();
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();


    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
        }

        private ZipCodeWilmington() {
    }

}
