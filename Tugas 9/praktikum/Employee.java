public class Employee implements Payable{
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;
    private int numOfInvoices;
    
    public Employee(int registrationNumber, String name, int salaryPerMonth) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = new Invoice[100];
    }
    
    @Override
    public int getPayableAmount() {
        int totalAmount = 0;
        if (invoices != null) {
            for (Invoice invoice : invoices) {
                if (invoice != null) {
                    totalAmount += invoice.getPayableAmount();
                }
            }
        }
        return totalAmount;
    }
    
    public String toString() {
        return "Nama : " + name + 
                "\nNomor Regis : " + registrationNumber + 
                "\nGaji/Bulan : " + salaryPerMonth;
    }
    
    public void cetakInvoices() {
        if (invoices != null) {
            System.out.println("\nInvoices untuk karyawan : " + name);
            for (Invoice invoice : invoices) {
                if (invoice != null) {
                    System.out.println(invoice + "\n");
                } 
            }
            
            System.out.println("Total belanja : " + getPayableAmount());
            System.out.println("Gaji setelah dipotong total belanja " + (salaryPerMonth - getPayableAmount()) + "\n");
        }
    }
    
    public void addInvoice(Invoice invoices) {
        if (numOfInvoices < this.invoices.length) {
            this.invoices[numOfInvoices] = invoices;
            numOfInvoices++;
        } else {
            System.out.println("Daftar invoices sudah penuh");
        }
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public void setSalaryPerMonth(int salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

    public Invoice[] getInvoices() {
        return invoices;
    }
    
}
