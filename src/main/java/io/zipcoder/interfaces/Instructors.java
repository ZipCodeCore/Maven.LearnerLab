package io.zipcoder.interfaces;

public class Instructors extends People <Instructor> {
    private static final Instructors INSTANCE = new Instructors();

    public static Instructors getInstance()
    {
        return INSTANCE;
    }

    private Instructors()
    {
        Instructor instructor1 = new Instructor("Amy", 1);
        Instructor instructor2 = new Instructor("Joan", 2);
        Instructor instructor3 = new Instructor("Julia", 3);
        Instructor instructor4 = new Instructor("Jesse", 4);

        this.add(instructor1);
        this.add(instructor2);
        this.add(instructor3);
        this.add(instructor4);
    }

    public Instructor[] getArray()
    {
        Instructor[] instructorArray = new Instructor[personList.size()];
        for (int i = 0; i < instructorArray.length; i++)
        {
            instructorArray[i] = personList.get(i);

        }

        return instructorArray;
    }

}
