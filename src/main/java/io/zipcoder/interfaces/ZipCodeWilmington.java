package io.zipcoder.interfaces;

import io.zipcoder.interfaces.Enums.Educator;
import io.zipcoder.interfaces.People.Instructors;
import io.zipcoder.interfaces.People.Students;
import io.zipcoder.interfaces.Person.Instructor;

/**
 * filename:
 * project: interfaces-1
 * author: https://github.com/vvmk
 * date: 2/28/18
 */
public final class ZipCodeWilmington {
    private static final Students students = Students.getInstance();
    private static final Instructors instructors = Instructors.getInstance();

    private ZipCodeWilmington() {
    }

    public static ZipCodeWilmington getInstance() {
        return ZipCodeWilmingtonHelper.INSTANCE;
    }

    private void hostLecture(Instructor teacher, double numberOfHours) {
        teacher.lecture(students.getArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {
        hostLecture(instructors.findById(id), numberOfHours);
    }

    public void hostLecture(Educator educator, double numberOfHours) {
        hostLecture(educator.getInstructor(), numberOfHours);
    }

    private static class ZipCodeWilmingtonHelper {
        private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    }
}
