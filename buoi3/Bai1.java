package bai1;

import java.util.Scanner;

public class Bai1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu trong mang: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Nhap vao gia tri cua cac phan tu trong mang: ");
        for(int i=0; i<n; i++){
            System.out.printf("arr(%d) = ", i);
            arr[i]= sc.nextInt();
        }
        
        int count=0, sum=0; 
        for(int i=0; i<n; i++) {
            if(arr[i] % 2!=0 & (i+1)%2==0) {
                count++;
                sum+=arr[i];
            }
        }
        if(count != 0){
            System.out.println("Khong co so le o vi tri chan nao !");
        } else {
            System.out.println("Trung binh cong cua cac so le o vi tri chan la: " + (float)sum/count);
        }
        
        int value=arr[0];
        for(int i=0; i<n; i++) {
            if(arr[i] < value) {
                value=arr[i];
            }
        }
        System.out.println("So nho nhat la: " + value);
        System.out.print("Vi tri cua cac so nho nhat la: ");
        for(int i=0; i<n; i++){
            if(arr[i]==value){
                System.out.println((i+1) + " ");
            }
        }
        
        int count1=0;
        for(int i=0; i<n; i++) {
            if(Math.sqrt((double)arr[i]) % 1== 0) {
                count1++;
            }
        }
        if(count1==0) {
            System.out.println("Mang khong co so chinh phuong !");
        } else {
            System.out.print("Trong mang co so chinh phuong, do la cac so: ");
        }
        for(int i=0; i<n; i++) {
            if(Math.sqrt((double)arr[i]) % 1 == 0) {
                System.out.println(arr[i] + " ");
            }
        }
        
        int count2=0;
        for(int i=0; i<n; i++) {
            for(int j=1; j<=arr[i]; j++) {
                if(arr[i]>=2 & arr[i] % j== 0 ) {
                    count2++;
                    break;
                }
            }
        }
        
        if (count2 ==0 ) {
            System.out.println("Trong mang khong co so nguyen to nao ! ");
        } else {
            System.out.print("Cac so nguyen to trong mang la: ");
        }
        count2=0;
        for(int i=0; i<n; i++) {
            for(int j=1; j<=arr[i]; j++) {
                if(arr[i]>=2 & arr[i] % j== 0 ) {
                    count2++;
                }
            }
            if(count2==2){
                System.out.println(arr[i] + " ");
            }
            count2=0;
        }
        int temp;
        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Cac phan tu trong mang sau khi sap xep la: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " " );
        }
    }  
}
