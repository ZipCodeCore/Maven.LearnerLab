package io.zipcoder.interfaces;

//final make the class unextendable
public final class Students extends People {
    //now this is the only student we have and private and final keep people who need
    //to use our code from changing it
    private static final Students INSTANCE = new Students();

    private Students(){

    }
    //the getInstance method returns an instance and is type Student
    public static Students getInstance(){
        return INSTANCE;
    }
}
