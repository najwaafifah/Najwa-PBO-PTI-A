public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int counter;

public Student(int id, String n, String a, int ag, double mg, double eg, double sg) {
    counter++;
    name = n;
    address = a;
    age = ag;
    mathGrade = mg;
    englishGrade = eg;
    scienceGrade = sg;
}

public void jumlahObjek() {
    System.out.println("Jumlah objek yang dibuat : " + counter);
}
    
public Student(String n, String a, int ag){
    name = n;
    address = a;
    age = ag;
}
    
public Student() {
    name = "";
    address = "";
    age = 0;
}
    
public void setName(String n){
    name = n;
}
    
public void setAddress(String a){
    address = a;
}
    
public void setAge(int ag){
    age = ag;
}
    
public void setMath(int math){
    mathGrade = math;
}
    
public void setEnglish(int english){
    englishGrade = english;
}
    
public void setScience(int science){
    scienceGrade = science;
}
    
private double getAverage(){
    average = (mathGrade+scienceGrade+englishGrade)/3;
    return average;
}
    
private boolean statusAkhir() {
    return average >= 61;
}

    

public void displayMessage(){
    System.out.println("\nSiswa dengan nama"+name);
    System.out.println("beralamat di "+address);
    System.out.println("berumur "+age);
    System.out.println("mempunyai nilai rata rata"+ getAverage());
    System.out.println("Apakah " + name + "dinyatakan lulus? " + statusAkhir());
}
}