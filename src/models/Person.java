package models;

public class Person {
    //Mainīgie
    private String name;
    private String surname;
    //Get funkcijas
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    //Set funkcijas
    public void setName(String name) {
        if(name != null && name.matches("[A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[a-zēūīļķģšāžčņ]+\\s?([A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[a-zēūīļķģšāžčņ]+)?")) {
            this.name = name;
        } else  this.name = "notknown";
    }
    public void setSurname(String surname) 
    {
        if(surname != null && surname.matches("[A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[a-zēūīļķģšāžčņ]+[-]?([A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[a-zēūīļķģšāžčņ]+)?"))
        {
            this.surname = name;
        } else this.surname = "notknown";
    }
    //Constructor
    public Person() {
        setName("None");
        setSurname("None");
    }
    public Person(String name, String surname) {
        setName(name);
        setSurname(surname);
    }
    //toString funkcija
    public String toString() {
        return name + " " + surname;
    }
}
