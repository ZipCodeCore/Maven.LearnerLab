package io.zipcoder.interfaces;

public class Student extends Person implements Learner{
    protected double totalStudyTime;
    private long id;
    public Student(){
        this.id = 0;
    }

    public Student(long id){
        setId(id);
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public long getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void learn(double numberOfHours){
        this.totalStudyTime = numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
