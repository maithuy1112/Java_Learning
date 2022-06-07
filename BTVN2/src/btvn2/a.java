/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn2;

import java.util.Scanner;

/**
 *
 * @author ＴＨＵＹ
 */
class a {
    public static String main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int n ;
        System.out.println("so luong phan tu trong mang");
        n = sc.nextInt();
        int [] mangSoNguyen = new int[n] ;
        for(int i = 0;i<n;i++){
            System.out.println("nhap cac phan tu trong mang");
            mangSoNguyen[i]=sc.nextInt();
        }     
      for(int i = 0;i<mangSoNguyen.length;i++){
            int temp = mangSoNguyen[i];
            while(temp >0){
                if (temp%10==7){
                    return "BOOM";
                }
                temp/=10;
                
            }                  
              
          }
        return "no 7";
      
        

        
    }
    
}
