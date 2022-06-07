package baitap4_2;

import java.util.Scanner;

public class Faculty {
    private String name;
    private int date;
    private School school;
    
    public void nhapFaculty(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap name : ");
        name = sc.nextLine();
        System.out.println("nhap date : ");
        date = sc.nextInt();
        school = new School();
        school.nhapSchool();
        
    }
    
    public String xuatFaculty(){
        String tt = String.format("%20s%15d%20s", name,date,school.xuatSchool());
        return tt;
    }

    public Faculty() {
    }

    public Faculty(String name, int date, School school) {
        this.name = name;
        this.date = date;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
    
    
    
}
