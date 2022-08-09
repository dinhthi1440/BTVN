import java.util.Scanner;

public class Student {
    static Scanner sc = new Scanner(System.in);
    private int id;
    private String name;
    private String age;
    private Address addr = new Address();

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public Address getAddr() {
        return addr;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }
    public void input() {
        System.out.println("Nhap vao id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten: ");
        name = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        age = sc.nextLine();
        addr.input();
    }
    public void output() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        addr.output();
    }
    public void timKiem() {
    }
    public static void main(String[] args) {
        System.out.println("\t\tMENU THUC HIEN");
        System.out.println("\t1,Nhap mot mang n sinh vien\n\t2,Hien thi thong tin cac sinh vien ra man hinh\n\t3,Tin kiem sinh vien theo Id va hien thi ra man hinh\n\t4,Sua cac sinh vien co province la ''Thanh Hoa'' thanh ''Hai Phong''\n\t5,Xoa sinh vien theo id");
        System.out.println("Nhap vao chuong trinh ban muon thuc hien: ");
        int x = sc.nextInt();
        while (x < 1 || x > 5) {
            System.out.println("Nhap chuong trinh chua dung, moi nhap lai !");
            x = sc.nextInt();
        }
        while (x >= 2 && x <= 5) {
            System.out.println("Chua nhap thong tin sinh vien nen khong the thuc hien chuc nang nay!");
            System.out.println("Moi nhap 1 de nhap thong tin sinh vien: ");
            x = sc.nextInt();
        }
        System.out.println("\t1,Nhap thong tin sinh vien");
        int n;
        System.out.println("Nhap vao so luong sinh vien: ");
        n = sc.nextInt();
        Student std[] = new Student[n];
        for (int i = 0; i < n; i++) {
            std[i] = new Student();
            System.out.println("- Sinh vien thu " + (i + 1) + ":");
            std[i].input();
            for (int j = 0; j < i; j++) {
                while (std[i].id == std[j].id) {
                    System.out.println("id cua sinh vien thu " + (i + 1) + " bi trung, moi nhap lai id: ");
                    std[i].id = sc.nextInt();
                }
            }
        }
        System.out.println("Nhap vao chuong trinh ban muon thuc hien: ");
        x = sc.nextInt();
        while (x < 2 || x > 5) {
            System.out.println("Nhap chuong trinh chua dung, moi nhap lai !");
            x = sc.nextInt();
        }
        switch (x) {
            case 2:{
                System.out.println("\t2,Thong tin sinh vien");
                for (int i = 0; i < n; i++) {
                    System.out.println("- Sinh vien thu " + (i + 1) + ":");
                    std[i].output();
                }
                break;
            }  
            case 3:{
                System.out.println("\t3,Nhap id sinh vien can tim kiem: ");
                int find = sc.nextInt();
                System.out.println("Thong tin sinh vien tim kiem");
                for (int i = 0; i < n; i++) {
                    if (std[i].id == find) {
                        std[i].output();
                    }
                }
                break;
            }
            case 4:{
                System.out.println("\t4,Sau khi sua province");
                for (int i = 0; i < n; i++) {
                    std[i].addr.setProvince(std[i].addr.getProvince().toLowerCase().replaceAll("thanhhoa", "HaiPhong"));
                    std[i].output();
                }
                break;
            }
            case 5:{
                System.out.println("\t5,Nhap vao id sinh vien can xoa: ");
                int xoa = sc.nextInt();
                int index = 0;
                for (int i = 0; i < n; i++) {
                    if (std[i].id == xoa) {
                        index = i;
                    }
                }
                for (int i = index; i < n - 1; i++) {
                    std[i] = std[i + 1];
                }
                n--;
                System.out.println("\tThong tin cac sinh vien sau khi xoa ");
                for (int i = 0; i < n; i++) {
                    System.out.println("- Sinh vien thu " + (i + 1) + ":");
                    std[i].output();
                }
                break;
            }
                
        }
        


    }
}
