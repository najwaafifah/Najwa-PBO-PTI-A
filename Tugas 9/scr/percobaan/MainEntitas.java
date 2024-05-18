import java.util.Scanner;

public class MainEntitas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nama Manusia:");
        String namaManusia = scanner.nextLine();
        System.out.println("umur Manusia:");
        int umurManusia = scanner.nextInt();
        scanner.nextLine();

        System.out.println("nama Hewan:");
        String namaHewan = scanner.nextLine();
        System.out.println("umur Hewan:");
        int umurHewan = scanner.nextInt();

        Manusia manusia1 = new Manusia(namaManusia, umurManusia);
        Hewan hewan1 = new Hewan(namaHewan, umurHewan);
        Hewan serigala = new Hewan("buroqqq", 12);

        manusia1.makan();
        manusia1.berjalan();
        manusia1.bersuara();
        manusia1.tampilkanNama();
        manusia1.tampilkanUmur();

        hewan1.makan();
        hewan1.berjalan();
        hewan1.bersuara();
        hewan1.tampilkanNama();
        hewan1.tampilkanUmur();
        
        serigala.ganggu(); 
    }
}
