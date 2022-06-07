
package baitap4_2;

import java.util.Scanner;

public class Baitap4_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student []danhsach = new Student[n];
        
        for(int i=0 ; i<n;i++){
            danhsach[i] =new Student();
            danhsach[i].nhapStudent();
        }
        
        for(int i = 0; i<n;i++){
            danhsach[i].xuatStudent();
        }
          
        
        
        
        
    }
    
}
