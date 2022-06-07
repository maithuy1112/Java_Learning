
package btvn2;

import java.util.Scanner;

public class BTVN2 {

    public static void main(String[] args) {
    //       Bài 1:
        //Nhập vào 1 chuỗi, tính trung bình cộng các số trong chuỗi, nếu chuỗi nhập vào không có số nào thì in ra thông báo.
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao gia tri chuoi");
        String chuoi = sc.nextLine();
        int tong = 0, count = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            if (Character.isDigit(chuoi.charAt(i))) {
                tong += chuoi.charAt(i) - 48;
                count++;
            }
        }
        if (tong != 0) {
            double tbcong = (double) tong / count;
            System.out.println(tong);
            System.out.println(count);
          System.out.println(tbcong);
        } else {
            System.out.println("");
        }     
          
    }
}
