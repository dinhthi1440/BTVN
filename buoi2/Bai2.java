package bai2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, c;
        System.out.print("Nhap vao do dai canh a, b, c lan luot la: ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        int count=0;
        for(int i=1; i<=3;i++) {
            float d;
            d=a;
            a=b;
            b=c;
            c=d;
            if(a+b>c){
                count++;
            }
        }
        if(count==3){
            System.out.println("3 canh nay co the tao thanh 1 tam giac");
            if(a==b & b==c){
                System.out.println("Day la tam giac deu");
            } else if(a==b | b==c | c==a){
                if(a*a + b*b == c*c | a*a + c*c == b*b | b*b + c*c == a*a) {
                   System.out.println("Day la tam giac vuong can"); 
                }else {
                    System.out.println("Day la tam giac can");
                }    
            } else if(a*a + b*b == c*c | a*a + c*c == b*b | b*b + c*c == a*a){
                System.out.println("Day la tam giac vuong");
            } else {
                System.out.println("Day la tam giac thuong");
            }
        } else {
            System.out.println("3 canh nay KHONG the tao thanh 1 tam giac");
        }
        
    }
    
}
