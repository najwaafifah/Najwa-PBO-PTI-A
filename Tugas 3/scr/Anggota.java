public class Anggota {
    private String namaAnggota;
    private int idAnggota;
    private Buku bukuDipinjam;

    public Anggota(String namaAnggota, int idAnggota, Buku buku) {
        this.namaAnggota = namaAnggota;
        this.idAnggota = idAnggota;
    }

    public Anggota(String string, int i, String string2, String string3, String string4) {
        //TODO Auto-generated constructor stub
    }

    public Anggota(String string, int i) {
        //TODO Auto-generated constructor stub
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

    public void tampilkanBukuDipinjam(Buku buku) {
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


