package BaiThucHanhLab2;

import java.util.Scanner;

public class slide94 {
    public static void main(String[] args) {
        //bai4//
        int a;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Nhap vao mot so nguyen:");
            a = scanner.nextInt();
        }
        while(a<1 && a>=12);
        switch (a) {
            case 1: System.out.println("Thang 1");
                
                break;
            case 2: System.out.println("Thang 2");
                
                break;
            case 3: System.out.println("Thang 3");
                
                break;
            case 4: System.out.println("Thang 4");
                
                break;
            case 5: System.out.println("Thang 5");
                
                break;
            case 6: System.out.println("Thang 6");
                
                break;
            case 7: System.out.println("Thang 7");
                
                break;
            case 8: System.out.println("Thang 8");
                
                break;
            case 9: System.out.println("Thang 9");
                
                break;
            case 10: System.out.println("Thang 10");
                
                break;
            case 11: System.out.println("Thang 11");
                
                break;
            case 12: System.out.println("Thang 12");
                
                break;
        }
    //bai5//
        int b;
        int tong = 0;
        do{
            System.out.println("Nhap vao mot so nguyen");
            b = scanner.nextInt();
            tong = tong + b;
        }
        while(tong < 100);
        System.out.println("Tong = " + tong);
        
    }
}
