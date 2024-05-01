package scr.praktikum;

public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;
    
    public MahasiswaFILKOM(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }
    
    public String getStatus() {
        int tahunAngkatan = 2000 + Integer.parseInt(nim.substring(0,2));
        String jurusan = "";
        
        switch (Integer.parseInt(nim.substring(6, 7))) {
            case 2:
                jurusan = "Teknik Informatika";
                break;
            case 3:
                jurusan = "Teknik Komputer";
                break;
            case 4:
                jurusan = "Sistem Informasi";
                break;
            case 6:
                jurusan = "Pendidikan Teknologi Informasi";
                break;
            case 7:
                jurusan = "Teknologi Informasi";
                break;
            default:
                jurusan = "Tidak tersedia";
        }
        
        return jurusan + ", " + tahunAngkatan;
    }
    
    public String toString() {              
        return super.toString() + 
                "\nNIM : " + getNim() +
                "\nIPK : " + getIpk() +
                "\nStatus : " + getStatus();
    }
     
    public double getBeasiswa() {
        return getPendapatan();
    }
    
    public double getPendapatan() {
        double beasiswa = 0;
        if (ipk >= 3.0 && ipk < 3.5) {
            beasiswa += 50;
        } else if (ipk >= 3.5 && ipk <= 4.0) {
            beasiswa += 75;
        }
        return getTunjangan() + beasiswa;
    }
    
    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public double getIpk() {
        return ipk;
    }
}
