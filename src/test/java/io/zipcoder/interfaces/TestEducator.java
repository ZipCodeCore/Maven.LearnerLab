package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class TestEducator {
   public Students students = Students.getInstance();
    public Student[] students1 = students.getArray();
    Double map1Value,map2Value;
    Map<Long,Double> mapBeforeLect;
    Map<Long,Double> mapAfterLect;
    ArrayList<Double> mapHoursDiffList = new ArrayList<Double>();
    @Test
    public void testTeach(){

        Student student = new Student(100,"Jeff",3.00);

        Educator.TARIQ.teach(student,1.00);
        Assert.assertEquals(4.00,student.getTotalStudyTime(),0.01);

    }
    @Test
    public void testLecture(){
        Students students = Students.getInstance();
        mapBeforeLect = insertMap(students.getArray());
        Educator.LEON.lecture(students.getArray(),28.00);
        mapAfterLect= insertMap(students.getArray());
        for (Map.Entry m: mapBeforeLect.entrySet()) {
            map2Value = mapAfterLect.get(m.getKey());
            map1Value = mapBeforeLect.get(m.getKey());
            mapHoursDiffList.add(map2Value - map1Value);
            //System.out.println(map2Value+"  "+map1Value);
        }
        for(int i=1;i<mapHoursDiffList.size();i++){
            //System.out.println(mapHoursDiffList.get(i));
            assertEquals(mapHoursDiffList.get(i),mapHoursDiffList.get(0),.01);
        }
        Assert.assertEquals(28,Educator.LEON.getTimeWorked()
                ,.00);

    }
    public Map<Long,Double> insertMap(Student[] studentArray){
        Map<Long,Double> map = new HashMap<Long, Double>();
        for (Student student: studentArray) {
            map.put(student.getId(),student.getTotalStudyTime());
        }
        return map;
    }

}
