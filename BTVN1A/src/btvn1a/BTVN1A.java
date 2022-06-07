/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn1a;

/**
 *
 * @author ＴＨＵＹ
 */
public class BTVN1A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int n = 20;
// VONG LAP FOR
//        for ( int i = 0; i<n;i++){
//            if(i%2!=0){
//                System.out.println(i);
//            }           
//        }
//============================================
//            for(int i = 1; i<n;i+=2){
//                System.out.println(i);
//            }
//VONG LAP WHILE
//    int i =0;
//    while(i<n){
//        i++;
//        if(i%2!=0){
//                   System.out.println(i);
//        }
//    }
//====================================
//           int i = 1;
//           while(i<20){
//               System.out.println(i);
//               i=i+2;
//           }
//// VONG LAP DO WHILE
int i = 0;
       do {
            i++;
            if (i % 2 != 0) {
                System.out.println(i);
            }
        } while (i < n);
//========================================
//                int i =1;
//                do{                    
//                    System.out.println(i);
//                    i=i+2;
//                }while(i<20);


    }

}
