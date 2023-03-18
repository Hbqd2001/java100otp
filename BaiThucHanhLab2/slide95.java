package BaiThucHanhLab2;

import java.util.Scanner;

public class slide95 {
    public static void main(String[] args){
        //bai6//
        int a;
        Scanner scanner = new Scanner(System.in);
        int giaithua = 1;
        do{
            System.out.println("Nhap vao 1 so nguyen duong :");
            a = scanner.nextInt();
            for(int i = 2; i <= a ; i++){
                giaithua *= i;
                
            }
            System.out.println("tong giai thua =" + giaithua);
        }
        while(a == 1 || a==0 );
        //bai7//
        int b;
        System.out.println("Nhap so nguyen duong :");
        b = scanner.nextInt();
        for(int i = 1; i <=b ; i++){
            System.out.println(i);
        }
        //bai8//
        int c;
        int tong =0;
        System.out.println("Nhap so luong so nguyen can nhap:");
        c = scanner.nextInt();
        for(int i = 0;i <= c; i++ ){
            tong += i;
        }
        System.out.printf("trung binh cong cua %d so nguyen da nhap = %d",b,tong/b);
    }
}
