package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {
    int count = 0;
    Double map1Value,map2Value;
    Map<Long,Double> map1 = new HashMap<Long, Double>();
    Map<Long,Double> map2 = new HashMap<Long, Double>();
    ArrayList<Double> mapHoursDiffList = new ArrayList<Double>();
    @Test
    public void hostLecture() throws Exception {
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getINSTANCE();
        Students students = Students.getInstance();
        Instructors instructors = Instructors.getINSTRUCTORSINSTANCE();
        for(int i=0;i<students.personList.size();i++){
            Student student = (Student) students.personList.get(i);
            map1.put(students.personList.get(i).getId(),student.getTotalStudyTime());
        }
        zipCodeWilmington.hostLecture(1,28.28);

        for(int i=0;i<students.personList.size();i++){
            Student student = (Student) students.personList.get(i);
            map2.put(students.personList.get(i).getId(),student.getTotalStudyTime());
        }

//        for(Map.Entry entry : map1.entrySet()){
//            assertEquals(entry.getValue(), map2.get(entry.getKey())-1);
//        }
        for (Map.Entry m: map1.entrySet()) {
            map2Value = map2.get(m.getKey());
            map1Value = map1.get(m.getKey());
            mapHoursDiffList.add(map2Value - map1Value);
            System.out.println(map2Value+"  "+map1Value);
        }

        for(int i=1;i<mapHoursDiffList.size();i++){
            //System.out.println(mapHoursDiffList.get(i));
            assertEquals(mapHoursDiffList.get(i),mapHoursDiffList.get(0),.01);
        }

    }

}