
//Bài 1:Viết chương trình hướng đối tượng giải quyết bài toán chu vi, 
//diện tích hình tròn theo yêu cầu sau:
//Khởi tạo class HinhTron với thuộc tính là bán kính.
//Khai báo và định nghĩa 2 phương thức trả về chu vi và diện tích
//Ở hàm main khởi tạo 1 đối tượng hình tròn, 
//nhập giá trị cho bán kính và in ra màn hình chu vi và
//diện tính của hình tròn qua 2 phương thức ở trên.

package bt3;

public class BT3 {

    public static void main(String[] args) {
            HinhTron hinhtron = new HinhTron();
            hinhtron.setBanKinh(5);
//            hinhtron.nhap();
            hinhtron.xuat();
            
    }
    
}
