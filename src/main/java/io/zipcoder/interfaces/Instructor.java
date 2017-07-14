package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {
	double numberOfHoursPerStudent;
	String currentStudent;
	
	public Instructor(String name) {
		super(name);
	}
	
	
	public void teach(Student student, double numberOfHours) {
		student.learn(numberOfHours);
		
	}


	public void lecture(Student[] student, double numberofHours) {
		for(int i = 0; i < student.length; i ++){
			
			double numberOfHoursPerStudent = numberofHours/student.length;
		
		Student currentStudent = student[i];
		
		currentStudent.learn(numberOfHoursPerStudent);
		
		System.out.print(currentStudent);
		
		}
				
	}
	
}
