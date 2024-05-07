package scr.praktikum;

public class KueJadi extends Kue {
    double jumlah;

    public KueJadi (String nama, double harga, double jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;

    }

    @Override

    public double hitungHarga() {
        return harga * jumlah * 2; //harga dikali jumlah dan dua

    }

    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah (double jumlah) {
        this.jumlah = jumlah;
    }
}
