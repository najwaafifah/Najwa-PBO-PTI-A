package scr;

public class SalariedEmployee extends Employee {
    private double weeklySalary; //gaji/minggu
    
    public SalariedEmployee(String name, String noKTP, double salary) {
        super(name, noKTP);
        setWeeklySalary(salary);
    }
    
    public SalariedEmployee(String name, String noKTP, int tahun, int bulan, int tanggal, double salary) {
        super(name, noKTP, tahun, bulan, tanggal);
        setWeeklySalary(salary);
    }
    
    public void setWeeklySalary(double salary) {
        weeklySalary = salary;
    }
    
    public double getWeeklySalary() {
        return weeklySalary;
    }
    
    public double earnings() {
        return getWeeklySalary();
    }
    
    public double hitungBonus() {
        return earnings() * 0.1;
    }
    
    public String toString() {
        return String.format("Salaried employee: " + super.toString() + "\nweekly salary:" + getWeeklySalary());
    }
}

