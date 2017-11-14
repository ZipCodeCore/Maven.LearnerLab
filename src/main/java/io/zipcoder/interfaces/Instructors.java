package io.zipcoder.interfaces;

public class Instructors extends People<Instructor> {
    private static final Instructors INSTANCE=new Instructors();

    private Instructors(){

        String[] listOfInstructors =
                {"Tariq Hook", "Iyasu Watts", "L. Dolio Durant", "Leon Hunter", "Froilan Miranda"};

        for (int i = 0; i < listOfInstructors.length; i++) {
                this.add(new Instructor(i, listOfInstructors[i]));

        }

    }

    public static Instructors getInstance() {
        return INSTANCE;
    }

    public Instructor[] getArray(){
        return this.personList.toArray(new Instructor[this.personList.size()]);
      //return (Instructor[])this.personList.toArray(); // Difference?
    }
}
