package io.zipcoder.interfaces.People;

import io.zipcoder.interfaces.Enums.Educator;
import io.zipcoder.interfaces.Person.Instructor;

/**
 * filename:
 * project: interfaces-1
 * author: https://github.com/vvmk
 * date: 2/28/18
 */
public final class Instructors extends People<Instructor> {
    private Instructors() {
        super();

        for (Educator i : Educator.values())
            this.add(i.getInstructor());
    }

    public static Instructors getInstance() {
        return InstructorsHelper.INSTANCE;
    }

    public Instructor[] getArray() {
        return personList.toArray(new Instructor[0]);
    }

    private static class InstructorsHelper {
        private static final Instructors INSTANCE = new Instructors();
    }
}
