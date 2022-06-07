/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

/**
 *
 * @author ＴＨＵＹ
 */
public class JavaApplication20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] myArray = {6,5,3,1,8,7,2,4};
        printArray(myArray);

        int len = myArray.length;

        for(int i = 1; i < len; i++){
            //Nhấc quân bài lên
            int tmp = myArray[i];

       

            int j = i - 1;

            //Tìm ra vị trí chính xác để chèn quân bài vừa nhấc lên
            while (j >= 0 && tmp < myArray[j]){
          
                //Dịch chuyển các quân bài lên phía trước
                myArray[j + 1] = myArray[j];
                j--;
               
            }

         
            //Chèn quân bài vừa nhấc lên vào vị trí đã tìm (j)
            myArray[j + 1] = tmp;
           
        }

        printArray(myArray);


        //5 6 3

        //i = 2, tmp = 3
        //j = i - 1 = 1, 3 < 6 => 5 6 6, j--
        //j = 0, 3 < 5 => 5 5 6
        //myArray[0] = tmp, => 3 5 6

    }

    /**
     * In mảng ra màn hình
     * @param x Mảng cần in
     */
    private static void printArray(int[] myArray){
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println("");
    }
    
}
