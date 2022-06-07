/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.util.Scanner;

/**
 *
 * @author ＴＨＵＹ
 */
public class JavaApplication21 {

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
            String m;
            a[i] = sc.nextInt();
            if(i==0){
                max = a[i];
            }else if(a[i]>max){
                max = a[i];
            }
            if(a[i]<(max-20)&& a[i]>0){
                 m = "F";
                
            } else if(a[i]<(max-15)&&a[i]>=max-20){
                  m = "D";
        }else if(a[i]<(max-10)&&a[i]>=max-15){
                  m = "C";
        }else if(a[i]<(max-5)&&a[i]>=max-10){
                                 m = "B";

        }else if(a[i]<(100)&&a[i]>=max-5){
                                  m = "A";

        }
            System.out.println("studen"+i+"diem la "+a[i]+"so "+ m);
        }
         
    }
    
}
