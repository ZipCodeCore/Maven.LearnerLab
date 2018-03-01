package io.zipcoder.interfaces;

public final class Instructors extends People {

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
        instruct6.setName("Froilan");
        this.add((Person) dirOfEd);
        this.add((Person) instruct1);
        this.add((Person) instruct2);
        this.add((Person) instruct3);
        this.add((Person) instruct4);
        this.add((Person) instruct5);
        this.add((Person) instruct6);
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }

}
