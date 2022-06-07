//diện tích hình tròn theo yêu cầu sau:
//Khởi tạo class HinhTron với thuộc tính là bán kính.
//Khai báo và định nghĩa 2 phương thức trả về chu vi và diện tích
//Ở hàm main khởi tạo 1 đối tượng hình tròn, 
//nhập giá trị cho bán kính và in ra màn hình chu vi và
//diện tính của hình tròn qua 2 phương thức ở trên.
package bt3;

import java.util.Scanner;

public class HinhTron {
    private int banKinh;

  
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ban kinh");
        banKinh = sc.nextInt();

    }
        
    public void xuat(){
        System.out.println("Ban kinh hinh tron : "+2*banKinh*Math.PI);
        System.out.println("Dien tich hinh tron: "+Math.PI*Math.pow(banKinh, 2.0));      
    }

     public HinhTron() {
    }

    public int getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(int banKinh) {
        this.banKinh = banKinh;
    }
    
    
    
}
