package scr;
// import Polimorfisme_modif_barang.*;

public class ItemEmployee extends Employee {
    private int barangPerMinggu;
    private double upahPerBarang;
    
    
    public ItemEmployee(String name, String noKTP, int barangPerMinggu, double upahPerBarang) {
        super(name, noKTP);
        this.barangPerMinggu = barangPerMinggu;
        this.upahPerBarang = upahPerBarang;
    }
    
    public double earnings() { 
        return barangPerMinggu * upahPerBarang; 
    }
    
    public double hitungBonus() { 
        return earnings() * 0.1; 
    }
    
    public String toString(){
        return String.format("Item employee: "+super.toString() +"\nBarang per minggu: " + getBarangPerMinggu() + "\nUpah per Barang: " + getUpahPerBarang());
    }
    
     public int getBarangPerMinggu() {
        return barangPerMinggu;
    }

    public void setBarangPerMinggu(int barangPerMinggu) {
        this.barangPerMinggu = barangPerMinggu;
    }

    public double getUpahPerBarang() {
        return upahPerBarang;
    }

    public void setUpahPerBarang(int upahPerBarang) {
        this.upahPerBarang = upahPerBarang;
    }
}
