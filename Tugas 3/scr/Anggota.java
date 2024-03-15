public class Anggota {
    private String namaAnggota;
    private int idAnggota;
    private Buku bukuDipinjam;

    public Anggota(String namaAnggota, int idAnggota) {
        this.namaAnggota = namaAnggota;
        this.idAnggota = idAnggota;
    }

    public void pinjamBuku(Buku buku) {
        if (buku.getStatusPinjam() == false) {
            System.out.println("\nMengecek status buku...");
            System.out.println("Buku dapat dipinjam");
            System.out.println("Verifikasi dahulu ke petugas perpustakan!\n");
        } else {
            System.out.println("Buku sedang dipinjam orang lain");
        }
    }

    public void kembalikanBuku(Buku buku) {
        buku.kembalikanBuku(); //set statusPinjam ke false
    }

    public void tampilkanBukuDipinjam(Buku bukuDipinjam) {
        System.out.println("\nBuku yang kamu pinjam :");
        bukuDipinjam.cetakInfoBuku();
        System.out.println("\nYey kamu telah berhasil meminjam buku!");
    }
    
    public String getNamaAnggota() {
        return namaAnggota;
    }
    
    public int getIdAnggota() {
        return idAnggota;
    }

}


