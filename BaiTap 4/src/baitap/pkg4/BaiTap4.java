
package baitap.pkg4;

public class BaiTap4 {

    public static void main(String[] args) {
        NhaSanXuat nhaSanXuat = new NhaSanXuat(1234, "Mai Thi Thuy","Hai Duong");
        Hang hang = new Hang(123,"sach giao khoa",nhaSanXuat);
        hang.xuatHang();
    }
    
}
