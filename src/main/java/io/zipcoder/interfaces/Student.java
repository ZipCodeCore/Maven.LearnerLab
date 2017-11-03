package io.zipcoder.interfaces;

public class Student extends Person implements Learner {
	
	public Student(String name) {
		super(name);
	}

	private double totalStudyTime;
	
	public void learn(double time) {
		this.totalStudyTime += time;
	}
	
	public double getTotalStudyTime() {
		return totalStudyTime;
	}
	
	
}
