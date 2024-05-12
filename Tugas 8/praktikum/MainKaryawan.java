package praktikum.Tugas_8;
import java.util.Scanner;

public class MainKaryawan {
    static String nama;
    static int pilihan;
    
    public static void main(String[] args) {
        Karyawan karyawan = new Karyawan("John", 500); 
        Karyawan manager = new Manager("Budi", 1000, 500);
        menuUtama();
        
        if(pilihan == 1) {
            if(manager instanceof Manager) {
                Manager managerB = (Manager) manager;
                System.out.println("Gaji Manager : " + managerB.cekPenghasilan());
            }
        } else if (pilihan == 2) {
            if(karyawan instanceof Karyawan) {
                System.out.println("Gaji Karyawan : " + karyawan.cekPenghasilan());
            }
        }
    }
    
    public static void menuUtama() {
        Scanner s = new Scanner(System.in);
        System.out.println("== Program data nama pegawai dan gaji ==");
        System.out.print("Masukkan nama : ");
        nama = s.nextLine();
        System.out.print("1. Manager\n2. Karyawan\nMasukkan jabatan :");
        pilihan = s.nextInt();
        s.nextLine();
    }
}
