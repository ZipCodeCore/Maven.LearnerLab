package io.zipcoder.interfaces;

public final class ZipCodeWilmington {

    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();

    public void hostLecture(Teacher teacher, double numberOfHours){

        //made this method void as I was not entirely clear on what the method/method body was supposed to do
    }

    public void hostLecture(long id, double numberofHours){

        Instructor instructor = (Instructor) instructors.findById(id);
        //as above, not clear on what to do to "host lecture to the composite people field" in instructions
    }
}
