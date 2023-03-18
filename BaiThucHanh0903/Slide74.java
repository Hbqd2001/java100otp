package BaiThucHanh0903;

import java.util.Scanner;

public class Slide74 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        int tong = 0;
        do {
            System.out.println("Nhap kich thuoc mang:");
            n = scanner.nextInt();
        }
        while(n <= 0);
        int arrA[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("arrA[%d]=",i);
            arrA[i] = scanner.nextInt();
            if(arrA[i] % 2 == 0){
                tong += arrA[i];
            }
        
        }
        
        System.out.println("tong" + tong);
        
        
    }
}
