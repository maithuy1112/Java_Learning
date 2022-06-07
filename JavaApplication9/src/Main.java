
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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("input a");
        a = sc.nextInt();
        if (a<1500){
            System.out.println(70);
        }
        else {
            if ((a-1500)%500!=0){
                b = 70+((a-1500)/500)*50;
                b = b+50;
                System.out.println("車費是"+b);
            }
            else{
                b = 70+((a-1500)/500)*50;
                System.out.println("車費是"+b);
            }
            
        }
        
    }
    
}
