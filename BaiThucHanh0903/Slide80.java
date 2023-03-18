package BaiThucHanh0903;

import java.util.Scanner;

public class Slide80 {
    public static void main(String[] args){
        int sohang,socot;
        
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Nhap so hang:");
            sohang = scanner.nextInt();
            System.out.println("Nhap so cot:");
            socot = scanner.nextInt();
        }
        while((sohang <=0 ) || (socot <=0));
        int arrA[][] = new int[sohang][socot];
        for(int i = 0; i < sohang; i++){
            for(int j = 0; j <socot; j++){
                System.out.println("Nhap=");
                arrA[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0; i < sohang; i++){
            for(int j = 0; j <socot; j++){
                System.out.printf("%d",arrA[i][j]);
               
            }
            System.out.println("");
        }

    }
    
}
