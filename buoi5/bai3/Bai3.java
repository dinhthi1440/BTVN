package bai3;

import java.util.Scanner;

public class Bai3 {

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else {
            int a = (int) Math.sqrt(n);
            for (int i = 2; i <= a; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean isPrime(long n) {
        if (n < 2) {
            return false;
        } else {
            int a = (int) Math.sqrt(n);
            for (int i = 2; i <= a; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean isPrime(float n) {
        if (n < 2) {
            return false;
        } else if (n % 1 != 0) {
            return false;
        } else {
            int a = (int) Math.sqrt(n);
            for (int i = 2; i <= a; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }

    }
    public static boolean isPrime(double n) {
        if (n < 2) {
            return false;
        } else if (n % 1 != 0) {
            return false;
        } else {
            int a = (int) Math.sqrt(n);
            for (int i = 2; i <= a; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao int n1: ");
        int n1 = sc.nextInt();
        System.out.println("Nhap vao long n2: ");
        long n2 = sc.nextLong();
        System.out.println("Nhap vao float n3: ");
        float n3 = sc.nextFloat();
        System.out.println("Nhap vao double n4: ");
        double n4 = sc.nextDouble();
        System.out.println("Voi int n1 = "+ n1);
        if (isPrime(n1) == false) {
            System.out.println("Day khong phai so nguyen to !");
        } else {
            System.out.println("Day la so nguyen to !");
        }
        System.out.println("Voi long n2 = "+ n2);
        if (isPrime(n2) == false) {
            System.out.println("Day khong phai so nguyen to !");
        } else {
            System.out.println("Day la so nguyen to !");
        }
        System.out.println("Voi float n3 = "+ n3);
        if (isPrime(n3) == false) {
            System.out.println("Day khong phai so nguyen to !");
        } else {
            System.out.println("Day la so nguyen to !");
        }
        System.out.println("Voi double n4 = "+ n4);
        if (isPrime(n4) == false) {
            System.out.println("Day khong phai so nguyen to !");
        } else {
            System.out.println("Day la so nguyen to !");
        }
    }

}
