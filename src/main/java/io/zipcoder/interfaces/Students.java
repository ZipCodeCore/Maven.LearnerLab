package io.zipcoder.interfaces;

//final make the class unextendable
public final class Students extends People {
    //now this is the only student we have and private and final keep people who need
    //to use our code from changing it
    private static final Students INSTANCE = new Students();
    private Student[] studentsArray;

    private Students(){
        Student rodney = new Student(1L);
        Student amonnie = new Student(2L);
        Student imani = new Student(3L);
        Student nate = new Student(4L);
        Student hannah = new Student(5L);

        studentsArray = new Student[]{rodney, amonnie, imani, nate, hannah};
    }

    Person[] getArray() {
        return new Person[0];
    }

    @Override
    public void removeId(Instructor person) {

    }

    @Override
    public void removeId(Person person) {

    }

    //the getInstance method returns an instance and is type Student
    public static Students getInstance(){

        return INSTANCE;
    }

    public Student[] getStudentArray(){
        return this.studentsArray;
    }
}
