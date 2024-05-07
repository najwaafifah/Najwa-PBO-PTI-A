package scr.praktikum;

public class KuePesanan extends Kue {
    double berat;

    public KuePesanan(String nama, double harga, double berat) {
        super(nama, harga);
        this.berat = berat;

    }

    @Override

    public double hitungHarga() {
        return harga * berat;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat (double berat) {
        this.berat = berat;
    }
}
