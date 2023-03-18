package BaiThucHanhLab2;

import java.util.Scanner;

public class slide92{
    public static void main(String[] args){
        //bai1//
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so thu nhat :");
        a = scanner.nextInt();
        do{
            System.out.println("Nhap so thu hai :");
            b = scanner.nextInt();
        }
        while(b == 0);
        System.out.printf("Tong 2 so %d va %d = %d",a,b,a+b);
        System.out.printf("Hieu 2 so %d va %d = %d",a,b,a-b);
        System.out.printf("Tich 2 so %d va %d = %d",a,b,a*b);
        System.out.printf("Thuong 2 so %d va %d = %d ",a,b,a/b);
        System.out.printf("so du 2 so %d va %d = %d",a,b,a%b);
        if (a > b){
            System.out.printf(" so %d lon hon so %d",a,b);
        }
        else if (a == b){
            System.out.printf(" so %d va so %d bang nhau",a,b);
        }
        else{
            System.out.printf(" so %d be hon so %d",a,b);
        }
        //bai2//
        if (a % 2 == 0) {
            System.out.printf(" so %d la so chan",a);
        }
        else{
            System.out.printf(" so %d la so le",a);
        }
}
}