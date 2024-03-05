import java.util.Scanner;
public class MainMobil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Aplikasi pengisian data mobil\nSet manufaktur mobil anda :");
       
        Mobil m1 = new Mobil();
        m1.setManufaktur(input.nextLine());
        
        System.out.print("Set no plat mobil anda : ");
        m1.setNoPlat(input.nextLine());
        
        System.out.print("Set warna mobil anda : "); 
        m1.setWarna(input.nextLine());
        
        System.out.print("Set kecepatan mobil anda : ");
        m1.setKecepatan(input.nextInt());
        input.nextLine();
        
        System.out.println("Tentukan waktu perjalanan dalam jam : "); //no 8
        m1.setWaktu(input.nextDouble());
        input.nextLine();
        
        System.out.println("\nDetail mobil anda :");
        m1.displayMessage();
        System.out.println("================");
        
        System.out.println("Ada yang ingin diubah? (Y/N)");
        String konfirmasi = input.nextLine().toUpperCase();
        
        if (konfirmasi.contains("Y")) {
            System.out.println("1. Manufaktur\n2. No Plat\n3. Warna\n4. Kecepatan");
            int pilihan = input.nextInt();
            input.nextLine();
            switch (pilihan) {
                case 1 :
                    System.out.print("Set manufaktur mobil anda : ");
                    m1.setManufaktur(input.nextLine());
                    break;
                case 2 :                
                    System.out.print("Set no plat mobil anda : ");
                    m1.setNoPlat(input.nextLine());
                    break;
                case 3 :
                    System.out.print("Set warna mobil anda : ");
                    m1.setWarna(input.nextLine());
                    input.nextLine();
                    break;
                case 4 :
                    System.out.print("Set kecepatan mobil anda : ");
                    m1.setKecepatan(input.nextInt());
                    break;
                case 5 :
                    System.out.print("Set waktu perjalanan anda : "); //no 4-8
                    m1.setWaktu(input.nextDouble());
                    break;
                default :
                    System.out.println("Pilihan tidak sesuai");
            }
            System.out.println("\nDetail mobil anda yang sudah dirubah :");
            m1.displayMessage();
        }
        
        }
    }
    