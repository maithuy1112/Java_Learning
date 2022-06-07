/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author ＴＨＵＹ
 */
public class Q1___0323 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int a ;
       int b;
       double bmi;
       a = 146;
       b = 70;
       bmi = (a*0.45359237)/(b*b*0.0254*0.0254);
        System.out.println("Enter weight in pounds: "+ a);
        System.out.println("Enter height in inches: " +b);
        System.out.println("BMI is "+bmi);
        if( bmi < 18.5){
            System.out.println("Underweight");            
        }
        else if (bmi< 25.0){
            System.out.println("Normal");
        }
        else if (bmi<30.0){
            System.out.println("Overweihgt");
        }
        else if (bmi>30.0){
            System.out.println("Obese");
        }
                  
    }
    
}

    
    

