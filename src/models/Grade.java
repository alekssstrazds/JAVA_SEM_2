package models;

public class Grade
{
    private int id;
    private byte gradeValue;
    private Student student;
    private Course course;

    private static int idCounter = 1000000;
    
    //Get
    public int getId() 
    {
        return id;
    }
    public byte getgradeValue() {
        return gradeValue;
    }

    public void setgradeValue(byte gradeValue)
    {
        if(gradeValue > 0 && gradeValue <= 10)
        {
            this.gradeValue = gradeValue;
        }
        else
        {
            this.gradeValue = (byte) 0;
        }
        
    }
    public Student getStudent()
    {
        return student;
    }
    public Course getCourse() 
    {
        return course;
    }

    //Set
    public void setId() 
    {
        this.id = idCounter++;
    }
    public void setStudent(Student student)
    {
        if(student != null)
        {
            this.student = student;
        }
        else
        {
            this.student = new Student();
        }
    }
    public void setCourse(Course course) 
    {
        if(course != null)
        {
            this.course = course;
        }
        else
        {
            this.course = new Course();
        }
    }

    //constructor
    public Grade(byte gradeValue, Student student, Course course) {
        setId();
        setgradeValue((byte) 1);
        setStudent(new Student());
        setCourse(new Course());
    }

    public Grade() 
    {
        setId();
        setgradeValue(gradeValue);
        setStudent(student);
        setCourse(course);
    }

    //toString
    public String toString() 
    {
        return course + " " + gradeValue + " " + id + " " + student;
    }
    

    
}
