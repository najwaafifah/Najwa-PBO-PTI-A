package scr.praktikum;

public class Manusia {
    private String nama;
    private boolean jenisKelamin;
    private String jenisKelaminString;
    private String nik;
    private boolean menikah;
    
    public Manusia() {}
   
    public Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.jenisKelaminString = jenisKelamin ? "Laki-laki" : "Perempuan";
        this.menikah = menikah;
    }
    
    public double getTunjangan() {
        if (menikah) {
            return jenisKelamin ? 25 : 20;
        } else {
            return 15;
        }
    }
    
    public double getPendapatan() {
        return getTunjangan();
    }
    
    public String toString() {
        String biodata = "Nama: " + getNama() + "\nNIK: " + getNik() + "\nJenis kelamin: " + getJenisKelaminString() + "\nPendapatan : " + getPendapatan();
        return biodata;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    
    public boolean getJenisKelamin() {
        return jenisKelamin;
    }
    
    public String getJenisKelaminString() {
        return jenisKelaminString;
    }
    
    public void setNik(String nik) {
        this.nik = nik;
    }
    
    public String getNik() {
        return nik;
    }
    
    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }
    
    public boolean isMenikah() {
        return menikah;
    }
}

