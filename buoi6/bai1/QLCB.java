
import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<KySu> danhSachks = new ArrayList<>();
    static ArrayList<CongNhan> danhSachcn = new ArrayList<>();
    static ArrayList<NhanVien> danhSachnv = new ArrayList<>();

    //1. add can bo
    public static void addCb() {
        System.out.println("Nhap lua chon can bo can add\n1. Cong nhan\n2. Ky su\n3.Nhan vien");
        int chon = sc.nextInt();
        while (chon > 3 & chon < 1) {
            System.out.println("Nhap lai lua chon: ");
            chon = sc.nextInt();
        }
        if (chon == 1) {
            CongNhan cn = new CongNhan();
            cn.inputCongnhan();
            danhSachcn.add(cn);
        } else if (chon == 2) {
            KySu ks = new KySu();
            ks.inputKysu();
            danhSachks.add(ks);
        } else if (chon == 3) {
            NhanVien nv = new NhanVien();
            nv.inputNhanvien();
            danhSachnv.add(nv);
        }
    }

    //2. hien thi
    public static void hienThids() {
        System.out.println("Danh sach cong nhan");
        System.out.printf("%-10s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Ho ten", "Nam sinh", "Gioi tinh", "Dia chi", "Bac");
        for (int i = 0; i < danhSachcn.size(); i++) {
            danhSachcn.get(i).outputCongnhan();
        }
        System.out.println("Danh sach ky su");
        System.out.printf("%-10s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Ho ten", "Nam sinh", "Gioi tinh", "Dia chi", "Nganh dao tao");
        for (int i = 0; i < danhSachks.size(); i++) {
            danhSachks.get(i).outputKysu();
        }
        System.out.println("Danh sach nhan vien");
        System.out.printf("%-10s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Ho ten", "Nam sinh", "Gioi tinh", "Dia chi", "Cong viec");
        for (int i = 0; i < danhSachnv.size(); i++) {
            danhSachnv.get(i).outputNhanvien();
        }
    }

    //3. xoa can bo
    public static void xoaTheoid() {
        int count = 0;
        do {
            System.out.println("Nhap id can bo can xoa: ");
            int so = sc.nextInt();
            for (int i = 0; i < danhSachcn.size(); i++) {
                if (so == danhSachcn.get(i).id) {
                    danhSachcn.remove(i);
                    System.out.println("Da xoa id: " +so);
                    count++;
                }
            }
            for (int i = 0; i < danhSachks.size(); i++) {
                if (so == danhSachks.get(i).id) {
                    danhSachks.remove(i);
                    System.out.println("Da xoa id" +so);
                    count++;
                }
            }
            for (int i = 0; i < danhSachnv.size(); i++) {
                if (so == danhSachnv.get(i).id) {
                    danhSachnv.remove(i);
                    System.out.println("Da xoa id" +so);
                    count++;
                }
            }
        } while (count == 0);
    }

    //4. tim kiem can bo
    public static void timKiemcb() {
        int count = 0;
        do {
            System.out.println("Nhap id can bo can tim kiem: ");
            int so = sc.nextInt();
            for (int i = 0; i < danhSachcn.size(); i++) {
                if (so == danhSachcn.get(i).id) {
                    System.out.printf("%-10s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Ho ten", "Nam sinh", "Gioi tinh", "Dia chi", "Bac");
                    danhSachcn.get(i).outputCongnhan();
                    count++;
                }
            }
            for (int i = 0; i < danhSachks.size(); i++) {
                if (so == danhSachks.get(i).id) {
                    System.out.printf("%-10s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Ho ten", "Nam sinh", "Gioi tinh", "Dia chi", "Nganh dao tao");
                    danhSachks.get(i).outputKysu();
                    count++;
                }
            }
            for (int i = 0; i < danhSachnv.size(); i++) {
                if (so == danhSachnv.get(i).id) {
                    System.out.printf("%-10s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Ho ten", "Nam sinh", "Gioi tinh", "Dia chi", "Cong viec");
                    danhSachnv.get(i).outputNhanvien();
                    count++;
                }
            }
        } while (count == 0);
    }

    public static void main(String[] args) {
        int number;
        do {
            System.out.println("Nhap vao chuong trinh can thuc hien: ");
            number = sc.nextInt();
            switch (number) {
                case 1: {
                    addCb();
                    break;
                }
                case 2: {
                    System.out.println("\tDanh sach can bo");
                    hienThids();
                    break;
                }
                case 3: {
                    xoaTheoid();
                    System.out.println("\tDanh sach sau khi xoa");
                    hienThids();
                    break;
                }
                case 4: {
                    timKiemcb();
                    break;
                }
                case 5: {
                    break;
                }
            }
        } while (number != 5);
    }
}
