package io.zipcoder.interfaces;

public class Student extends Person implements Learner 
{
	//instance variable
	private double totalStudyTime;
	
	public Student(String theName) {
		super(theName);
	}
	
	public void learn(double numberOfHours) {
		this.totalStudyTime = totalStudyTime + numberOfHours;
		
	}

	
	public double getTotalStudyTime() {
		return totalStudyTime;
	}

	
	public void setTotalStudyTime(double totalStudyTime) {
		this.totalStudyTime = totalStudyTime;
	}





}
