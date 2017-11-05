package io.zipcoder.interfaces;

import java.util.ArrayList;

public class ZipCodeWilmington {

	private static ArrayList<Instructor> instructorList = new ArrayList<Instructor>();

	
	static { // static initializer
		String[] instructorNames = { "Leon", "Tariq", "Froilan", "David", "Zach", "Iyasu" };
		for (String instructorName : instructorNames){
			Instructor instructor = new Instructor(instructorName);
			hire(instructor);
		}
	}
	
	public static ArrayList<Instructor> getInstructorList() {
		return instructorList;
	}

	public ZipCodeWilmington() {
	//static and private?
		
	}

	public static void hire(Instructor instructorNames) {
		instructorList.add(instructorNames);
		
	}
	
	public static void fireStaff() {
		instructorList.clear();
	}
}









