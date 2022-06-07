/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author ＴＨＵＹ
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       double a;
       double b;
       double bmi;
       a = 146*0.45359237;
       b = 70*0.0254;
       bmi = a/(b*b);
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
