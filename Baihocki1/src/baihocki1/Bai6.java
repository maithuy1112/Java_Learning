//Create a function that takes one, two 
//or more numbers as arguments and adds them together to get a new number.
//The function then repeatedly multiplies the digits of the new number by each other, 
//yielding a new number, 
//until the product is only 1 digit long. Return the final product.
package baihocki1;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("so luong phan tu ");
        int n = sc.nextInt();
        int tong = 0;
        int []mang=new int[n];
        for(int i = 0; i<n;i++){
            System.out.print("in ra cac phan tu trong mang");
            mang[i]=sc.nextInt();
        }
        for(int i = 0;i<mang.length;i++){
            tong+=mang[i];        
        }
        while(tong>9){
            int a= 1;
            while(tong>0){
                a = a*tong%10;
                tong/=10;
            }
            tong=a;
        }
                System.out.println(tong);
       
    }
    }

