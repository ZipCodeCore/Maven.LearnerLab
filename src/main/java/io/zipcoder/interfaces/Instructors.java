package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor>{

    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){
        super();
        for (Educator i : Educator.values())
            this.add(i.getInstructor());
    }

    public static Instructors getInstance(){

        return INSTANCE;
    }

    public Instructor[] getArray() {
        return personList.toArray(new Instructor[0]);
    }

    @Override
    public void removeId(Instructor person) {

    }

    @Override
    public void removeId(Person person) {

    }

    private static class InstructorsHelper {
        private static final Instructors INSTANCE = new Instructors();
   }
}
