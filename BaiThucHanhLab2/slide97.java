package BaiThucHanhLab2;

import java.util.Scanner;

public class slide97 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        int tong = 0;
        int a;
        do {
            System.out.println("Nhap kich thuoc mang:");
            n = scanner.nextInt();
        }
        while(n <= 0);
        int arrA[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("arrA[%d]=",i);
            arrA[i] = scanner.nextInt();
        
        }
        for (int i = 0; i < n; i++) {
            System.out.println( arrA[i]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arrA[i] > arrA[j]){
                    arrA[i] = a;
                    arrA[i] = arrA[j];
                    arrA[j] = a;
                }
                System.out.println( arrA[i]);
        }
        
}
}
}