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

    public void tambahBuku(Buku buku) {
        System.out.println("Informasi buku :");
        buku.cetakInfoBuku();
        System.out.println("Buku berhasil ditambahkan");
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
