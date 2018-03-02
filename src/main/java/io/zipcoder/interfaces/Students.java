package io.zipcoder.interfaces;

public class Students extends People <Student> {
    private static final Students INSTANCE = new Students();

    public static Students getInstance() {
        return INSTANCE;
    }

    private Students() {
        Student student1 = new Student("James", 1L);
        Student student2 = new Student("Derrick", 2L);
        Student student3 = new Student("William", 3L);
        Student student4 = new Student("Jake", 4L);
        Student student5 = new Student("Tim", 5L);

        this.add(student1);
        this.add(student2);
        this.add(student3);
        this.add(student4);
        this.add(student5);
    }
    //Creating a newArrry



    public Student[] getArray() {


        Student[] studentArray = new Student[personList.size()];
        for (int i = 0; i < studentArray.length; i++)
        {
            studentArray[i] = personList.get(i);

        }

        return studentArray;
    }

}
