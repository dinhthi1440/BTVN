
import java.util.Scanner;

public class HinhChuNhat {
   
    private int chieuDai;
    private int chieuRong;
    static Scanner sc = new Scanner(System.in);
    public void setChieuDai(int chieuDai) {
        if(chieuDai >0) {
            this.chieuDai = chieuDai;
        } else {
            this.chieuDai = 1;
        }
    }
    public void setChieuRong(int chieuRong) {
        if(chieuRong > 0) {
            this.chieuRong = chieuRong;
        }else {
            this.chieuRong = 1;
        }
    }
    public int getChieuDai() {
        return chieuDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }
    
    public void inPut(){
        System.out.print("Nhap vao chieu dai cua hinh chu nhat: ");
        chieuDai = sc.nextInt();
        System.out.print("Nhap vao chieu rong cua hinh chu nhat: ");
        chieuRong = sc.nextInt();
        
    }
    public int dienTich(){
        int dienTich = chieuDai*chieuRong;
        return dienTich;
    }
    public int chuVi(){
        int chuVi = (chieuDai + chieuRong)*2;
        return chuVi;
    }
    public static void main(String[] args) {
        HinhChuNhat hinhChuNhata = new HinhChuNhat();
        HinhChuNhat hinhChuNhatb = new HinhChuNhat();
        System.out.println("Hinh chu nhat a ");
        hinhChuNhata.inPut();
        System.out.println("Hinh chu nhat b ");
        hinhChuNhatb.inPut();
        System.out.println("Chieu dai cua hcn a la: " + hinhChuNhata.getChieuDai());
        System.out.println("Chieu rong cua hcn a la: " + hinhChuNhata.getChieuRong());
        System.out.println("Chieu dai cua hcn b la: " + hinhChuNhatb.getChieuDai());
        System.out.println("Chieu rong cua hcn b la: " + hinhChuNhatb.getChieuRong());
        System.out.println("Chu vi cua hinh chu nhat a la: "+ hinhChuNhata.chuVi());
        System.out.println("Chu vi cua hinh chu nhat b la: "+ hinhChuNhatb.chuVi());
        System.out.println("Dien tich cua hinh chu nhat a la: "+ hinhChuNhata.dienTich());
        System.out.println("Dien tich cua hinh chu nhat b la: "+ hinhChuNhatb.dienTich());
        if(hinhChuNhata.dienTich() == hinhChuNhatb.dienTich()) {
            System.out.println("Hai hinh chu nhat co dien tich bang nhau !");
        } else if(hinhChuNhata.dienTich() > hinhChuNhatb.dienTich()){
            System.out.println("HinhChuNhat a co dien tich lon hon !");
        } else {
            System.out.println("HinhChuNhat b co dien tich lon hon !");
        }
        
    }
}
