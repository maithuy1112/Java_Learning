package baitap4_2;

import java.util.Scanner;

public class School {
    private String name ;
    private int date;
    
    public void nhapSchool(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap name : ");
        name = sc.nextLine();
        System.out.println("nhap date : ");
        date=sc.nextInt();
    }
   
    public String xuatSchool(){
        String tt = String.format("%10s%10d", name,date);
        return tt;
        
    }

    public School() {
    }

    public School(String name, int date) {
        this.name = name;
        this.date = date;
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
    
}
