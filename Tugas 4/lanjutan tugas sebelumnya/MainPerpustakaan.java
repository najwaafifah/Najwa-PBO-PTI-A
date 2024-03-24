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

        Anggota anggota1 = new Anggota("irul", 1001);
        System.out.println("Objek Anggota 1 : ");
        System.out.println("Nama : " + anggota1.getNamaAnggota());
        System.out.println("ID : " + anggota1.getIdAnggota());
        System.out.println();

        Anggota anggota2 = new Anggota("yati", 1002, "dilan", "dilan susanto", "45846-7675-87695-98");
        System.out.println("Objek Anggota 2 : " + anggota2.getNamaAnggota());
        System.out.println("ID : " + anggota2.getIdAnggota());
        anggota2.tampilkanBukuDipinjam(buku);
        System.out.println();

        Buku buku2 = new Buku("the da vinci code", "dan brown", "65-794759-79576");
        Anggota anggota3 = new Anggota("michael", 1003, buku);
        System.out.println("objek anggota 3 : ");
        System.out.println("Nama : " + anggota3.getNamaAnggota());
        System.out.println("ID : " + anggota3.getIdAnggota());
        anggota3.tampilkanBukuDipinjam(buku);
    }
}


