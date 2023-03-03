package BaiThucHanh0203;

import java.util.Scanner;

public class Slide47 {
    public static void main(String[] args){
        int a;
        int tong = 0;
        while(tong < 100){
            System.out.println("Nhap so vao:");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            tong = tong + a;
            System.out.println("Ket qua:" + tong);
        }
    }
}