package App;

public class Instructors extends People<Instructor> {

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

    @Override
    public Instructor[] getArray() {
        return personList.stream().toArray(Instructor[]::new);
    }
}
