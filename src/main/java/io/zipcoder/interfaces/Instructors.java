package io.zipcoder.interfaces;

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

    private static class InstructorsHelper {
       private static final Instructors INSTANCE = new Instructors();
    }

    public static Instructors getInstance() {
        return InstructorsHelper.INSTANCE;
    }

    public Instructor[] getArray() {
        return personList.toArray(new Instructor[0]);
    }
}
