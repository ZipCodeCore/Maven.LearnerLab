package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class TestClassroom {
	
	@Test
	public void testHashMap()
	{
		Classroom cl = new Classroom();
	Map map = cl.GetRoster();
	System.out.print(Classroom.students.containsAll(map.values()));
	}
}
		
