/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn1b;

import java.util.Scanner;

/**
 *
 * @author ＴＨＵＹ
 */
public class BTVN1B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a");
        int a;
        a = sc.nextInt();
        System.out.println("nhap b");
        int b;
        b = sc.nextInt();
        System.out.println("nhap c");
        int c;
        c = sc.nextInt();
        if(a==0){
            if(b==0&&c==0){
                System.out.println("pt vo so nghiem");
            }else if(b ==0 & c!= 0){
                System.out.println("pt vo nghiem");
            }else if (b!=0){
                float x = (float)(-b/c);
                System.out.println("nghiem duy nhat la " +x);
            }
        }else{
            float delta =(float)(b*b-4*a*c);
            if (delta <0){
                System.out.println("pt vo nghiem");
            }else if(delta == 0){
                float y = (float)(-b/(2*a));
                System.out.println("pt nghiem kep la : "+y);
            }else {
                float z = (float)(delta/delta);
                float m = (float)((-b+z)/(2*a));
                float n = (float)((-b-z)/(2*a));
                System.out.println("pt co 2 nghiem la : "+ m + "va " +n);
            }
        }
        
        
    }
    
}
