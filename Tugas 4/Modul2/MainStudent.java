package Modul2;

public class MainStudent {
    public static void main(String[] args) {
        Student anna = new Student("anna", "malang", 20);
        // anna.setNama("Anna");
        // anna.setAddress("Malang");
        // anna.setAge(20);
        anna.setMath(100);
        anna.setScience(89);
        anna.setEnglish(80);
        anna.displayMessage();

        System.out.println("----------------");
        Student chris = new Student("chris", "kediri", 21);
        chris.setMath(70);
        chris.setScience(60);
        chris.setEnglish(90);
        chris.displayMessage();

        // nomer 2
        System.out.println("----------------");
        Student bagas = new Student(0, "bagas", "bogor", 21, 50, 60, 90);
        bagas.displayMessage();

        // nomer 3
        System.out.println("----------------");
        Student abdul = new Student(0, "abdul", "jekardtah", 21, 50, 99, 100);
        abdul.displayMessage();
    }
}
