//Create a function that checks if a given integer is exactly the factorial of an integer or not.
//true if it is, false otherwise.
package baihocki1;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n");
        int n = sc.nextInt();
        int a = 1;
        int b = 1;
        while (a < n) {
            a = a * b;
            b++;
        }
        if (a == n) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
    
}
