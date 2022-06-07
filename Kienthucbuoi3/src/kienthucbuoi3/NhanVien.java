/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kienthucbuoi3;

import java.util.Scanner;

/**
 *
 * @author ＴＨＵＹ
 */
public class NhanVien { // access modifier : public , private , protected
    // day la thuoc tinh
    private String hoTen;
    private int tuoi;
    private String diaChi;
    private int maNhanVien;
    
    //phuong thuc : hanh dong xay ra dien ra co the truy cap
    public void nhapThongTin(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("nhap ten : ");
        hoTen = sc.nextLine();
        System.out.println("nhap tuoi : ");
        tuoi = sc.nextInt();
        sc.nextLine();
        System.out.println("nhap dia chi : ");
        diaChi = sc.nextLine();
        System.out.println("nhap ma nhan vien ; ");
        maNhanVien = sc.nextInt();
    }
    
    public void xuatThongTin(){
        System.out.println("ten: " +hoTen);
        System.out.println("tuoi : " + tuoi);
        System.out.println("dia chi :" + diaChi);
        System.out.println("ma nhan vien : " + maNhanVien);
                
                }
    
    
}
