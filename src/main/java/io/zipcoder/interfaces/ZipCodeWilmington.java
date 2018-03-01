package io.zipcoder.interfaces;

//Use Part 7 as a reference.
//        Create a ZipCodeWilmington singleton.
//        The class should declare a field that references the instance of
//        Students called students.
//        The class should declare a field that references the instance of Instructors called instructors.
//        The class should define a method hostLecture which makes use of a Teacher teacher,
//        double numberOfHours parameter to host a lecture to the composite
//        people field in the students reference.
//        The class should define a method hostLecture which makes use of a long id,
//        double numberOfHours parameter
//        to identify a respective Instructor to host a lecture to the composite people
//        field in the cohort reference.


public class ZipCodeWilmington {
    private  Students students= Students.getInstance();
    private Instructors instructors=Instructors.getInstance();
    public Student student;
    //public Teacher teacher;
    public People people;

    private static ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }

    private ZipCodeWilmington() {
    }

    public void hostLecture(Teacher teacher,double numberOfHours){
        teacher.lecture(students.getStudentArray(),numberOfHours);
    }
    public void hostLecture(long id,double numberOfHours){
        Instructor teacher = (Instructor) Instructors.getInstance().findById(id);
        teacher.lecture((Student[])Students.getInstance().getArray(),numberOfHours);
    }



}
