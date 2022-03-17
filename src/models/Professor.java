package models;

public class Professor extends Person
{
    //1.mainīgie
    private int id;
    private ProfDegree degree;

    private static int idCounter = 0;

    //2.get funkcijas
    public int getId() {
        return id;
    }
    public ProfDegree getDegree() {
        return degree;
    }
    //3. set funkcijas
    public void setId() {
        this.id = idCounter;
        idCounter++;
    }
    public void setDegree(ProfDegree degree) {
        if(degree != null) {
            this.degree = degree;
        } else this.degree = ProfDegree.master;
    }
    //4.konstruktori
    public Professor() {
        super();
        setId();
        setDegree(ProfDegree.master);
    }
    public Professor(String name, String surname, ProfDegree degree) {
        super(name, surname);
        setId();
        setDegree(degree);
    }
    //5. toString funkcijas
    public String toString() {
        return id + " " + super.toString() + " " + degree;
    }
}