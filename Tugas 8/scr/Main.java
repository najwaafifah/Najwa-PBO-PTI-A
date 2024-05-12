package scr.Tugas_8;

public class Main {
    public static void main(String[] args) {
        //casting
        //double angka = 5.4;
        //int angka_int = (int)angka;
        //System.out.println(angka_int);

        //Object dengan class HeroIntel
        HeroIntel hero1 = new HeroIntel("Siti",100);
        hero1.display();

        //upcasting
        Hero heroUp = (Hero)hero1;
        heroUp.display();
        //System.out.println(heroUp.getType()); //ini error

        //downcasting
        HeroIntel hero2 = (HeroIntel) heroUp;
        hero2.display(); //ini berhasil downcasting
        
//        HeroAgility hero3 = (HeroAgility) heroUp;
//        hero3.display();

//        heroUp.type = "mage";
//        ini memang buat jadi error
        hero1.type = "warrior";
        System.out.println(hero2.type);
        
        HeroMagic heroMagic = new HeroMagic("sage", 80);
        Hero heroMagicUp = (Hero) heroMagic; //upcast
        HeroMagic heroMagicDown = (HeroMagic) heroMagicUp; //downcast
    }
}

