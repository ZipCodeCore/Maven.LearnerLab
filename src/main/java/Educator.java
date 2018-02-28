import io.zipcoder.interfaces.Learner;
import io.zipcoder.interfaces.Teacher;

public enum Educator implements Teacher {

    TARIQ(99999),
    LEON(88888),
    FROILAN(77777),
    NHU(66666);

    final Instructor instructor;
    double timeWorked = 0;

    Educator(int i){
        this.instructor = new Instructor(i);
        Instructors.getInstance().personList.add(this.instructor);
    }
    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
        this.timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours/ learners.length;
        for (Learner learners1 : learners){
            learners1.learn(numberOfHoursPerLearner);
        }
        this.timeWorked += numberOfHours;
    }

    public double getTimeWorked(){
        return timeWorked;
    }
}
