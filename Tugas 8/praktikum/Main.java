public class Main {

    public static void main(String[] args) {

            PegawaiTetap pT1 = new PegawaiTetap("Amka", "2109876543234567890101", 5000000);
            PegawaiTetap pT2 = new PegawaiTetap("Zaza", "2109876543234567890102", 3500000);
            PegawaiTetap pT3 = new PegawaiTetap("Dina", "2109876543234567890103", 4000000);
            PegawaiTetap pT4 = new PegawaiTetap("Anggy", "2109876543234567890104", 4500000);
            System.out.println(pT1.toString());
            System.out.println(pT2.toString());
            System.out.println(pT3.toString());
            System.out.println(pT4.toString());

            PegawaiHarian pH1 = new PegawaiHarian("Atana", "2109876543234567890110", 5000, 46);
            PegawaiHarian pH2 = new PegawaiHarian("Desty", "2109876543234567890111", 6000, 30);
            PegawaiHarian pH3 = new PegawaiHarian("Ghina", "2109876543234567890112", 5500, 28);
            PegawaiHarian pH4 = new PegawaiHarian("auladini", "2109876543234567890113", 6000, 35);
            System.out.println(pH1.toString());
            System.out.println(pH2.toString());
            System.out.println(pH3.toString());
            System.out.println(pH4.toString());

            Sales sL1 = new Sales("Iqbaal Ramadhan", "2109876543234567890120", 30, 50000);
            Sales sL2 = new Sales("Jefry nichol", "2109876543234567890121", 45, 60000);
            Sales sL3 = new Sales("Angga Yunanda", "2109876543234567890122", 50, 70000);
            Sales sL4 = new Sales("Reza Rahardian", "2109876543234567890122", 35, 50000);
            System.out.println(sL1.toString());
            System.out.println(sL2.toString());
            System.out.println(sL3.toString());
            System.out.println(sL4.toString());

            System.out.println("Nama : Najwa Afifah");
            System.out.println("NIM : 235150601111002");
        }
    }