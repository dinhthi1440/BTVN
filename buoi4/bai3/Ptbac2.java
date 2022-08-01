
import java.util.Scanner;

public class Ptbac2 {
    private int a;
    private int b;
    private int c;
    
    static Scanner sc = new Scanner(System.in);

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    public void inPut() {
        System.out.println("Nhap vao gia tri a: ");
        a = sc.nextInt();
        System.out.println("Nhap vao gia tri b: ");
        b = sc.nextInt();
        System.out.println("Nhap vao gia tri c: ");
        c = sc.nextInt();
    }
    public void tinhNghiem(){
        int delta = (b*b) -(4*a*c);
        if(delta == 0 ) {
            System.out.println("Phuong trinh co nghiem duy nhat: x = " + (-b/(2*a)));
        } else if(delta > 0) {
            System.out.println("Phuong trinh co 2 nghiem phan biet: " );
            System.out.println("X1 = " + ((-b+Math.sqrt(delta))/(2*a)));
            System.out.println("X2 = " + ((-b-Math.sqrt(delta))/(2*a)));
        } else {
            System.out.println("Phuong trinh vo nghiem !");
        }
        
    }
    public static void main(String[] args) {
        Ptbac2 Ptbac2a = new Ptbac2();
        System.out.println("Phuong trinh bac 2 co dang: ax^2 + bx + c");
        System.out.println("Nhap vao thong tin cua PtBac2 a: ");
        Ptbac2a.inPut();
        Ptbac2a.tinhNghiem();
    }
}
