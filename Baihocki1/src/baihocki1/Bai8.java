//An array is positive dominant 
//if it contains strictly more unique positive values than unique negative values. 
//Write a function that returns true if an array is positive dominant, false, otherwise.
package baihocki1;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("o luong n");
        int n;
        n = sc.nextInt();
        int[] mang = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("phan tu trong mang");
            mang[i] = sc.nextInt();
        }
        int count = 0;
        int num = 0;
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] > 0) {
                count++;
            }
        }
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] < 0) {
                num++;
            }
        }
        if (count > num) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
