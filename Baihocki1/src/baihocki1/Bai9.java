//Create a function that finds how many prime numbers there are, up to the given integer.
package baihocki1;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i < n; i++) {
            int dem = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    dem++;
                }
            }
            if (dem == 2) {
                count++;
            }
        }

        System.out.println("There are " + count + " prime numberscount");

    }

}
    
    

