package io.zipcoder.interfaces.People;

import io.zipcoder.interfaces.Enums.ZipcodeStudents;
import io.zipcoder.interfaces.Person.Student;

/**
 * filename:
 * project: interfaces-1
 * author: https://github.com/vvmk
 * date: 2/27/18
 */
public final class Students extends People<Student> {
    private Students() {
        super();

        for (ZipcodeStudents s : ZipcodeStudents.values())
            this.add(new Student(s.getID()));
    }

    public static Students getInstance() {
        return StudentsHelper.INSTANCE;
    }

    public Student[] getArray() {
        return personList.toArray(new Student[0]);
    }

    private static class StudentsHelper {
        private static final Students INSTANCE = new Students();
    }
}
