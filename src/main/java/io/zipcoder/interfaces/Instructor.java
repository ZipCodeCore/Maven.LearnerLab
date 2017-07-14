package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {
	
	public Instructor(String name) {
		super(name);

	}

	public void teach(Student student, double numberOfHours) {
		student.learn(numberOfHours);
		
	}

	public void lecture(Student[] student, double numberOfHours) {
		
		for (int i = 1; i <= student.length; i++) {
			
			double numberOfHoursPerStudent = numberOfHours/student.length;
			
			//Student currentStudent = student[i];
			
			student[i].learn(numberOfHoursPerStudent);
		
		}
	}
	

	
	

}





