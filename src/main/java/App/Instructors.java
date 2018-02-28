package App;

public class Instructors extends People {

    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        for(int i = 0; i < 6; i++) {
            Instructor instructor = new Instructor(personList.size());
            addPerson(instructor);
        }
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }
}
