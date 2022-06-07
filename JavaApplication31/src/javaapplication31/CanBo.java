//Bài 2: Cài đặt chương trình hướng đối tượng thực hiện các yêu cầu sau:
//Thiết kế, cài đặt lớp CanBo bao gồm các thuộc tính:
//    Mã cán bộ, họ tên, ngày sinh, số ngày làm việc trong tháng và các phương thức:
//Phương thức Nhap() để nhập thông tin của cán bộ.
//Phương thức TinhLuong():
//trả về lương của cán bộ theo công thức Lương = Số ngày làm trong tháng * 250000.
//Phương thức Xuat(): hiển thị thông tin của cán bộ ra màn hình.
//Xây dựng chương trình chính nhập thông tin cho 1 cán bộ. 
//    Xuất thông tin của cán bộ đó ra cùng với phương thức Xuat() ở trên.
package javaapplication31;

import java.util.Scanner;

public class CanBo {

    private int maCanBo;
    private String hoVaTen;
    private int ngayLamViec;
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma can bo");
        maCanBo = sc.nextInt();
        sc.nextLine();
        System.out.println("nhap ho va ten");
        hoVaTen = sc.nextLine();
        
        System.out.println("nhap so ngay lam viec");
        ngayLamViec = sc.nextInt();
    }
    public void TinhLuong(){
        System.out.println("luong thang la : "+ ngayLamViec*250000);
    }
    public void Xuat(){
        System.out.println("ma can bo la : "+maCanBo);
        System.out.println("ho va ten la : "+hoVaTen);
        System.out.println("so ngay lam viec la : "+ngayLamViec);
    }
    }  

