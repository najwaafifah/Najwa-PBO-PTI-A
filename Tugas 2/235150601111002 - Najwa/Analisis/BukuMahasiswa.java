public class BukuMahasiswa {
    private static double lembar;
    private static double halaman;
    
    public void setLembar(double i) {
        lembar = i;
    }
    
    public double hitungHalaman() {
        return halaman = 2 * lembar;
    }
    
}