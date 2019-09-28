package io.zipcoder.interfaces;

public final class ZipCodeWilmington {

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    private Students students = Students.getINSTANCE();
    private Instructors instructors = Instructors.getINSTANCE();

    private ZipCodeWilmington() { }

    public static ZipCodeWilmington getINSTANCE() {
        return INSTANCE;
    }

    public void hostLecture(ITeacher teacher, double numberOfHours) {

        teacher.lecture(students.getArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {

        hostLecture(instructors.findById(id), numberOfHours);
    }

}

/**
 * Part 9.1 - Create ZipCodeWilmington Class
 * <p>
 * Use Part 7 as a reference.
 * Create a ZipCodeWilmington singleton.
 * The class should declare a field that references the instance of Students called students.
 * The class should declare a field that references the instance of Instructors called instructors.
 * <p>
 * The class should define a method hostLecture which makes use of a Teacher teacher, double
 * numberOfHours parameter to host a lecture to the composite people field in the students reference.
 * <p>
 * The class should define a method hostLecture which makes use of a long id, double numberOfHours
 * parameter to identify a respective Instructor to host a lecture to the composite people field in the
 * cohort reference.Part 10.3 - Refactor ZipCodeWilmington class
 * <p>
 * Refactor the hostLecture method in the ZipCodeWilmington class by removing any intermediate casting trick(s).
 */
/**Part 10.3 - Refactor ZipCodeWilmington class

 Refactor the hostLecture method in the ZipCodeWilmington class by removing any intermediate casting trick(s).*/

//to host a lecture to the composite people field in the students reference.
//composite people field refers to the personList aka Students
//Learner is an interface. I need an array of learners which is an array of anything
//that implements the learner interface. Student extends Person and implements ILearner.
//Students implements people and people has an arraylist of person or anything that extends person.
//Students.getINSTANCE().getArray() returns an array of person objects. Need to retrieve students array
//teacher.lecture((ILearner[])students.getArray(), numberOfHours);