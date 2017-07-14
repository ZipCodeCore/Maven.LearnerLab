package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {

	public Instructor(String theName) {
		super(theName);
		// TODO Auto-generated constructor stub
	}

	public void teach(Student student, double numberOfHours) {
		// TODO Auto-generated method stub
		student.learn(numberOfHours);
	}

	public void lecture(Student[] student, double numberOfHours) {
		// TODO Auto-generated method stub

		double numberOfHoursPerStudent = numberOfHours / student.length;
		for (int i=0; i<student.length; i++)
		{
			student[i].learn(numberOfHoursPerStudent);
		}
	}

}
