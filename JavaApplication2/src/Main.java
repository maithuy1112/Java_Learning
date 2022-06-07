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
       
		System.out.println("cm:");

        int length ;
		int remaining = length;
		int km = remaining/100000;
		remaining = remaining % 100000;
		int m = remaining/100;
		remaining = remaining %100;
		
		int cm = remaining; 
		System.out.println(length +" cm = " + km + " km "  + m +" m "+cm +" cm");
    }
    
}
