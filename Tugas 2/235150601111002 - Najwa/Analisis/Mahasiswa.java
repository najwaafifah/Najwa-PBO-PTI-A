public class Mahasiswa {
    private double jumlahHari;
    private String nama;
    private double kecepatanHalaman;
    
    public void setNama(String s) {
        nama = s;
    }
    
    public void showNama() {
        System.out.println(nama);
    }
    
    public void setKecepatanKata(double kecepatanKata) {
        kecepatanHalaman = kecepatanKata / 200.0;
    }

    public void hitungDanShowJumlahHari() {
        BukuMahasiswa buku = new BukuMahasiswa();
        
        double halaman = buku.hitungHalaman();
        jumlahHari = halaman / kecepatanHalaman;
        System.out.println("Jumlah hari : " + jumlahHari);
    }

}
