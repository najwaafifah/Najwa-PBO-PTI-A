package scr.praktikum;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tanggalMasuk;
    private int jumlahAnak;
    
    public Pekerja() {}
    
    public Pekerja(double gaji, int tahunMasuk, int bulanMasuk, int tanggalMasuk, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah){
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tanggalMasuk = LocalDate.of(tahunMasuk, bulanMasuk, tanggalMasuk);
        this.jumlahAnak = jumlahAnak;
    }
    
    public double getBonus() {
        double bonus = 0;
        // Tanggal sekarang dr library LocalDate
        LocalDate tanggalSekarang = LocalDate.now();

        // selisih tahun tanggalInput dan tanggalSekarang, dr library ChronoUnit
        long selisihTahun = ChronoUnit.YEARS.between(tanggalMasuk, tanggalSekarang);
        
        if (selisihTahun >= 0 && selisihTahun < 5) {
            bonus += 0.05 * getGaji(); // Bonus 5% dari gaji jika bekerja 0 - 5 tahun
        } else if (selisihTahun >= 5 && selisihTahun < 10) {
            bonus += 0.10 * getGaji(); // Bonus 10% dari gaji jika bekerja 5 - 10 tahun
        } else if (selisihTahun >= 10) {
            bonus += 0.15 * getGaji(); // Bonus 15% dari gaji jika bekerja lebih dari 10 tahun
        }
        
        return bonus;
    }
    
    public double getGaji() {
        return gaji;
    }
    
    public double getTunjangan() {
        return super.getTunjangan() + (jumlahAnak * 20);
    }
    
    public double getPendapatan() {
        return getGaji() + getBonus() + getTunjangan();
    }
    
    public String toString() {
        return super.toString() +
                "\nTanggal masuk : " + getTanggalMasuk() +
                "\nJumlah anak : " + getJumlahAnak() +
                "\nGaji : " + getGaji();
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public LocalDate getTanggalMasuk() {
        return tanggalMasuk;
    }

    public void setTahunMasuk(LocalDate tanggalMasuk) {
        this.tanggalMasuk = tanggalMasuk;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }
}

