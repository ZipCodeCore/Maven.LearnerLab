package io.zipcoder.interfaces;

public final class Students extends People{
    static final Students INSTANCE = new Students();

    private Students(){
        for(int i = 0; i < 10; i++){
            Student newStudent = new Student(personList.size());
            add(newStudent);
        }
    }

    public static Students getINSTANCE() {
        return INSTANCE;
    }

    public double getTotalStudyTime() {
        double totalStudyTime = 0;
        Person[] student = getArray();
        for (int i = 0; i < student.length; i++){
            Student student1 = (Student) student[i];
            totalStudyTime += student1.getTotalStudyTime();
        }
        return totalStudyTime;
    }

    public Learner[] asLearners() {
        Learner[] learners = new Learner[personList.size()];
        for(int i=0; i<personList.size(); i++) {
            Person currentPerson = (Person) personList.get(i);
            Learner learner = (Learner)currentPerson;
            learners[i] = learner;
        }
        return learners;
    }

    @Override
    public Person[] getArray() {
        Person[] personArray = new Person[personList.size()];
        for(int i=0; i<personArray.length; i++) {
            personArray[i] = (Person)personList.get(i);
        }
        return personArray;

    }
}
