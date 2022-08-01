
import java.util.Scanner;

public class NhanVien {
        private int maNv;
        private String ten;
        private int tuoi;
        private String diaChi;
        private String boPhan;
        
    static Scanner sc = new Scanner(System.in);

    public void setMaNv(int maNv) {
        this.maNv = maNv;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setBoPhan(String boPhan) {
        this.boPhan = boPhan;
    }

    public int getMaNv() {
        return maNv;
    }

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getBoPhan() {
        return boPhan;
    }
    
    public void input() {
        System.out.println("Nhap ma nhan vien vien: ");
        maNv = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten nhan vien: ");
        ten = sc.nextLine();
        System.out.println("Nhap tuoi nhan vien: ");
        tuoi = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap dia chi nhan vien: ");
        diaChi = sc.nextLine();
//        sc.nextLine();
        System.out.println("Nhap bo phan lam viec cua nhan vien: ");
        boPhan = sc.nextLine();
    }
    public void output() {
        System.out.printf("%-10d%-10s%-10d%-10s%-10s\n", maNv, ten, tuoi, diaChi, boPhan);
    }
    
    public static void main(String[] args) {
        System.out.println("Nhan vien 1 ");
        NhanVien nV1 = new NhanVien();
        nV1.input();
        System.out.println("Nhan vien 2 ");
        NhanVien nV2 = new NhanVien();
        nV2.input();
        System.out.println("Nhan vien 3 ");
        NhanVien nV3 = new NhanVien();
        nV3.input();
        System.out.println("Nhan vien 4 ");
        NhanVien nV4 = new NhanVien();
        nV4.input();
        System.out.println("Nhan vien 5 ");
        NhanVien nV5 = new NhanVien();
        nV5.input();
        System.out.println("          THONG TIN CAC NHAN VIEN");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Manv", "Tennv", "Tuoi", "DiaChi", "BoPhan");
        nV1.output();
        nV2.output();
        nV3.output();
        nV4.output();
        nV5.output();
    }
    
}
