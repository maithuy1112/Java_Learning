
package baitap4_2;

import java.util.Scanner;

public class Student {
    private Faculty faculty;
    private String classs;
    private int score;
    public void nhapStudent(){
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Nhap classs  : ");
        classs = sc.nextLine();
        System.out.println("Nhap score  : ");
        score = sc.nextInt(); 
        faculty = new Faculty();
        faculty.nhapFaculty();
    }
    

    public void xuatStudent(){
       String tt = String.format("%20s%15d%40s", classs,score,faculty.xuatFaculty());
        System.out.println(tt);
    }

    public Student() {
    }

    public Student(Faculty faculty, String classs, int score) {
        this.faculty = faculty;
        this.classs = classs;
        this.score = score;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    
    
}
