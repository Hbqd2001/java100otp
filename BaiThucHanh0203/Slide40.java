package BaiThucHanh0203;

import java.util.Scanner;

public class Slide40 {
    public static void main(String[] args){
        int a;
        System.out.println("Nhap vao mot so:");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        switch (a) {
            case 1: System.out.println("Chu Nhat");
                
                break;
            case 2: System.out.println("Thu Hai");
                
                break;
            case 3: System.out.println("Thu Ba");
                
                break;
            case 4: System.out.println("Thu Tu");
                
                break;
            case 5: System.out.println("Thu Nam");
                
                break;
            case 6: System.out.println("Thu Sau");
                
                break;
            case 7: System.out.println("Thu Bay");
                
                break;
            default: System.out.println("Nhap khong dung tu 1 den 7");
                break;
        }
    }
}
