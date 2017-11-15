package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {
    ZipCodeWilmington zipcode =  ZipCodeWilmington.getInstance();
    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();
    Educator Tariq = Educator.Tariq;

    @Test
    public void hostLecture() {
        //Given


        //Then
     //   zipcode.hostLecture(1, 28.0);

        //When

//        Map<Long, Double> studentMap=new HashMap<Long, Double>();
//        for(int i=0; i<students.personList.size();i++){
//            Student student =  students.personList.get(i) ;
//            studentMap.put(students.personList.get(i).getId(),student.getTotalStudyTime());
//        }
//
//
//        zipcode.hostLecture(1,28.00);
//        Map<Long, Double> map2 = new HashMap<Long, Double>();
//        for(int i=0;i<students.personList.size();i++){
//            Student student =  students.personList.get(i);
//            map2.put(students.personList.get(i).getId(),student.getTotalStudyTime());
//        }
//            for(Map.Entry entry: studentMap.entrySet()){
//                assertEquals(entry.getValue(), map2.get(entry.getKey())-1);
//      }
//        zipcode.hostLecture(123,20.0);
//        double initialTimeWorked = Tariq.getTimeWorked();
//        double expected = 4.0;
//        Tariq.teach(Students.getInstance().findById(1),5);
//        double actual = Students.getInstance().findById(1).getTotalStudyTime();
//        Assert.assertEquals(expected,actual,0);




    }
    @Test
    public void testHostLecture2(){
        zipcode.hostLecture(Educator.Tariq,3.0);
        Assert.assertEquals(3,Educator.Tariq.getTimeWorked(),0.00);

    }



}