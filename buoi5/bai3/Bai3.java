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

    public static void check() {
        if (isPrime(5.77) == false) {
            System.out.println("Day khong phai so nguyen to !");
        } else {
            System.out.println("Day la so nguyen to !");
        }
    }

    public static void main(String[] args) {
        check();
    }

}
