package io.zipcoder.interfaces;

public final class Students extends People implements Learner{
    private static final Students INSTANCE = new Students();

    private Students(){
       Student s1 = new Student(getId(), "Kieran", 0);
       Student s2 = new Student(getId(), "Owen", 0);
       Student s3 = new Student(getId(), "Jordan", 0);
       Student s4 = new Student(getId(), "Lawrence", 0);
       Student s5 = new Student(getId(), "Brian", 0);
       Student s6 = new Student(getId(), "Madelyn", 0);
       Student s7 = new Student(getId(), "Jess", 0);
       Student s8 = new Student(getId(), "Katrice", 0);
       Student s9 = new Student(getId(), "Kat", 0);
       Student s10 = new Student(getId(), "Keith", 0);
       }

    public static Students getINSTANCE() {
        return INSTANCE;
    }

    @Override
    public void learn(double numberOfHours) {

    }
}
