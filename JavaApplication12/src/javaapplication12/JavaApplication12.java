/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.util.Scanner;

/**
 *
 * @author ＴＨＵＹ
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here      
        int[] myArray = {99, 88, 55, 77, 1, 66};

    

        int len = myArray.length;

        for (int i = 0; i < len; i++) {
            System.out.println("#Vòng lặp số " + i);
            for (int j = 0; j < len - 1 - i; j++) {
                System.out.println("#" + i + "." + j);
                System.out.println(myArray[j] + " > " + myArray[j + 1]);
                if(myArray[j] > myArray[j + 1]){
                    System.out.println("Hoán vị");
                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;

                    
                }
            }
            System.out.println();
        }

        
    }

    }
    

