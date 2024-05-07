package scr;
import java.time.LocalDate;

public abstract class Employee {
    private String name;
    private String noKTP;
    private LocalDate tanggalLahir;
    
    public Employee(){}
    
    public Employee(String name, String noKTP){
        this.name = name;
        this.noKTP = noKTP;
    }
    
    public Employee(String name, String noKTP, int tahun, int bulan, int tanggal){
        this.name = name;
        this.noKTP = noKTP;
        tanggalLahir = LocalDate.of(tahun,bulan ,tanggal);
    }
    
    public String getName(){
        return name;
    }
    
    public String getNoKTP(){
        return noKTP;
    }
    
    public String toString(){
        return String.format(" "+getName()+"\nNo. KTP :"+getNoKTP());
    }
    
    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    
    public abstract double earnings();//pendapatan
    public abstract double hitungBonus();
//    public abstract double earningsBarang();
}
