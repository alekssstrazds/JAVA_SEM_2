package service;

import java.util.ArrayList;

import models.*;

public class VeAService {
    private static ArrayList<Professor> allProfessors = new ArrayList<>();
    private static ArrayList<Course> allCourses = new ArrayList<>();
    private static ArrayList<Student> allStudents = new ArrayList<>();
    private static ArrayList<Grade> allGrades = new ArrayList<>();
    public static void main(String[] args) {
        Professor prof1 = new Professor("Alekss", "Strazds", ProfDegree.master);
        Professor prof2 = new Professor("Sskela", "Sdzarts", ProfDegree.master);
        Professor prof3 = new Professor("Fricis", "Kreisais", ProfDegree.master);
        allProfessors.add(prof1);
        allProfessors.add(prof2);
        allProfessors.add(prof3);
        
        for(Professor prof : allProfessors) {
            System.out.println(prof);
        }

        System.out.println("----------------------");
        Course c1 = new Course("Programmēšana tīmeklī Java", (byte) 4, prof1);
        Course c2 = new Course("Daiļzīmēšanas pamati", (byte) 2, prof2);
        Course c3 = new Course("Nelikumīgu likumu pamati", (byte) 1, prof3);
        Course c4 = new Course("Nepamatotie likumu pamati", (byte) 2, prof3);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        Student stud1 = new Student("Jānis", "Bērziņš");
        Student stud2 = new Student("Fliks", "Noskoperis");
        Student stud3 = new Student("Genādijs", "Germands");
        System.out.println(stud1);
        System.out.println(stud2);
        System.out.println(stud3);

        Grade gr1 = new Grade((byte)10, stud1, c1);
        Grade gr2 = new Grade((byte)5, stud2, c1);
        Grade gr3 = new Grade((byte)8, stud2, c2);
        Grade gr4 = new Grade((byte)10, stud1, c1);
        Grade gr5 = new Grade((byte)5, stud1, c4);
        Grade gr6 = new Grade((byte)3, stud2, c1);
        Grade gr7 = new Grade((byte)5, stud2, c2);
        Grade gr8 = new Grade((byte)6, stud2, c3);
        Grade gr9 = new Grade((byte)1, stud3, c3);
        Grade gr10 = new Grade((byte)10, stud3, c4);

        System.out.println(gr1);
        System.out.println(gr2);
        System.out.println(gr3);
        System.out.println(gr4);
        System.out.println(gr5);
        System.out.println(gr6);
        System.out.println(gr7);
        System.out.println(gr8);
        System.out.println(gr9);
        System.out.println(gr10);
    }
}
