//Given an array of integers, return the largest gap between the sorted elements of the array.
//Cho một mảng các số nguyên, hãy trả về khoảng cách lớn nhất giữa các phần tử được sắp xếp của mảng.
package baihocki1;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []mang= new int[n];
        for(int i = 0; i<n ;i++){
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
        int max = mang[1]-mang[0];
        for(int i = 0; i<mang.length-1;i++){
             System.out.println(mang[i]);
            if(mang[i+1]-mang[i]>max)
                max = mang[i+1]-mang[i];
        }
       
        System.out.println(max);
            }
        
        
    
    
    
    
}
