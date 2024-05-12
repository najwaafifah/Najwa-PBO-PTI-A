package praktikum.Tugas_8;

public class Manager extends Karyawan{
    private double bonus;
    
    public Manager(String nama, double gaji, double bonus) {
        super(nama, gaji);
        this.bonus = bonus;
    }
    
    @Override
    public double cekPenghasilan() {
        return super.getGaji() + bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
