package io.zipcoder.interfaces;



import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People <E extends Person>  implements Iterable<E>{
    private ArrayList<E> eList;

    public People(ArrayList<E> eList){
        this.eList = eList;
    }
    public People(){
        this.eList = new ArrayList<E>();
    }

    public void add(E e) {
        this.eList.add(e);
    }

    public E findById(long id) {
        for(E e : this.eList){
            if(e.getId() == id) {
                return e;
            }
        }  return null;
    }
    public boolean contains(E e) {
       return this.eList.contains(e);
    }

    public void remove(E e) {
        this.eList.remove(e);
    }

    public void remove(long id){
         E eToBeFound = this.findById(id);
         if(eToBeFound != null) {
             this.remove(eToBeFound);
         }
    }

    public void removeAll() {
        this.eList.clear();
    }

    public int count() {
        return this.eList.size();
    }

        abstract E[] toArray();


    public Iterator<E> iterator() {
        return this.eList.iterator();
    }
}
