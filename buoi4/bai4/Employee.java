
import java.util.Scanner;

public class Employee {
    private String id;
    private String name;
    private int age;
    private int workingDays;
    private static int PRICE = 50;
    static Scanner sc = new Scanner(System.in);

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }

    public Employee(String id, String name, int age, int workingDays) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.workingDays = workingDays;
    }
    public Employee(){
    
}

    public double salary(){
        double salary = workingDays * PRICE;
        return salary;
    }
    public void inPut(){
        System.out.println("Nhap vao ma nhan vien: ");
        id = sc.nextLine();
        System.out.println("Nhap vao ho ten: ");
        name = sc.nextLine();
        System.out.println("Nhap vao tuoi: ");
        age = sc.nextInt();
        System.out.println("Nhap vao so ngay cong: ");
        workingDays = sc.nextInt();
    }
    public void outPut(){
        System.out.println("Ma nhan vien: " +id);
        System.out.println("Ho ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("So ngay cong: " + workingDays);
        System.out.println("Tien thuong: " + salary());
    }
    public static void main(String[] args) {
        Employee nhanVien1 = new Employee();
        nhanVien1.inPut();
        System.out.println("       Thong tin cua Employee ");
        nhanVien1.outPut();
        
    }
}
