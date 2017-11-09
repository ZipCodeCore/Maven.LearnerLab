package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {
    @Test
    public void hostLecture() throws Exception {
        //Given
        ZipCodeWilmington zipcode = new ZipCodeWilmington();
        Students students = Students.getInstance();
       // Instructors instructors = Instructors.getInstance();

        //Then
     //   zipcode.hostLecture(1, 28.0);

        //When

        Map<Long, Double> studentMap=new HashMap<Long, Double>();
        for(int i=0; i<students.personList.size();i++){
            Student student = (Student) students.personList.get(i) ;
            studentMap.put(students.personList.get(i).getId(),student.getTotalStudyTime());
        }
        

        zipcode.hostLecture(1,28.00);
        Map<Long, Double> map2 = new HashMap<Long, Double>();
        for(int i=0;i<students.personList.size();i++){
            Student student = (Student) students.personList.get(i);
            map2.put(students.personList.get(i).getId(),student.getTotalStudyTime());
        }
            for(Map.Entry entry: studentMap.entrySet()){
                assertEquals(entry.getValue(), map2.get(entry.getKey())-1);



            }




    }



}