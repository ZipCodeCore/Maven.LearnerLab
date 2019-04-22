package io.zipcoder.interfaces;

public final class Students extends People implements Learner{
    private static final Students INSTANCE = new Students();

    private Students(){
       Student s1 = new Student(647, "Kieran", 0);
       Student s2 = new Student(983, "Owen", 0);
       Student s3 = new Student(354, "Jordan", 0);
       Student s4 = new Student(832, "Lawrence", 0);
       Student s5 = new Student(835, "Brian", 0);
       Student s6 = new Student(231, "Madelyn", 0);
       Student s7 = new Student(297, "Jess", 0);
       Student s8 = new Student(356, "Katrice", 0);
       Student s9 = new Student(945, "Kat", 0);
       Student s10 = new Student(742, "Keith", 0);
       }

    public static Students getINSTANCE() {
        return INSTANCE;
    }

    @Override
    public void learn(double numberOfHours) {

    }
}
