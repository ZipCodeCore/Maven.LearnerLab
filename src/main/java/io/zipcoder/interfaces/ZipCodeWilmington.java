package io.zipcoder.interfaces;

import java.util.ArrayList;

public class ZipCodeWilmington {
	
	static ArrayList <Instructor> instructorList = new ArrayList <Instructor> ();
	
	static { // static initializer
		String[] instructorNames = { "Leon", "Tariq", "Froilan", "David", "Zach", "Iyasu" };
		for (String instructorName : instructorNames) {
			Instructor instructor = new Instructor(instructorName);
			hire(instructor);
		}
	}
	
	public static void hire(Instructor newHire){
		instructorList.add(newHire);	
	}
	
	public static ArrayList <Instructor> getInstructors() {
		return instructorList;
	}
	
	public static void fireStaff() {
		instructorList.clear(); 
	}
	

}
