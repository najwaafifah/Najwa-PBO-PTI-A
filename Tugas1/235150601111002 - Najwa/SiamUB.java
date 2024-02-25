import java.util.Scanner;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;

public class SiamUB {
    static Scanner input = new Scanner(System.in);
    static String namaMHS;
    static String NIM;
    static String angkatan;
    static String jurusan;
    static String semester;
    static double IPK;

    static String[] namaMatkul = new String[20];
    static String[] pilihanMatkulMahasiswa = new String[20];
    public static void main(String[] args) {
        bacaMatkulWajibDariFile("kartuRencanaStudi.txt");
        menuUtama();
    }

    public static void bacaMatkulWajibDariFile(String namaFile) {
        try (Scanner scanner = new Scanner(new File(namaFile))) {
            int index = 0;
            while (scanner.hasNextLine() && index < namaMatkul.length) {
                namaMatkul[index] = scanner.nextLine();
                index++;
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static void menuUtama() {
        boolean keluar = false;
        
        while (keluar == false) {
            System.out.println("Selamat datang di pendataan KRS");
            System.out.println("Pilihan menu : ");
            System.out.println("1. Daftar KRS\n2. Lihat KRS\n3. Cetak KRS ke File\n4. Keluar");
            int pilihanUtama = input.nextInt();
            input.nextLine();
            switch (pilihanUtama) {
                case 1 :
                    daftarKRS();
                    break;
                case 2 :
                    lihatKRS();
                    break;
                case 3 :
                    simpanKRSKeFile("kartuRencanaStudi.txt");
                    break;
                case 4 :
                    System.out.println("Terima kasih");
                    keluar = true;
                    System.exit(0);
                default :
                    System.out.println("Maaf, pilihan anda tidak sesuai");
            }
        }
    }
    
    public static void daftarKRS() {
        isiBiodata();
        lihatKRS();
        pilihKRS();
    }
    
    public static void isiBiodata() {
        System.out.print("Nama : ");
        namaMHS = input.nextLine();
        System.out.print("NIM : ");
        NIM = input.nextLine();
        System.out.print("Jurusan : ");
        jurusan = input.nextLine();
        System.out.print("Angkatan : ");
        angkatan = input.nextLine();
        System.out.print("Semester : ");
        semester = input.nextLine();
        System.out.print("IPK : ");
        IPK = input.nextDouble();
        input.nextLine();
    }
    
    public static void lihatKRS() {
        System.out.println("List Mata Kuliah :");
        System.out.println("Pemograman Web (WAJIB) : 3 SKS.");
        System.out.println("SOK (WAJIB) : 3 SKS.");
        System.out.println("PBO (OPTIONAL) : 3 SKS. KODE : 2");
        System.out.println("Pancasila (OPTIONAL) : 3 SKS. KODE : 3");
        System.out.println("MKBS (OPTIONAL) : 3 SKS. KODE : 4");
        System.out.println("Inggris (OPTIONAL) : 3 SKS. KODE : 5");
        System.out.println("Statistika (OPTIONAL) : 3 SKS. KODE : 6\n");
        
        namaMatkul[0] = "Pemograman Web";
        namaMatkul[1] = "SOK";
        namaMatkul[2] = "PBO";
        namaMatkul[3] = "Pancasila";
        namaMatkul[4] = "MKBS";
        namaMatkul[5] = "Inggris";
        namaMatkul[6] = "Statistika";
    }
    
    public static void pilihKRS() {
        int sisaSKS = 12;
        boolean ulangi = false;

        System.out.println("SKS yang dapat diambil: " + sisaSKS);

        do {
            boolean matkulSama = false;
            int indexPilihanMatkul = 1;

            while (sisaSKS > 1 && !matkulSama) {
                int pilihanKodeMatkul = 0;

                    System.out.println("Pilih kode matkul anda:");
                    pilihanKodeMatkul = input.nextInt();
                    input.nextLine();

                    if (pilihanKodeMatkul >= 0 && pilihanKodeMatkul < namaMatkul.length
                            && pilihanMatkulMahasiswa[pilihanKodeMatkul] == null) {
                        pilihanMatkulMahasiswa[indexPilihanMatkul] = namaMatkul[pilihanKodeMatkul];
                        indexPilihanMatkul += 1;
                        sisaSKS -= 3;
                    } else if (pilihanKodeMatkul >= 0 && pilihanKodeMatkul < namaMatkul.length
                            && pilihanMatkulMahasiswa[pilihanKodeMatkul] != null) {
                        System.out.println("Anda memilih mata kuliah yang sama. Ulangi pengisian KRS.");
                        matkulSama = true;
                        ulangi = true;
                        break;
                    } else {
                        System.out.println("Pilihan tidak valid atau SKS tidak mencukupi.");
                    }
            }

            if (ulangi == true) {
                System.out.println("Pengisian KRS diulangi.");
                Arrays.fill(pilihanMatkulMahasiswa, null);
                sisaSKS = 12;
            }

        } while (ulangi);
        simpanKRSKeFile("kartuRencanaStudi.txt");
    }

    
    public static void simpanKRSKeFile(String namaFile) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(namaFile, true))) {
            String biodata = "Nama : " + namaMHS + "\nNIM : " + NIM + "\nJurusan : " + jurusan + "\nAngkatan : " + angkatan + "\nSemester : " + semester + "\nIPK : " + IPK; 
            writer.write(biodata);
            writer.newLine();
            String teksPilihan = "Pilihan Matkul : ";
            writer.write(teksPilihan);
            writer.newLine();
            
            for (int a = 1; a < pilihanMatkulMahasiswa.length; a++) {
                if (pilihanMatkulMahasiswa[a] != null) {
                    String matkulInfo = "Matkul ke-" + a + ": " + pilihanMatkulMahasiswa[a];
                    System.out.println(matkulInfo);
                    writer.write(matkulInfo);
                    writer.newLine();
                }
            }
            System.out.println("Daftar matkul telah ditambahkan dengan matkul pilihan ke dalam file kartu rencana studi.txt");
             
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis file.");
            e.printStackTrace();
        }
    }
}