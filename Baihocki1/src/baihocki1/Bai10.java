//A number is said to be Harshad 
//if it's exactly divisible by the sum of its digits. Create a function that determines whether a number is a Harshad or not.
package baihocki1;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m =n ;
        int sum;
        int tong = 0;
        while(n>0){
            sum = n%10;
            tong = tong + sum;
            n/=10;
        }
        if(m%tong==0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
