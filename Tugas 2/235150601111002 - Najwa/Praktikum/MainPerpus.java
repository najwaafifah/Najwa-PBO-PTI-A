import java.util.Scanner;

public class MainPerpus {
    static Scanner input = new Scanner(System.in);
    
    public static int mainMenu() {
        System.out.println("Nama : Najwa Afifah");
        System.out.println("NIM : 235150601111002");
        System.out.println("Kelas : PTI - A \n\n");
        System.out.println("Selamat datang di perpustakaan");
        System.out.println("Kami memiliki 7 kategori buku : ");
        System.out.println("1. Teknologi\n2. Filsafat\n3. Sejarah\n4. Agama\n5. Psikologi\n6. Politik\n7. Fiksi\n0. Keluar");
        System.out.print("Pilih kategori yang diinginkan : "); 
        int pilihanMenu = input.nextInt();
        input.nextLine();
        return pilihanMenu;
    }
    
    public static void main(String[] args) {
        ListBuku listBuku = new ListBuku();    
        listBuku.berdasarkanKategori(mainMenu());
    }
    
}
