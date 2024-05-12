package praktikum.Tugas_8;

public class Karyawan {
    private String nama;
    private double gaji;
    
    public Karyawan(String nama, double gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }
    
    public double cekPenghasilan() {
        return gaji;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    } 
}
