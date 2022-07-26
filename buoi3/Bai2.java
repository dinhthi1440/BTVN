
package bai2;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao chuoi: ");
        String chuoi = sc.nextLine();
        chuoi=chuoi.trim().toLowerCase();
        System.out.println("Chuoi vua nhap vao la: " + chuoi);
        chuoi = chuoi.replaceAll("\\s+", " ");
        String[] a = chuoi.split(" ");
        chuoi="";
        for(int i=0; i< a.length; i++) {
            String chuoiCon = a[i];
            for(int j = 0; j< chuoiCon.length(); j++){
                if(chuoiCon.charAt(j) >= '0' & chuoiCon.charAt(j) <= '9'){
                    chuoiCon = chuoiCon.replace(chuoiCon.charAt(j), ' ');
                }
            }
            chuoiCon=chuoiCon.replaceAll(" ", "");
            chuoi += String.valueOf(chuoiCon.charAt(0)).toUpperCase()+ chuoiCon.substring(1);
            if(i < a.length-1){
                chuoi+= " ";
            }
        }
        System.out.println("Chuoi sau khi duoc chuan hoa la: " + chuoi);
    }
}
