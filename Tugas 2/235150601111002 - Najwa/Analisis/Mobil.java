public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    private double waktu; //no 4
    private double waktuSekon; //no 5
    private double kecepatanMs; //no 6
   
    
    public void setNoPlat(String s){
        noPlat = s;
    }
    
    public void setWarna(String s){
        warna = s;
    }
    
    public void setManufaktur(String s){
        manufaktur = s;
    }
    
    public void setKecepatan(int i){
        kecepatan = i;
        rubahKecepatan(i); //no 6
    }
    
    public void setWaktu(double d) { //no 4
        waktu = d;
        rubahKeSekon(d); //no 5
    }
    
    private void rubahKeSekon(double d) { //no 5, private karna cm bisa diakses di class Mobil
        waktuSekon = d * 3600.0;
    }
    
    private void rubahKecepatan(double i) { //no 6, , private karna cm bisa diakses di class Mobil
        kecepatanMs = kecepatan * 1000.0 / 3600.0;
    }
    
    public double hitungJarak() { //no 7
        return (kecepatanMs * waktuSekon) / 1000.0; //ubah ke kilometer, no 8
    }
    
    public void displayMessage(){
        System.out.println("Mobil anda adalah bermerek "+manufaktur);
        System.out.println("mempunyai nomor plat "+noPlat);
        System.out.println("serta memililki warna "+warna);
        System.out.println("dan mampu menempuh kecepatan "+kecepatan);
        System.out.println("Dengan waktu " + waktu + " jam, dapat menempuh jarak " + hitungJarak() + " kilometer"); //modifikasi dr no 4-8
        //hitungJarak() dipanggil langsung di sout biar enak
    }
}
