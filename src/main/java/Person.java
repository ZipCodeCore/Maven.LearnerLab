

public class Person {

    private final long id;
    String name;

    public Person(long id){
        this.id = id;
    }

    public long getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
}
