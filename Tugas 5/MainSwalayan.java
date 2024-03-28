import java.util.Scanner;

public class MainSwalayan {
    public static void main(String[] args) {
        Pelanggan plgn = new Pelanggan();
        
        System.out.println("Najwa Afifah\n235150601111002");
        while(true) {
            switch(pilihan()) {
                case 1 :
                    plgn.beli();
                    break;
                case 2 :
                    plgn.topup();
                    break;
                case 3 :
                    System.exit(0);
                default :
                    System.out.println("Pilihan tidak tersedia");
            }
        }
    }
    
    static int pilihan() {
        Scanner input = new Scanner(System.in);
   
        System.out.println("\nSwalayan lol :\n1. Beli\n2. Topup\n3. Keluar");
        int pilihan = input.nextInt();
        input.nextLine();
        return pilihan;
    }
}
