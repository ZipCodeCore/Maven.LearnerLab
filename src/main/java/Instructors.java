public final class Instructors extends People {
    private static final Instructors INSTANCE = new Instructors();

    public static Instructors getInstance() {
        return INSTANCE;
    }

    private Instructors() {
        for (int i = 0; i < 4; i++){
            Instructor instructor = new Instructor(personList.size());
            add(instructor);
        }
    }
}
