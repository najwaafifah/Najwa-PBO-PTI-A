

public class MainStudent {
    public static void main(String[] args) {
        Student anna = new Student();
        anna.getNama("Anna");
        anna.setAddress("Malang");
        anna.setAge(20);
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
    }
}
