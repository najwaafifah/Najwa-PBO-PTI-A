package Modul3;

public class MainLingkaran {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(3);
        l.setTinggi(10);
        l.displayMessage();

        Lingkaran l2 = new Lingkaran(4, 10);
        l2.displayMessage();

        Lingkaran lstring = new Lingkaran("5", "20");
        lstring.displayMessage();
    }
}