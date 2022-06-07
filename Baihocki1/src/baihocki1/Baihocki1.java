//Create a function that takes two numbers as arguments (num, length) and 
//returns an array of multiples of num until the array length reaches length.
//arrayOfMultiples(7, 5) ➞ [7, 14, 21, 28, 35]
//
//arrayOfMultiples(12, 10) ➞ [12, 24, 36, 48, 60, 72, 84, 96, 108, 120]
//
//arrayOfMultiples(17, 6) ➞ [17, 34, 51, 68, 85, 102]
//Tạo một hàm nhận hai số làm đối số (num, length) và
//trả về một mảng bội số của num cho đến khi độ dài mảng đạt đến độ dài.
//
package baihocki1;

import java.util.Scanner;

public class Baihocki1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao num ");
        int num;
        num = sc.nextInt();
        System.out.println("length");
        int length;
        length = sc.nextInt();
        for (int i = 1; i <= length; i++) {
            int a = num * i;
            System.out.println(a);
        }
        
        
        
    }
    
}
