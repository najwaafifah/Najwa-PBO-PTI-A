package scr.praktikum;

public class MainManusia {
public static void main(String[] args) {
    Manusia budi = new Manusia("budi santoso",  "111", true, true);
    System.out.println(budi + "\n");
    
    Manusia valo = new Manusia("valo", "112", false, true);
    System.out.println(valo + "\n");
    
    Manusia faiza = new Manusia("faiza", "113", false, false);
    System.out.println(faiza + "\n");
    
    
    MahasiswaFILKOM sepuh = new MahasiswaFILKOM("195150201111002", 2.8, "sesepuh", "213", false, false);
    System.out.println(sepuh + "\n");
    System.out.println("");
    
    MahasiswaFILKOM wawa = new MahasiswaFILKOM("235150401111032", 3.4, "wawa", "212", true, false);
    System.out.println(wawa + "\n");
    
    MahasiswaFILKOM mirza = new MahasiswaFILKOM("235150601111001", 3.6, "mio mirza", "211", true, false);
    System.out.println(mirza + "\n");
    
    
    Pekerja frontend = new Pekerja(1000, 2022, 3, 2, 2, "kurnia div", "313", false, true);
    System.out.println(frontend + "\n");
    
    Pekerja desainer = new Pekerja(1000, 2015, 10, 5, 0, "dani revisi", "314", true, false);
    System.out.println(desainer + "\n");
    
    Pekerja jaringan = new Pekerja(2000, 2004, 1, 20, 10, "koni router", "315", true, true);
    System.out.println(jaringan + "\n");
    
    Manager hrd = new Manager("Ha er de", 7500, 2009, 2, 14, 0, "sepuh hrd", "411", true, false);
    System.out.println(hrd + "\n");
}
}
