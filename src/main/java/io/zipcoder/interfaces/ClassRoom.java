package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.HashMap;

public class ClassRoom {
	
	
	private static ArrayList <Student> students = TechConnect.getStudents();
	private static ArrayList <Instructor> instructors = ZipCodeWilmington.getInstructors();
	
	
	public static HashMap<String, Person> getRoster()
	{
		HashMap<String,Person> aHashMap = new HashMap<String,Person>();
		
		for(Person student : students)
		{
			aHashMap.put(student.getName(), student);
		}
		
		for(Person instructor : instructors)
		{
			aHashMap.put(instructor.getName(), instructor);
		}
		
		return aHashMap;
	}
	
	
	
	
	
	
	


}
