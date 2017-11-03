package io.zipcoder.interfaces;

import java.util.ArrayList;

public class TechConnect {

	static  ArrayList<Student> studentList = new ArrayList();
	
	static { // static initializer
		String[] studentNames = { "Karen", "Liel", "Quinn", "Destiny", "Blesson", "Danielle B.", "Andre", "Jeff",
				"Carlo", "Julia D.", "Natalie", "Julia E.", "Shylee", "Genevieve", "Margo", "Whitney", "Rachel",
				"Bridget", "Seung", "Jessica", "Harry", "Kesler", "Darin", "Jade", "Dominika", "Nashae", "Brianna",
				"Laurent", "Rina", "Emily", "Elisha", "Caitlin", "Kierra", "Dana", "Alyssa", "Humaira", "Prajwal",
				"Cristine", "Blesson", "Brendan" };
		
		for (String studentName : studentNames) {
			
			Student student = new Student(studentName);
			
			studentList.add(student);
		}
	}
	
	public static void recruitStudent(Student student) {
		
		studentList.add(student);
		
		}
	
	public static ArrayList<Student> getStudents() {
		return studentList;
		
	}
	
	public static void removeStudents() {
		
		studentList.clear();
		
	}
}
