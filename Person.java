
package lab2;

public class Person {
    private int id;
    private String name;
    private boolean gender;  
    public Person(int id, String name, boolean gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
    public int getId(){
        return this.id;
    }
    public void setId(int value){
        this.id = value;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String value){
        this.name = value;
    }
    public boolean isMale(){
        return this.gender;
    }
    public void setMale(boolean value){
        this.gender = value;
    }
    
}
