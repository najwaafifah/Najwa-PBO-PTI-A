package scr;
import java.time.LocalDate;

public class MainEmployee {
    public static void main(String[] args) {
        //DENGAN penerapan tanggalMasuk
//        SalariedEmployee salariedEmployeeTL = new SalariedEmployee("Daniel", "135", 2005, 5, 10, 800.00);
//        HourlyEmployee hourlyEmployeeTL = new HourlyEmployee("Karina", "234",2008, 1, 15, 16.75, 40);
//        CommissionEmployee commissionEmployeeTL = new CommissionEmployee("Keanu", "145",2000, 4, 5, 10000, .06);
//        BasePlusCommissionEmployee basePlusCommissionEmployeeTL = new BasePlusCommissionEmployee("Bondan", "234", 5000, .04,  300);
//        
//        Employee[] employeesTanggalLahir = new Employee[4];
//        employeesTanggalLahir[0] = salariedEmployeeTL; //pada index 0, menyimpan instansi bernama salariedEmployee
//        employeesTanggalLahir[1] = hourlyEmployeeTL;
//        employeesTanggalLahir[2] = commissionEmployeeTL;
//        employeesTanggalLahir[3] = basePlusCommissionEmployeeTL;
//        
//        System.out.println("Employees dengan tanggal lahir diproses secara polimorfisme:\n");
//        
//        int bulanSekarang = LocalDate.now().getMonthValue();
//         
//        for (Employee currentEmployeeTL : employeesTanggalLahir) {
//            System.out.println(currentEmployeeTL);
//            
//            if (currentEmployeeTL instanceof BasePlusCommissionEmployee) {
//                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployeeTL;
//                employee.setBaseSalary(1.10 * employee.getBaseSalary());
//                System.out.println( "Gaji pokok setelah dinaikkan 10% : " + employee.getBaseSalary());
//            }
//            
//            if (currentEmployeeTL.getTanggalLahir() != null) {
//                int birthMonth = currentEmployeeTL.getTanggalLahir().getMonthValue();
//                
//                if (birthMonth == bulanSekarang) {
//                    double bonus = currentEmployeeTL.hitungBonus();
//                    System.out.println("Catatan : Bonus +$100 karena ulang tahun di bulan saat ini");
//                    System.out.printf("pendapatan: $%,.2f\n\n", (currentEmployeeTL.earnings() 
//                            + bonus));
//                    continue;
//                }
//            } 
//            System.out.printf("pendapatan: $%,.2f\n\n", currentEmployeeTL.earnings());
//         }
         
         
        
        //TANPA penerapan tanggalMasuk
        
        SalariedEmployee salariedEmployee = new SalariedEmployee("Daniel", "135", 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karina", "234", 16.75, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Keanu", "145", 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bondan", "234", 5000, .04,  300);
        Employee salariedEmployeeDaniel = new SalariedEmployee("Danies", "444", 500);
        
        //penambahan class itemEmployee dan instansi 4 objek tes :
        ItemEmployee itemEmployee = new ItemEmployee("bagus", "555", 500, 1.2);
        ItemEmployee IE_Bimo = new ItemEmployee("Bimo", "56467", 100, 10);
        ItemEmployee IE_Haedar = new ItemEmployee("Dafa", "789", 300, 3);
        ItemEmployee IE_Risman = new ItemEmployee("Risma", "675", 600, 1);
        
        
        Employee[] employees = new Employee[6];
        employees[0] = salariedEmployee; //pada index 0, menyimpan instansi bernama salariedEmployee
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        employees[4] = itemEmployee;
        employees[5] = salariedEmployeeDaniel;
//        employees[5] = IE_Bimo; 
//        employees[6] = IE_Haedar; 
//        employees[7] = IE_Risman;
        
        
        System.out.println("Employees diproses secara polimorfisme:\n");
         
        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);
            
            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf("Gaji pokok setelah dinaikkan 10%% : $%,.2f\n", employee.getBaseSalary());
            }
                
            System.out.printf("pendapatan: $%,.2f\n\n", currentEmployee.earnings());
         }
        
         for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d = %s\n", j, employees[j].getClass().getName());
         }
    }

}