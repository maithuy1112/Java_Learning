/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.util.Scanner;

/**
 *
 * @author ＴＨＵＹ
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        System.out.println("n :");
        int n;
       n= scanner.nextInt();
       float sum ;
       for(int i = 2; i<= n;i++){
           sum =(float) 1/2 + (i/(i+1)); 
           System.out.println("sum "+sum);
       }
        
        
        
    }
    
}
