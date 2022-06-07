
package student1;

import java.util.Scanner;

public class Student1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Nhap so luong hoc sinh ");
        n = sc.nextInt();
        Student []danhsach = new Student[n];
        for(int i = 0 ; i<n; i++){
            System.out.println("thong tin cua hoc sinh "+(i+1));
            danhsach[i] = new Student();
            
            danhsach[i].nhapStudent();           
        }
        System.out.println(Student.Tieude());
        for(int i = 0 ; i<n;i++){
            danhsach[i].xuatStudent();
        }
        
    }
    
}
