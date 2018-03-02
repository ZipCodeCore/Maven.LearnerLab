package io.zipcoder.interfaces;

import java.util.ArrayList;
import static io.zipcoder.interfaces.Educator.TARIQ;

public final class Instructors extends People<Instructor> implements Teacher {

    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){
        Instructor dirOfEd = new Instructor(1000);

        this.add(dirOfEd);
        Instructor instruct1 = new Instructor( 1001);
        instruct1.setName("Wilhelm");
        this.add(instruct1);
        Instructor instruct2 = new Instructor( 1002);
        instruct2.setName("Leon");
        this.add(instruct2);
        Instructor instruct3 = new Instructor( 1003);
        instruct3.setName("Froilan");
        this.add(instruct3);
        Instructor instruct4 = new Instructor( 1004);
        instruct4.setName("Nhu");
        this.add(instruct4);
        Instructor instruct5 = new Instructor( 1005);
        instruct5.setName("Kris");
        this.add(instruct5);
        Instructor instruct6 = new Instructor( 1006);
        instruct6.setName("Dolio");
        this.add(instruct6);

    }


    @Override
    public Instructor[] getArray(){
        Instructor[] personArray = new Instructor[personList.size()];
        for(int i = 0; i<personList.size(); i++) {
//            personArray[i] = personList.get(i);
        }
        return personArray;
    }


    public static Instructors getInstance(){
        return INSTANCE;
    }

    public void teach(Learner learner, double numberOfHours) {

    }

    public void lecture(Learner[] learners, double numberOfHours) {

    }
}
