//Bài tập củng cố kỹ năng:
//Nhập vào 1 số nguyên, đếm các số lẻ trong số nguyên đó
//Ví dụ:  1234 => kq: 2
//876543=> kq: 3 

package javaapplication29;

import java.util.Scanner;

public class JavaApplication29 {

    public static void main(String[] args) {
        // TODO code application logic here
   
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt() ;
        int count = 0;
       while(a>0){
           int m = a%10;
           if(m%2!=0){
               ++count;
               
           }
           a=a/10;
       }
        System.out.println(count);
        }
   
       
    
    
}
