//Create a function that takes an array of numbers and return "Boom!" 
//if the digit 7 appears in the array. Otherwise, return "there is no 7 in the array".
//Tạo một hàm nhận một mảng số và trả về "Boom!"
//nếu chữ số 7 xuất hiện trong mảng. Nếu không, trả về "không có 7 trong mảng".
//sevenBoom([1, 2, 3, 4, 5, 6, 7]) ➞ "Boom!"
//// 7 contains the number seven.
//
//sevenBoom([8, 6, 33, 100]) ➞ "there is no 7 in the array"
//// None of the items contain 7 within them.
//
//sevenBoom([2, 55, 60, 97, 86]) ➞ "Boom!"
//// 97 contains the number seven.
package baihocki1;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("nhap so luong n");
        n = sc.nextInt();
        int[] mangSoNguyen = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhap cac phan tu trong mang");
            mangSoNguyen[i] = sc.nextInt();
        }
        int num = 0;
        for (int i = 0; i < mangSoNguyen.length; i++) {
            int temp = mangSoNguyen[i];
            while (temp > 0) {
                if (temp % 10 == 7) {
                    num++;
                }
                temp /= 10;
            }
        }
        if (num > 0) {
            System.out.println("BOOM!");
        } else {
            System.out.println("There is no 7 in the array");
        }

    }
    
    
}
