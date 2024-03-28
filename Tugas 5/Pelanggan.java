import java.util.Scanner;

public class Pelanggan {
    private static Scanner input = new Scanner(System.in);
    private static String[] listNomorPelanggan = {"3800000001", "5600000001", "7400000001", "3812345678", 
        "5612345678", "7412345678", "3843214567", "5632147890", "7465982134", "3856723412"};
    private static int[] listPin = {1234, 1234, 1234, 1234, 1234, 1234, 1234, 1234, 1234, 1234};
    private static int[] listJenisRekening = new int[10];
    private static int[] saldoTiapPelanggan = new int[10];
    private static boolean[] statusBlokir = new boolean[10];

    int verifikasiPelanggan(){
        System.out.print("Masukkan nomor pelanggan : ");
        String noPel = input.nextLine();
        boolean ditemukan = false;
        int id = 0;
        
        for (id = 0; id < listNomorPelanggan.length; id++) {
            if (listNomorPelanggan[id].equals(noPel)) {
                if (statusBlokir[id]) {
                    System.out.println("Pelanggan telah diblokir");
                    ditemukan = true;
                    return -1;
                }
                
                System.out.println("Nomor pelanggan ditemukan\n");
                Autentikasi auth = new Autentikasi(id, listNomorPelanggan[id], listPin[id]);
                
                auth.verifikasi();
                cekJenisRekening(id);
                ditemukan = true;
                break;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Nomor pelanggan tidak ditemukan");
            System.out.println("Kembali ke menu utama");
            return -1;
        }
        
        return id;
    }
    
    private void cekJenisRekening(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cekJenisRekening'");
    }

    void topup() {
        int id = verifikasiPelanggan();
        
        if(id != -1 && !statusBlokir[id]) {
            System.out.print("Masukkan jumlah topup : ");
            int tambahSaldo = input.nextInt();
            input.nextLine();
            System.out.println("");
            
            System.out.println("Tambah saldo : " + tambahSaldo);
            saldoTiapPelanggan[id] += tambahSaldo;
            System.out.println("Saldo saat ini : " + saldoTiapPelanggan[id]);
        }
    }
    
    void beli(){
        int id = verifikasiPelanggan();
        
        if(id != -1 && !statusBlokir[id]) {
            System.out.print("Masukkan jumlah pembelian : ");
            int beli = input.nextInt();
            input.nextLine();
            System.out.println("");
            
            int saldoSetelahBeli = saldoTiapPelanggan[id] - beli;
            
            if (saldoSetelahBeli < 10000) {
                System.out.println("Saldo pasca transaksi kurang dari 10.000, transaksi gagal yah"); 
            } else {
                saldoTiapPelanggan[id] -= beli;
                         
                if (beli > 1000000) {
                    switch (listJenisRekening[id]) {
                        case 38 :
                            int cashback38 = (int) (beli * 0.05);
                            saldoTiapPelanggan[id] += cashback38;
                            System.out.println("Anda mendapat cashback : " + cashback38);
                            System.out.println("Saldo saat ini : " + saldoTiapPelanggan[id]);
                            break;
                        case 56 :
                            int cashback56 = (int) (beli * 0.07) + (int) (beli * 0.02);
                            saldoTiapPelanggan[id] += cashback56;
                            System.out.println("Anda mendapat cashback : " + cashback56);
                            System.out.println("Saldo saat ini : " + saldoTiapPelanggan[id]);
                            break;
                        case 74 :
                            int cashback74 = (int) (beli * 0.1) + (int) (beli * 0.05);
                            saldoTiapPelanggan[id] += cashback74;
                            System.out.println("Anda mendapat cashback : " + cashback74);
                            System.out.println("Saldo saat ini : " + saldoTiapPelanggan[id]);
                            break;
                        default :
                            System.out.println("Saldo saat ini : " + saldoTiapPelanggan[id]);
                            break;
                    }
                }
            }
        }
    }

    public static void setBlokir(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setBlokir'");
    }
}