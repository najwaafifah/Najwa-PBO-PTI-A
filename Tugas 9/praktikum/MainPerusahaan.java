public class MainPerusahaan {
    public static void main(String[] args) {
        Employee billie = new Employee(800, "billie", 1000);
        Employee eilish = new Employee(700, "eilish", 1200);
        
        billie.addInvoice(new Invoice("aoka", 2, 100));
        billie.addInvoice(new Invoice("club", 10, 2));
        
        eilish.addInvoice(new Invoice("sirupp", 50, 1));
        eilish.addInvoice(new Invoice("es jeruq", 40, 2));     
        eilish.addInvoice(new Invoice("sotoo", 4, 3));     
        
        System.out.println(billie);
        billie.cetakInvoices();
        
        System.out.println(eilish);
        eilish.cetakInvoices();
    }
}

