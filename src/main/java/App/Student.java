package App;

import io.zipcoder.interfaces.Learner;

public class Student extends Person implements Learner {

    double totalStudyTime;

    public Student(long id) {
        super(id);
    }

    public double getTotalStudyTime(){
        return this.totalStudyTime;
    }

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

}
