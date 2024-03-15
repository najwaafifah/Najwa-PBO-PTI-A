

public class Student {
    private String nama;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double everage;

    public Student() {
        nama = "wawa";
        address = "zxc";
        age = 0;
    }

    public Student (String n, String a, int ag) {
        nama = n;
        address = a;
        age = ag;
    }

    public void setNama (String n) {
        nama = n;
    }

    public void setAddress (String a) {
        address = a;
    }

    public void setAge (int ag) {
        age = ag;
    }

    public void setMath (int math) {
        mathGrade = math;
    }

    public void setEnglish ( int english) {
        englishGrade = english;
    }

    public void setScience (int science) {
        scienceGrade = science;
    }

    private double getAverage () {
        double result = 0;
        result = (mathGrade + scienceGrade + englishGrade/3);
        return result;
    }

    public void displayMessage() {
        System.out.println("Siswa dengan nama : " + nama);
        System.out.println("Beralamat di " + address);
        System.out.println("berumur " + age);
        System.out.println("mempunyai nilai rata rata " + getAverage());
    }
}
