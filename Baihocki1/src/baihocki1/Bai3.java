//Create a function that determines whether elements in an array can be re-arranged
//to form a consecutive list of numbers where each number appears exactly once.
//Tạo một hàm xác định xem các phần tử trong một mảng có thể được sắp xếp lại để tạo thành một danh sách các số liên tiếp 
//trong đó mỗi số xuất hiện đúng một lần hay không.
package baihocki1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong phan tu trong mang ");
        
        int n = sc.nextInt();
        int[] mang = new int[n];
        for (int i = 0; i < n; i++) {
            mang[i] = sc.nextInt();
        }
        for (int i = 1; i < mang.length; i++) {
            int temp = mang[i];
            int j = i - 1;
            for (; j >= 0 && mang[j] > temp; j--) {
                mang[j + 1] = mang[j];
            }
            mang[j + 1] = temp;
        }
        printArray(mang);
    }
    private static void printArray(int[] mang) {
        int num = 0;
        int len = mang.length - 1;
        for (int e = 0; e < len; e++) {
            if (mang[e + 1] - mang[e] != 1) {
                num++;
            }
        }
        if (num == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
