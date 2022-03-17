package models;

public class Course 
{
    private int id;
    private String title;
    private byte creditPoints;
    private Professor professor;

    private static int idCounter = 1000;

    //2.1 get funkcijas
    public int getId() 
    {
        return id;
    }
    public String getTitle() 
    {
        return title;
    }
    public byte getCreditPoints() 
    {
        return creditPoints;
    }
    public Professor getProfessor() 
    {
        return professor;
    }
    //2.2 set funkcijas
    public void setId() 
    {
        this.id = idCounter++;
    }
    public void setTitle(String title) 
    {
        if(title != null && title.matches("[A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[\\s\\da-zēūīļķģšāžčņA-ZĒŪĪĀŠĢĶĻŅČŽ]+"))
        {
            this.title = title;
        }
        else
        {
            this.title = "unknown";
        }
        
    }
    public void setCreditPoints(byte creditPoints) 
    {
        if(creditPoints > 0 && creditPoints <= 20)
        {
            this.creditPoints = creditPoints;
        }
        else
        {
            this.creditPoints = 1;
        }
    }
    public void setProfessor(Professor professor)
    {
        if(professor != null)
        {
            this.professor = professor;
        }
        else
        {
            this.professor = new Professor();
        }
    }
    //3.konstruktori
    public Course()
    {
        setId();
        setTitle("Testa kurss");
        setCreditPoints((byte)2);
        setProfessor(new Professor());
    }
    public Course(String title, byte creditPoints, Professor professor)
    {
        setId();
        setTitle(title);
        setCreditPoints(creditPoints);
        setProfessor(professor);
    }
    //4.toString
    public String toString()
    {
        return id + " " + title + " "+ creditPoints + " " + professor;
    }
    public boolean equals(Object obj) {
        Course otherCourse = (Course)obj;
        if(title.equals(otherCourse.getTitle())) {
            return true;
        }
        return false;
    }
}
