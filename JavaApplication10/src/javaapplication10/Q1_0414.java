/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author ＴＨＵＹ
 */
public class Q1_0414 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("input a");
        a = sc.nextInt();
        if (a<=1){
            System.out.println("不合理");
        }
     boolean songuyento = true;
        for (int i = 2;i<a;i++){
            if (a%i==0){
            songuyento = false;
                System.out.println("a 不是質數 ");
                break;
            }
        }
        if(songuyento){
        System.out.println("a 是質數");
        }
    }
    
}
