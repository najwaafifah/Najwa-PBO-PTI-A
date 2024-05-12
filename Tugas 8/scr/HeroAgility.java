package scr.Tugas_8;

public class HeroAgility extends Hero {
    public String type;

    public HeroAgility(String name, double health){
        super(name, health);
        this.type = "Intel";
    }

    public void display(){
        System.out.println(this.getName() + " is a " + this.type + " Hero.");
    }
}
