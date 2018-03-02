package io.zipcoder.interfaces;

public final class  Instructors  extends People<Instructor> {

    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){
        Instructor dirOfEd = new Instructor(1000);
        dirOfEd.setName("Tariq");
        Instructor instruct1 = new Instructor(1001);
        instruct1.setName("Wilhelm");
        Instructor instruct2 = new Instructor(1002);
        instruct2.setName("Leon");
        Instructor instruct3 = new Instructor(1003);
        instruct3.setName("Froilan");
        Instructor instruct4 = new Instructor(1004);
        instruct4.setName("Nhu");
        Instructor instruct5 = new Instructor(1005);
        instruct5.setName("Kris");
        Instructor instruct6 = new Instructor(1006);
        instruct6.setName("Dolio");
        this.add(dirOfEd);
        this.add(instruct1);
        this.add(instruct2);
        this.add(instruct3);
        this.add(instruct4);
        this.add(instruct5);
        this.add(instruct6);
    }


    public void add(Instructor person) {
        personList.add(person);
    }

    @Override
    public Instructor[] getArray(){
        Instructor[] personArray = new Instructor[personList.size()];
        for(int i = 0; i<personList.size(); i++) {
            personArray[i] =(Instructor) personList.get(i);
        }
        return personArray;
    }


    public static Instructors getInstance(){
        return INSTANCE;
    }

}
