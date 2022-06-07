//Create a function that takes a number and returns its multiplicative persistence,
//which is the number of times you must multiply the digits in num until you reach a single digit.
package baihocki1;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
         int n = sc.nextInt();
         int count =0 ;
         while(n>9){
             int a = 1;
             while(n>0){
                 a = a*(n%10);
                 n=n/10;
             }
             n = a;
             count++;                    
         }
        System.out.println(count+" has only one digit");
       
    }
}
