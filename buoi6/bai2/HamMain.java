
import java.util.ArrayList;
import java.util.Scanner;

public class HamMain {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<PhuongTien> listPt = new ArrayList<>();
    
    public void thue(){
        
    }
    
    //a, nhap thong tin va tao danh sach xe
    public static void nhapTn(){
        System.out.println("Nhap so luong xe can nhap thong tin: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            PhuongTien pt = new PhuongTien();
            pt.input();
            listPt.add(pt);
        }
        
    }
    
    //b, Bang ke khai tien thue
    public static void keKhaithue(){
        System.out.printf("%20s%20s%20s%20s%20s\n","Ten chu xe", "Loai xe", "Dung tich", "Tri gia", "Thue");
        for(int i=0; i<listPt.size(); i++){
            if(listPt.get(i).dungTich < 100){
                listPt.get(i).setThue(listPt.get(i).triGia/100*2);
            } else if(listPt.get(i).dungTich >= 100 & listPt.get(i).dungTich <=200){
                listPt.get(i).setThue(listPt.get(i).triGia/100*6);
            } else if(listPt.get(i).dungTich > 200){
                listPt.get(i).setThue(listPt.get(i).triGia/100*10);
            }
            listPt.get(i).output();
        }
        
    }
    
    //c, Bang ke khai tien thue giam dan
    public static void thueGiamdan(){
        PhuongTien[] arr1 = new PhuongTien[listPt.size()];
        listPt.toArray(arr1);
        PhuongTien temp = arr1[0];
        for(int i=0; i<arr1.length-1; i++){
            for(int j=i+1; j<arr1.length;j++){
                if(arr1[i].thue < arr1[j].thue){
                    temp = arr1[j];
                    arr1[j] = arr1[i];
                    arr1[i] = temp;
                }
            }
        }
        listPt.removeAll(listPt);
        for(PhuongTien i : arr1){
            listPt.add(i);
        }
    }
    //d, tang dan
    public static void thueTangdan(){
        PhuongTien[] arr2 = new PhuongTien[listPt.size()];
        listPt.toArray(arr2);
        PhuongTien temp = arr2[0];
        for(int i=0; i<arr2.length-1; i++){
            for(int j=i+1; j<arr2.length;j++){
                if(arr2[i].thue > arr2[j].thue){
                    temp = arr2[j];
                    arr2[j] = arr2[i];
                    arr2[i] = temp;
                }              
            }
        }
        listPt.removeAll(listPt);
        for(PhuongTien i : arr2){
            listPt.add(i);
        }
    }
    public static void main(String[] args) {
        char number;
        do {
            System.out.println("Nhap vao chuong trinh can thuc hien: ");
            number = sc.next().charAt(0);
            switch (number) {
                case 'a': {
                    nhapTn();
                    break;
                }
                case 'b': {
                    System.out.println("\tBang ke khai tien thue truoc ba xe");
                    keKhaithue();
                    break;
                }
                case 'c': {
                    System.out.println("\tDanh sach sau khi sap xep thue giam dan");
                    thueGiamdan();
                    keKhaithue();
                    break;
                }
                case 'd': {
                    System.out.println("\tDanh sach sau khi sap xep thue tang dan");
                    thueTangdan();
                    keKhaithue();
                    break;
                }
                case 'e': {
                    break;
                }
            }
        } while (number != 'e');
    }
}
