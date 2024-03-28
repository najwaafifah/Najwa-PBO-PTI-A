import java.util.Scanner;

public class Autentikasi {
    private int id;
    private String noPel;
    private int pin;
    private int percobaan = 3;
    
    public Autentikasi(int id, String noPel, int pin) {
        this.id = id;
        this.noPel = noPel;
        this.pin = pin;
    }
    
    void verifikasi() {
        Scanner input = new Scanner(System.in);
        while (percobaan > 0) {
            System.out.print("PIN : ");
            int pin = input.nextInt();
            input.nextLine();
            
            if (this.pin == pin) {
                System.out.println("Pin benar");
                break;
            } else {
                percobaan--;
                System.out.println("Tersisa " + percobaan + " percobaan");
            }
        }
        
        if (percobaan == 0) {
            Pelanggan.setBlokir(id); //tidak perlu instansi objek, karna setBlokir STATIC
        }
    }
}