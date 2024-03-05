public class PropertiBuku {
    private String namaBuku;
    private int tahun;
    private String penulis1;
    private String penulis2;
    
    
    public void cetakInfoBuku(String namaBuku, String penulis1, String penulis2, int tahun) { 
        System.out.println("Judul\t  : " + namaBuku);
        System.out.println("Penulis 1 : " + penulis1);
        System.out.println("Penulis 2 : " + penulis2);
        System.out.println("Tahun\t  : " + tahun);
        System.out.println("");
    }
}