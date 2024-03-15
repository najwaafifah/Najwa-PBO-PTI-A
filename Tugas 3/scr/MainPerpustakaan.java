import java.util.Scanner;

public class MainPerpustakaan {
    static String namaAnggota, namaPetugas, judulBuku, pengarang, isbn;
    static int idAnggota, idPetugas, levelAkses;


    public static void inputDataPerpus() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Anggota: ");
        namaAnggota = input.nextLine();
        
        System.out.print("Masukkan Nama Petugas: ");
        namaPetugas = input.nextLine();

        System.out.print("Masukkan Judul Buku: ");
        judulBuku = input.nextLine();

        System.out.print("Masukkan Nama Pengarang: ");
        pengarang = input.nextLine();

        System.out.print("Masukkan isbn: ");
        isbn = input.nextLine();
    }

    public static void main(String[] args) {

        inputDataPerpus();

        Anggota anggota = new Anggota(namaAnggota, 30);
        Petugas petugas = new Petugas(namaPetugas, 12, 1);
        Buku buku = new Buku(judulBuku, pengarang, isbn);

        petugas.tambahBuku(buku);
        anggota.pinjamBuku(buku);
        petugas.verifikasiPeminjaman(anggota, buku);
        anggota.tampilkanBukuDipinjam(buku);
    }
}


