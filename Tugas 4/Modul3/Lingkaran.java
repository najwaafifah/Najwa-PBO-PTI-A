package Modul3;

public class Lingkaran {
    int alas, tinggi; 

    public Lingkaran1(int alas) {
        this.alas = alas;
    }
    
    public lingkaran(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getAlas() {
        return alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public double hitungLuas() {
        double hasil = (double) (getTinggi() * getAlas())/2;
        return hasil;
    }

    public Lingkaran(int tinggi) {
        this.tinggi = tinggi;
    }

    public Lingkaran(String alas, String tinggi) {
        convertStringtoInt(alas, tinggi);
    }
 	
    private void convertStringtoInt(String alas, String tinggi) {
        this.alas = Integer.parseInt(alas);
        this.tinggi = Integer.parseInt(tinggi);
    }
        
}



