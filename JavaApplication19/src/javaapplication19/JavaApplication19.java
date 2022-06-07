/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.util.Scanner;

/**
 *
 * @author ＴＨＵＹ
 */
public class JavaApplication19 {

    /**
     *
     * @param a
     * @param b
     */
    @SuppressWarnings("empty-statement")
    public static void countSame(int[]a,int[]b){
        for(int i = 0; i< a.length; i++){
            int count =1;
            for(int j= i+1;j<b.length ; j++){
                
                if(a[i] == a[j]){
                    count++;
                    b[j] = 0;
                }
            }
            if(b[i]!=0) b[i] = count;
        }
        for(int i = 0;i<b.length;i++){
            
            if(a[i]!= 0 && b[i]>0){
                    
                System.out.println(a[i]+"occurs"+b[i]+"times");
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner sc = new Scanner(System.in);
      int[] a = new int[50];
      int[] b = new int[50];
        System.out.println("Enter the integers betwen 1 to 50");
        for(int i = 0; i< b.length ; i++) {
            a[i] = sc.nextInt();
            b[i] = -1;
            if(a[i]==0){
                break;
            
            }
            if(a[i]<50){
                System.out.println("Enter the integers betwen 1 to 50");
            }
        }
          countSame(a,b);
    }


      //To change body of generated methods, choose Tools | Templates.
    
    
}
