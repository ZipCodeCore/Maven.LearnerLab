package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.HashMap;



public class ClassRoom {

	private static ArrayList<Student> students = new ArrayList<Student>(TechConnect.getStudents());
	
	private static ArrayList<Instructor> instructors = new ArrayList<Instructor>(ZipCodeWilmington.getInstructorList());
	
	public ClassRoom() {
	}

	public static HashMap<String,Person> getRoster(){
		HashMap<String, Person> map = new HashMap<String, Person>();
		
		
		for (int i = 0; i < students.size();i++ ){
			
			Student currentStudent = students.get(i);
			map.put(currentStudent.getName(), currentStudent);
		}
		
		for (int i = 0; i < instructors.size();i++ ){
			
			Instructor currentInstructor = instructors.get(i);
			map.put(currentInstructor.getName(), currentInstructor);
		}
		
		return map;

		}
	
	//contains all
	}

