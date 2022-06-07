
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ＴＨＵＹ
 */
public class Q2_0331 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("n :");
        int n;
       n= scanner.nextInt();
       float sum = 0;
       float sum1 = 0;
       for(double i = 2; i<= n; i++){
           sum += (float)(i/(i+1));
       }
       double j = 1;
       while(j<n){
           j=j+1;
           sum1 +=(float)(j/(j+1));
       }
        System.out.println(sum1);
        System.out.println(sum);
                }
}
