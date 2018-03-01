package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor> {

    private  static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        Instructor tariq = new Instructor(1111);
        tariq.setName("Tariq");
        personList.add(tariq);
        Instructor leon = new Instructor(2222);
        leon.setName("Leon");
        personList.add(leon);
        Instructor kris = new Instructor(3333);
        kris.setName("Kris");
        personList.add(kris);
        Instructor froilan = new Instructor(4444);
        froilan.setName("Froilan");
        personList.add(froilan);
        Instructor nhu = new Instructor(5555);
        nhu.setName("Nhu");
        personList.add(nhu);
        Instructor willhelm = new Instructor(6666);
        willhelm.setName("Willhelm");
        personList.add(willhelm);
        Instructor dolio = new Instructor(7777);
        dolio.setName("Dolio");
        personList.add(dolio);



    }

    public static Instructors getInstance() {
        return INSTANCE;
    }


    @Override
    public Instructor[] getArray() {
            Instructor[] instructor = new Instructor[getArray().length];
            for (int i = 0; i < instructor.length; i++){
                instructor[i] = (Instructor) getArray()[i];
            }

            return instructor;
    }
}//singleton classs. a class is turned in to a object 'kind of"
// and put in to a new class
