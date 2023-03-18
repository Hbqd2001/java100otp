package BaiThucHanhLab2;

import java.util.Scanner;

public class slide93 {
    public static void main(String[] args){
        String ten;
        int namsinh;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten:");
        ten = scanner.nextLine();
        do{
            System.out.println("Nhap nam sinh ra:");
            namsinh = scanner.nextInt();
        }
        while(namsinh < 0 && namsinh >= 2023);
        int tuoi = 2023 - namsinh;
    
    if(tuoi < 16){
        System.out.println("Ban"+ ten +"o do tuoi vi thanh nien");
    }
    else if(tuoi > 16 && tuoi<18){
        System.out.println("Ban"+ ten +"o do tuoi truong thanh");
    }
    else{
        System.out.println("Ban"+ ten +" da gia");
    }
}
}
