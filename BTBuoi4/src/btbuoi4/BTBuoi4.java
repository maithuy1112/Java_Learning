
package btbuoi4;

import java.util.Scanner;

public class BTBuoi4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
         Hang []hang= new Hang[n];
         for(int i = 0 ; i<n;i++){
             System.out.println("ma hang thu " + i);
             hang[i]= new Hang();
             hang[i].nhapHang();
         }
         for(int i = 0 ; i<n;i++){
             hang[i].xuatHang();
         }
         
    }
    
}
