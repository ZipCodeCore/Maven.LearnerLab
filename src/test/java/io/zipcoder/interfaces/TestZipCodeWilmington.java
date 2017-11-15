package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class TestZipCodeWilmington {
    ZipCodeWilmington zipcode = ZipCodeWilmington.getInstance();
    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();
    @Test
    public void hostLecture() throws Exception {

        Double map1Value, map2Value;

        Map<Long,Double> studentMap = new HashMap<Long, Double>();
        for(int i=0; i<students.personList.size();i++){
            Student student = students.personList.get(i);
            studentMap.put(students.personList.get(i).getId(),student.getTotalStudyTime());
        }
        zipcode.hostLecture(1,28.0);
        Map<Long,Double> studentMap2 = new HashMap<Long, Double>();
        for(int i=0; i<students.personList.size();i++){
            Student student = students.personList.get(i);
            studentMap2.put
                    (students.personList.get(i).getId(),
                            student.getTotalStudyTime());
        }
        ArrayList<Double> hourOfDifference = new ArrayList<Double>();
        for(Map.Entry m:studentMap.entrySet()){
            map2Value = studentMap2.get(m.getKey());
            map1Value = studentMap.get(m.getKey());
            hourOfDifference.add(map2Value-map1Value);
            //assertEquals(m.getValue(),studentMap2.get(m.getKey())-1);
        }
        Double firstValue = hourOfDifference.get(0);
        for(Double each: hourOfDifference){
            Assert.assertEquals(each,firstValue,.01);
        }

    }
    @Test
    public void testHostLecture2(){
        zipcode.hostLecture(Educator.TARIQ,10.0);
        Assert.assertEquals(10.0,Educator.TARIQ.getTimeWorked(),0.01);
    }
}