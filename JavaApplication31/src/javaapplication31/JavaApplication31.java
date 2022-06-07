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

public class JavaApplication31 {

    public static void main(String[] args) {
        // TODO code application logic here
        CanBo canbo = new CanBo();
        canbo.nhap();
        canbo.Xuat();
        canbo.TinhLuong();
    }
    
}
