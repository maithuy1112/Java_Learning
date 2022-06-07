/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication28;

import java.util.Scanner;

/**
 *
 * @author ＴＨＵＹ
 */
public class BTONTAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Bài tập 1:
//
//
//Viết chương trình Java mà khi chạy, màn hình console sẽ cho phép ta nhập vào một số nguyên, in ra màn hình “Đây là số nguyên dương”
//Nếu số vừa nhập vào là một số lớn hơn hoặc bằng 0, ngược lại in ra “Đây là số nguyên âm”.\
//            Scanner sc = new Scanner (System.in);
//            System.out.println("nhap vao mot so ng8uyen");
//            int a = sc.nextInt();
//            if(a>=0){
//                System.out.println("day la so nguyen duong");
//            }else{
//                System.out.println("day la so nguyen am");
//            }
  Scanner sc = new Scanner(System.in);
         System.out.println("nhap vao so nguyen");
        int a = sc.nextInt();   
        int count = 0;
        while(a!=0){
            int m = a%10;
            if(m%2!=0){
            count++;
            a/=10;
            }
        } 
        System.out.println(count);
    }
    
    
}
