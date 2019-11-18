package io.zipcoder.interfaces;

public class Instructors extends People<Instructor>{
    private final static Instructors INSTANCE=new Instructors();
    private Instructors(){
        final Instructor INSTANCE=new Instructor(Long.MIN_VALUE,"");
        Instructor t1=new Instructor(101L,"Christopher");
        super.add(t1);
        Instructor t2=new Instructor(102L,"Dolio");
        super.add(t2);
        Instructor t3=new Instructor(103L,"Roberto");
        super.add(t3);
        Instructor t4=new Instructor(104L,"Chris");
        super.add(t4);
        Instructor t5=new Instructor(105L,"Sian");
        super.add(t5);
    }
    static Instructors getInstance(){
        return INSTANCE;
    }
    public Instructor[] toArray() {
        Instructor[]arr=new Instructor[INSTANCE.count()];
        int j=0;
        for(int i=0;i<personList.size();i++){
            arr[j]=personList.get(i);
            j++;
        }
        return arr;
    }
    }

