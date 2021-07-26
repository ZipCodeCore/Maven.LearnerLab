package io.zipcoder.interfaces;

public class Students extends People<Student>{
    private static final Students instance=new Students();

    private Students() {
        Student student1=new Student(1l,"Lisa");
        this.add(student1);
        this.add(new Student(2l,"Margarita"));
        this.add(new Student(3l,"Kabi"));
        this.add(new Student(4l,"Sam"));
        this.add(new Student(5l,"Sona"));
    }

    public static Students getInstance() {
        return instance;
    }

    public Student[] getArray() {
        return super.personList.toArray(new Student[0]);
    }
}
