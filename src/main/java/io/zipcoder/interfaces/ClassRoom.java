package io.zipcoder.interfaces;
import java.util.ArrayList;
import java.util.HashMap;

public class ClassRoom {
	
	private static ArrayList<Student> students = TechConnect.getStudents();
	private static ArrayList<Instructor> instructors = ZipCodeWilmington.getInstructors();
	
	public static HashMap<String , Person> getRoster(){
		
	
	HashMap<String, Person> roster = new HashMap<String, Person>();
	
	for (int i = 0; i <= students.size() -1 ; i++){
		
		roster.put(students.get(i).getName(), students.get(i));
	}
	
	for (int i = 0 ; i <= instructors.size() - 1; i++){
		
		roster.put(instructors.get(i).getName(), students.get(i));
		
	}
	

	
	return roster;
	
		}


}
