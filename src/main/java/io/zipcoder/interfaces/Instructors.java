package io.zipcoder.interfaces;

public class Instructors extends People <Instructor> {
    private static Instructors INSTANCE;

    private Instructors(){
//        Instructor Kris = new Instructor (546L, "Kris");
//        Instructor Chris = new Instructor (547L, "Chris");
//        Instructor Dolio = new Instructor (548L, "Dolio");
//        Instructor Roberto = new Instructor (549L, "Roberto");
//        Instructor Froilan = new Instructor (550L, "Froilan");
//        personList.add(Kris);
//        personList.add(Chris);
//        personList.add(Dolio);
//        personList.add(Roberto);
//        personList.add(Froilan);

    }



    public static Instructors getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Instructors();
        }
        return INSTANCE;
    }

    static {
        INSTANCE = new Instructors();
        for (int i = 0; i < 5; i++) {
            INSTANCE.addPerson(new Instructor(i + 2L, "INSTRUCTOR" + i));
        }
    }

    @Override
    public Instructor[] listToArray() {
        return this.personList.toArray(new Instructor[0]);
    }
}
