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
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here 
        Scanner scanner = new Scanner(System.in);
        int[]a = new int[5];
        int[]b = new int[5];
        System.out.println("nhap cac phan tu");
        for(int i =1; i<b.length; i++){
            a[i]= scanner.nextInt();
            b[1]=-1;
       }
       countSame(a,b);
    }
         private static void countSame(int[] a, int[] b) {
        for(int i =1; i<a.length; i++){
            int count = 1;
            for(int j =i+1; j<b.length; j++){
                if(a[i]==a[j]){
                    count++;
                    b[j]=0;
                }
            }
            if(b[i]!=0) b[i]= count;
        }
         System.out.println("kqua");
        for(int i =0; i<b.length; i++){
            if (b[i]!= 0){
                System.out.println("so"+a[i]+"xuat hien"+b[i]);
            }
        }
     
    }

 
}
