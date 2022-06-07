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
// *///Yêu cầu:
//– Người dùng nhập vào số nguyên n
//– Kiểm tra số n là chẵn hay lẻ.
//Ví dụ: n = 2. In ra màn hình 2 là số chẵn; n = 9. In ra màn hình 9 là số lẻ.
public class BT4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so nguyen n");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println(" day la so chan");
            
        }else{
            System.out.println("day la mot so le");
    }
    }
    
}
