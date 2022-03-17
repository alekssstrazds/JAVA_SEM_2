package models;

public class Student extends Person
{
    //Mainīgie
   private int id;
   private static int idCounter = 10000;
    //Get funkcijas
    public int getId() {
        return id;
    }
    //Set funkcijas
    public void setId() {
        this.id = idCounter;
        idCounter++;
    }
    //Constructor
    public Student() {
        super();
        setId();
    }
    public Student(String name, String surname) {
        super(name, surname);
        setId();
    }
    //toString funkcija
    public String toString() {
        return  id + " " + super.toString();
    }
    
   
}
