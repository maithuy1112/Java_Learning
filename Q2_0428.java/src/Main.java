
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("落下的高度(公尺)");
        int h;
        h = scanner.nextInt();
        System.out.println("落第的次數");
        double n ;
        n = scanner.nextInt();
        double sum1 = h;
        double m = 0.5;
        double a = Math.pow(m, n);
        double c = a*h;
        
        System.out.println("球會反彈傲的高度 "+c+"公尺");     
            for(int i=2 ; i<=n;i++){               
                double b = i-1;
                double s = Math.pow(2, b);
                double l = (h/s)*2;
                sum1 += l;
            }
            System.out.println("囚犯彈回經過距離綜合"+sum1+"公尺");
        }
    }
    

