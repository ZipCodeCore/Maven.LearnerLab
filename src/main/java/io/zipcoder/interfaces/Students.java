package io.zipcoder.interfaces;

public final class Students extends People {

    //Singleton - a student collection (meaning that we have one
    // collection of however many students
    //eg- think of a Bank. they have one collection of customers BUT each customer is unique
    //just like each student is unique in our student class

    private  static final Students INSTANCE = new Students();

    private Students() {
    }

    public static Students getInstance() {
        return INSTANCE;
    }

}
