package io.zipcoder.interfaces;

public class Student extends Person implements Lerner {
	
	double totalStudyTime;

	public Student(String name, double totalStudyTime) {
		super(name);
		this.totalStudyTime = totalStudyTime;
	}
	
	public Student(String name) {
		this(name, 0);
	}
	
	public void learn(double numberOfHours){
		
		totalStudyTime += numberOfHours;
		
		
	}
	
	public double getTotalStudytime(){
		
		return totalStudyTime;
	}

}
