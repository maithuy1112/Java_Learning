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
public class BT2 {
    public static void main(String[] args) {
//        Bài tập 2:
//
//
//Viết chương trình cho phép nhập vào một số nguyên dạng số, sau khi chạy thì chương trình sẽ ghi số đó ra dưới dạng chữ.
//VD: 1 -> Một, 2 -> Hai, …
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap so nguyen ");
        int n = sc.nextInt();
        switch(n){
            case 0 : 
                System.out.println("day la so khong");
                break;
            case 1 :
                System.out.println("day la so mot");
                break;
            case 2:
                System.out.println(" day la so hai");
                break;
            case 3 :
                System.out.println("day la so ba");
                break;
            case 4:
                System.out.println("day la so bon");
                break;
            case 5 : 
                System.out.println("day la so nam");
                break;
            case 6 :
                System.out.println("day la so sau");
                break;
            case 7:
                System.out.println(" day la so bay ");
                break;
            case 8 :
                System.out.println("day la so tam ");
                break;
            case 9 :
                System.out.println("day la so chin");
                break;
            default:
                System.out.println("khong thuoc vao pham vi gia tri cho phep");// neu khac voi cac dieu kien tren
                break;
        }
        
    
    }
    
}
