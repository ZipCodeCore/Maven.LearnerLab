public final class Instructors extends People<Instructor> {
    private static final Instructors INSTANCE = new Instructors();

    public static Instructors getInstance() {
        return INSTANCE;
    }

    private Instructors() {

//        Instructor tariq = new Instructor(99999);
//        Instructor leon = new Instructor(88888);
//        Instructor froilan = new Instructor(77777);
//        Instructor nhu = new Instructor(66666);
//
//        personList.add(tariq);
//        personList.add(leon);
//        personList.add(froilan);
//        personList.add(nhu);
          Instructor vince = new Instructor(11111);
          personList.add(vince);
    }

    @Override
    public Instructor[] getArray() {
        return personList.toArray(new Instructor[0]);
    }


}
