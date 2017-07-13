package io.zipcoder.interfaces;
import java.util.*;

public class Instructor extends Person implements Teacher {

	public Instructor(String name) {
		super(name);

	}

	public void teach(Student student, double numberOfHours) {
		
		student.learn(numberOfHours);

		
	}

	public void lecture(Student[] student, double numberOfHours) {
		
		double numberOfHoursPerStudent = numberOfHours/student.length;
		
		for(int i = 0; i < student.length; i++){
			

			student[i].learn(numberOfHoursPerStudent);
			
		}

		
	}
	
	

}
