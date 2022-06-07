
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
public class Q1_0428 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here     
        
        int[]a={2,5,1,7,4,3};       
      printArray(a);
            int len = a.length;
            for(int x = 1; x<len;x++){
                int temp = a[x];
                int y = x-1;
                while(y>=0 && temp < a[y]){
                    a[y+1]=a[y];
                    y--;
                }
                a[y+1] = temp;
            }
            printArray(a);
}

    private static void printArray(int[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}