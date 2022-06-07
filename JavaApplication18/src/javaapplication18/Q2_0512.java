/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

import java.util.Scanner;

/**
 *
 * @author ＴＨＵＹ
 */
public class Q2_0512 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here 
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);
        int max = 0 ;
        for(int i =0 ; i < 5; i++){
            a[i] = sc.nextInt();
            if(i==0){
                max = a[i];
            }else if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println(max);
    }

 
}
