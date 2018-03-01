package io.zipcoder.interfaces;

public final class ZipCodeWilmington {
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    Students students;
    Instructors instructors;



    public static ZipCodeWilmington getInstance() {

        return INSTANCE;
    }

    private ZipCodeWilmington() {
        students = Students.getInstance();
        instructors = Instructors.getInstance();

    }


    public void hostLecture(Teacher teacher, double numberOfHours) {
//        the class should define a method hostLecture which makes use of a Teacher teacher, double numberOfHours parameter
//        to host a lecture to the composite people field in the students reference.
        teacher.lecture(students.getArray(), numberOfHours);

    }

    public void hostLecture(long id, double numberOfHours) {
//        The class should define a method hostLecture which makes use of a long id, double numberOfHours parameter to identify
//        a respective Instructor to host a lecture to the composite people field in the cohort reference.
        Instructor x = instructors.findById(id);
        hostLecture(x, numberOfHours);
    }

    public void hostLecture(Educator educator, double numberOfHours) {
//        the class should define a method hostLecture which makes use of a Teacher teacher, double numberOfHours parameter
//        to host a lecture to the composite people field in the students reference.
        educator.lecture(students.getArray(), numberOfHours);

    }
    }
