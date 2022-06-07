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
public class BT3 {
    public static void main(String[] args) {
//        Bài tập 3:
//
//
//Viết chương trình cho phép nhập vào 3 số thực
//Chương trình này sẽ kiểm tra 3 số này có phải là 3 cạnh của một tam giác hay không.
//– Điều kiện để 1 tam giác tồn tại là: tổng 2 cạnh bất kì luôn lớn hơn cạnh còn lại.
                    Scanner sc = new Scanner(System.in);
                    System.out.println("nhap vao thu tu cac canh");
                    float a = sc.nextFloat();
                    float b = sc.nextFloat();
                    float c = sc.nextFloat();
                    if(a+b>c&&a+c>b&&b+c>a){
                        System.out.println("day la cac canh cua 1 tam giac");
                    }else{
                        System.out.println("day khong phai la 3canh cua 1 tam giac");
                    }


    }
    
}
