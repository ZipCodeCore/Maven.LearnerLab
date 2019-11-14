package io.zipcoder.interfaces;

public class Instructors extends People<Instructor> {

    public static final Instructors INSTANCE = new Instructors();

        private Instructors(){
            Instructor instructor1 = new Instructor(2323L, "Boop");
            Instructor instructor2 = new Instructor(3232L, "Bip");
            personList.add(instructor1);
            personList.add(instructor2);

        }

        public static Instructors getInstance(){
            return INSTANCE;
        }

    @Override
    public Instructor[] toArray() {
        return personList.toArray(new Instructor[personList.size()]);
    }
}
