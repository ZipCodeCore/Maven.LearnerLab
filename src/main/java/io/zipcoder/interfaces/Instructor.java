package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {

	public Instructor(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void teach(Student student, double numberOfHours) {
		student.learn(numberOfHours);
	}

	public void lecture(Student[] students, double numberOfHours) {
		for(int i = 0; i < students.length; i++)
		{
			double numberOfHoursPerStudent = numberOfHours / students.length;
			
			System.out.println(numberOfHoursPerStudent);
			
			Student currentStudent = students[i];
			
			currentStudent.learn(numberOfHoursPerStudent);
			
			

				//could not be finished, idk
		}

		
		
	}

}
