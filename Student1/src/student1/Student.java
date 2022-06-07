
package student1;

import java.util.Scanner;

public class Student {
    private Faculty faculty;
    private String classs;
    private int score;
    public void nhapStudent(){
        Scanner sc = new Scanner(System.in);
        faculty = new Faculty();
        faculty.nhapFaculty();
        System.out.println("Nhap class student : ");
        classs = sc.nextLine();
        System.out.println("Nhap score student : ");
        score = sc.nextInt();
    }
    public static String Tieude(){
        String tieuDe = String.format("%20s%30s%30s", "Faculty","Class","Score");
        return tieuDe;
    }
    public void xuatStudent(){
        String tt = String.format("%10s%20s%15d", faculty.xuatFaculty(),classs, score);
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
