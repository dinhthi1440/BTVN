import java.util.Scanner;

public class SinhVienn {
    static Scanner sc = new Scanner(System.in);
    protected String msv;
    protected String tenSv;
    protected String ngaySinh;
    protected String diaChi;
    protected String lop;
    protected float gpa;

    public String getMsv() {
        return msv;
    }

    public String getTenSv() {
        return tenSv;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getLop() {
        return lop;
    }

    public float getGpa() {
        return gpa;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public void setTenSv(String tenSv) {
        this.tenSv = tenSv;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    public void inputSv(){
//        System.out.println("Nhap ten");
        tenSv = sc.nextLine();
        tenSv = tenSv.trim().toLowerCase();
        tenSv = tenSv.replaceAll("\\s+", " ");
        String[] temp=tenSv.split(" ");
        tenSv = "";
        for(int i=0; i<temp.length; i++){
            tenSv+=String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if(i<temp.length-1){
                tenSv+=" ";
            }
        }
//        System.out.println("Nhap ngay sinh");
        ngaySinh = sc.nextLine();
//        System.out.println("Nhap dia chi");
        diaChi = sc.nextLine();
//        System.out.println("Nhap lop");
        lop = sc.nextLine();
//        System.out.println("Nhap gpa");
        gpa = sc.nextFloat();
        sc.nextLine();
        
    }
    public void outputSv(){
        System.out.printf("%s %s %s %s %s %.2f\n", msv, tenSv, ngaySinh, diaChi, lop, gpa);
    }
}
