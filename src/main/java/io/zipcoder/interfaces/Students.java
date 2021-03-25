package io.zipcoder.interfaces;


public final class Students extends People<Student> {

    private static final Students INSTANCE;// = new Students();

    public static Students getInstance(){
        return INSTANCE;
    }


    public Student[] toArray() {
        Student[] studentArray = new Student[this.INSTANCE.count()];
        int i = 0;
        for (Student eachStudent : this.INSTANCE){
            studentArray[i++] = eachStudent;
        }
        return studentArray;
    }

    // the below is how you instantiate it
    static {
        INSTANCE = new Students();
        INSTANCE.add(new Student(30L,"John"));
        INSTANCE.add(new Student(31L, "V"));
        INSTANCE.add(new Student(32L,"X"));
    }
}
