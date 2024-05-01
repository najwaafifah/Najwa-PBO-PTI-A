package scr.praktikum;

public class Manager extends Pekerja {
    private String departemen;
    
    public Manager() {}
    
    public Manager(String departemen, int gaji, int tahunMasuk, int bulanMasuk, int tanggalMasuk, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(gaji, tahunMasuk, bulanMasuk, tanggalMasuk, jumlahAnak, nama, nik, jenisKelamin, menikah);
        this.departemen = departemen;
    }
    
    public double getPendapatan() {
        return super.getPendapatan() + (super.getGaji() * 0.1);
    }
    
    public String toString() {
        return super.toString() +
                "\nDepartemen : " + getDepartemen();
    }
    
    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }
    
    public String getDepartemen() {
        return departemen;
    }
}
