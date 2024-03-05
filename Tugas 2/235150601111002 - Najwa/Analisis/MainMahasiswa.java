public class MainMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        BukuMahasiswa buku = new BukuMahasiswa();
    
        mahasiswa.setNama("A");
        buku.setLembar(50);
        mahasiswa.setKecepatanKata(100);
        
        mahasiswa.showNama();
        mahasiswa.hitungDanShowJumlahHari();
    }
    
}