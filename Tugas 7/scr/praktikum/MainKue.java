package scr.praktikum;

public class MainKue {
    static Kue[] listKue = new Kue[20];

    public static void main(String[] args) {
    inisialisasiKue();

    for (Kue cetakKue : listKue) {
    System.out.println("Tipe kue: " + cetakKue.getClass().getSimpleName() + "\t" + cetakKue);
    }

    int hargaTotalSemuaKue = 0;
    int hargaTotalKueJadi = 0;
    int hargaTotalKuePesanan = 0;

    int totalBeratKuePesanan = 0;
    int totalJumlahKueJadi = 0;

    for (Kue kue : listKue) {
    hargaTotalSemuaKue += kue.getHarga();

        if (kue instanceof KueJadi) {
            hargaTotalKueJadi += kue.getHarga();
            totalJumlahKueJadi += ((KueJadi)kue).getJumlah();
        } else if (kue instanceof KuePesanan) {
            hargaTotalKuePesanan += kue.getHarga();
            totalBeratKuePesanan += ((KuePesanan)kue).getBerat();
        }
    }

    System.out.println("\nHarga total semua kue :" + hargaTotalSemuaKue);
    System.out.println("Harga total kueJadi : " + hargaTotalKueJadi);
    System.out.println("Harga total kuePesanan : " + hargaTotalKuePesanan);

    System.out.println("Total berat kuePesanan : " + totalBeratKuePesanan);
    System.out.println("Total jumlah kueJadi : " + totalJumlahKueJadi);

    Kue kueTermahal = cekHargaTertinggi();
    System.out.println("\nKue Termahal : " + kueTermahal);
}

    static Kue cekHargaTertinggi() {
        Kue kueTermahal = null;
        double hargaTerbesar = 0;

        for (Kue kue : listKue) {
            double hargaKue = kue.getHarga();
            // Check if the current cake has a higher price than the previous highest
            if (hargaKue > hargaTerbesar) {
                hargaTerbesar = hargaKue;
                kueTermahal = kue;
            }
        }
        return kueTermahal;
    }

    static void inisialisasiKue() {
        listKue[0] = new KueJadi("brownies", 2000,1);
        listKue[1] = new KueJadi("red velvet", 3600,1);
        listKue[2] = new KueJadi("chocolate cake",5000, 2);
        listKue[3] = new KueJadi("cheesecake", 4200,1);
        listKue[4] = new KueJadi("carrot cake", 3800,1);
        listKue[5] = new KueJadi("tiramisu", 4500,1);
        listKue[6] = new KueJadi("black forest",4000, 2);
        listKue[7] = new KueJadi("strawberry shortcake", 4800, 1);
        listKue[8] = new KueJadi("blueberry muffin",3200, 1);
        listKue[9] = new KueJadi("lemon pound cake",3500, 2);
        listKue[10] = new KuePesanan("coffee cake",3800, 100);
        listKue[11] = new KuePesanan("banana bread",3000, 100);
        listKue[12] = new KuePesanan("apple pie",4200, 100);
        listKue[13] = new KuePesanan("cinnamon roll",2800, 100);
        listKue[14] = new KuePesanan("croissant",2500, 100);
        listKue[15] = new KuePesanan("danish pastry",3000, 100);
        listKue[16] = new KuePesanan("eclair", 3200,100);
        listKue[17] = new KuePesanan("fruit tart",4500, 100);
        listKue[18] = new KuePesanan("honey cake",4000, 100);
        listKue[19] = new KuePesanan("mousse cake",4800, 100);
    }
}