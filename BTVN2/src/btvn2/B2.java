/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn2;

import java.util.Scanner;

/**
 *
 * @author ＴＨＵＹ
 */
public class B2 {
    public static void main(String[] args) {
        //Nhập vào 1 mảng số nguyên. Tính tổng các số lẻ trong mảng
        Scanner sc= new Scanner(System.in);
        int n ;
        System.out.println("so luong phan tu trong mang");
        n = sc.nextInt();
        int [] mangSoNguyen = new int[n] ;
        for(int i = 0;i<n;i++){
            System.out.println("nhap cac phan tu trong mang");
            mangSoNguyen[i]=sc.nextInt();
        }
//        for(int e :mangSoNguyen){
//            if(e%2!=0){
//                System.out.println("cac gia tri so le la : " +e);
//            }
//        }
            for(int i =0;i<=mangSoNguyen.length;i++){
                if(i%2!=0){
                    System.out.println(i);
                }
            }
    }
    
}
