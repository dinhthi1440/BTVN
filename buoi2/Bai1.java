package bai1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day, month, year;
        
        System.out.print("Nhap vao nam sinh: ");
        year=sc.nextInt();
        System.out.print("Nhap vao thang sinh: ");
        month=sc.nextInt();
        while(month<0 || month >12){
            System.out.print("Moi nhap lai thang sinh: ");
            month=sc.nextInt();
        }
        System.out.print("Nhap vao ngay sinh: ");
        day=sc.nextInt();
        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:{
                while(day<0 || day >31){
                    System.out.print("Moi nhap lai ngay sinh trong khoang tu ngay 1 den 31: ");
                    day=sc.nextInt();
                }
                break;
            }
            case 4: case 6: case 9: case 11: {
                while(day<0 || day >30){
                    System.out.print("Moi nhap lai ngay sinh trong khoang tu ngay 1 den 30: ");
                    day=sc.nextInt();
                }
                break;
            }
            case 2: {
                if(year%4==0 && year%100!=0 || year%400==0){
                    while(day<0 || day >29){
                        System.out.print("Moi nhap lai ngay sinh trong khoang tu ngay 1 den 29: ");
                        day=sc.nextInt();
                    }
                } else {
                    while(day<0 || day >28){
                        System.out.print("Moi nhap lai ngay sinh trong khoang tu ngay 1 den 28: ");
                        day=sc.nextInt();
                    }
                }
                break;
            }
        }
        switch (month) {
            case 1: {
                if(day>=20){
                    System.out.println("Ban thuoc cung Bao Binh");
                } else {
                    System.out.println("Ban thuoc cung Ma ket");
                }
                break;
            }
            case 2: {
                if(day>=19){
                    System.out.println("Ban thuoc cung Song Ngu");
                } else {
                    System.out.println("Ban thuoc cung Bao Binh");
                }
                break;
            }
            case 3: {
                if(day>=21){
                    System.out.println("Ban thuoc cung Bach Duong");
                } else {
                    System.out.println("Ban thuoc cung Song Ngu");
                }
                break;
            }
            case 4: {
                if(day>=21){
                    System.out.println("Ban thuoc cung Kim Nguu");
                } else {
                    System.out.println("Ban thuoc cung Bach Duong");
                }
                break;
            }
            case 5: {
                if(day>=21){
                    System.out.println("Ban thuoc cung Song Tu");
                } else {
                    System.out.println("Ban thuoc cung Kim Nguu");
                }
                break;
            }
            case 6: {
                if(day>=22){
                    System.out.println("Ban thuoc cung Cu Giai");
                } else {
                    System.out.println("Ban thuoc cung Song Tu");
                }
                break;
            }
            case 7: {
                if(day>=23){
                    System.out.println("Ban thuoc cung Su Tu");
                } else {
                    System.out.println("Ban thuoc cung Cu Giai");
                }
                break;
            }
            case 8: {
                if(day>=23){
                    System.out.println("Ban thuoc cung Xu Nu");
                } else {
                    System.out.println("Ban thuoc cung Su Tu");
                }
                break;
            }
            case 9: {
                if(day>=23){
                    System.out.println("Ban thuoc cung Thien Binh");
                } else {
                    System.out.println("Ban thuoc cung Xu Nu ");
                }
                break;
            }
            case 10: {
                if(day>=24){
                    System.out.println("Ban thuoc cung Bo Cap");
                } else {
                    System.out.println("Ban thuoc cung Thien Binh");                }
                break;
            }
            case 11: {
                if(day>=23){
                    System.out.println("Ban thuoc cung Nhan Ma");
                } else {
                    System.out.println("Ban thuoc cung Bo Cap ");
                }
                break;
            }
            case 12: {
                if(day>=22){
                    System.out.println("Ban thuoc cung Ma Ket");
                } else {
                    System.out.println("Ban thuoc cung Nhan Ma ");
                }
                break;
            }
        }
    }
    
}
