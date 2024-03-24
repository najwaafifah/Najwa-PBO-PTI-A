import java.util.Scanner;

public class Petugas {
    private String namaPetugas;
    private int idPetugas;
    private int levelAkses;

    public Petugas(String namaPetugas, int idPetugas, int levelAkses) {
        this.namaPetugas = namaPetugas;
        this.idPetugas = idPetugas;
        this.levelAkses = levelAkses;
    }
    //tambahan
    public void tambahBuku(Buku buku) {
        System.out.println("Informasi buku :");
        buku.cetakInfoBuku();
        System.out.println("Buku berhasil ditambahkan");
    }

    public void tambahBuku(String judul, String pengarang, String isbn) {
        Buku buku = new Buku(judul, pengarang, isbn);
        tambahBuku(buku);
    }

    public void tambahBuku(String judul, String pengarang, String isbn, boolean statusPinjam) {
        Buku buku = new Buku(judul, pengarang, isbn);
        buku.setStatusPinjam(statusPinjam);
        tambahBuku(buku);
    }
    public void hapusBuku(Buku buku) {
        // Implementasi penghapusan buku
    }

    public void verifikasiPeminjaman(Anggota anggota, Buku buku) {
        Scanner input = new Scanner(System.in);
        System.out.println("====================================================");
        System.out.println("Selamat datang ke verifikasi peminjaman oleh petugas");
        System.out.println("====================================================\n");
        System.out.println("Nama anggota : " + anggota.getNamaAnggota());
        System.out.println("ID anggota : " + anggota.getIdAnggota());
        System.out.println("Tekan 1 untuk konfirmasi peminjaman");
        if (input.nextLine().equals("1")) {
            System.out.println("\n======================");
            System.out.println("Buku berhasil dipinjam");
            System.out.println("=======================");
            buku.pinjamBuku(); // set statusPinjam ke true
        } else {
            System.out.println("Input tidak sesuai, batal peminjaman");
        }
    }

}
