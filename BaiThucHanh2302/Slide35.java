package BaiThucHanh2302;

import java.util.Scanner;

public class Slide35 {
    public static void main(String[] args) {
        int a;
        int b;
        //Nhập số a//
        Scanner soa = new Scanner(System.in); 
        System.out.println("Nhập số a:"); 
        a = soa.nextInt();
        //Nhập số b//
        Scanner sob = new Scanner(System.in);
        System.out.println("Nhập số b:"); 
        b = sob.nextInt();    
        if(a > b) {
            System.out.println("Số  lớn nhất"+ a);
        }
           else{
            System.out.println("Số  lớn nhất" + b);
           }
        
      }
}
