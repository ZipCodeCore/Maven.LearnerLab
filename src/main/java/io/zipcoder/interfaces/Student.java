package io.zipcoder.interfaces;

public class Student extends Person implements Learner{

	double totalStudyTime;
	
	public Student(String name) {
		super(name);
	}
	
	public void learn(double amount){
		this.totalStudyTime += amount;
	}

	
	public double getTotalStudyTime(){
		return totalStudyTime;
	}
}



