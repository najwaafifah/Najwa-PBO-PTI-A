package Modul2;

public class Rasional {
    private int pembilang, penyebut;
    public Rasional() {
        pembilang = 0;
        penyebut = penyebut;
    }
    public Rasional(int pbl, int pyb) {
        pembilang = pbl;
        penyebut = pyb;
    }
        //mengecek suatu bilangan adalah rasional atau bukan
    public boolean isRasional() {
        return (penyebut !=0);
    }
        //menyederhanakan bilangan rasional
    public void Sederhana() {
        int temp, A, B;
        if (penyebut ==0) {
            return;
        }
        A = (pembilang<penyebut) ? penyebut:pembilang;
        B = (pembilang<penyebut) ? pembilang:penyebut;

        for (; B != 0;) {
            temp = A % B;
            A = B;
            B = temp;
        }

        pembilang /=A;
        penyebut /=A;
    }

    public void kurangkan(Rasional B) {
        this.pembilang = this.pembilang * B.penyebut - B.pembilang * this.penyebut;
        this.penyebut = this.penyebut * B.penyebut;
    }

    public void kalikan(Rasional C) {
        this.pembilang = this.pembilang * C.pembilang;
        this.penyebut = this.penyebut * C.penyebut;
    }

    public void bagi(Rasional D) {
        Rasional rasionalBagi = new Rasional(D.penyebut, D.pembilang);
        this.kalikan(rasionalBagi);
    }
    public double Cast() {
        return (penyebut==0.0) ? 0.0 : (double)pembilang / (double)penyebut;
    }
        //operator >
    public boolean moreThan(Rasional A) {
        return (pembilang*A.penyebut>penyebut*A.pembilang);
    }
        //operator Unary ----> A = -A
    public void negasi() {
        pembilang = -pembilang;
    }
        //operator unary += \
    public void unaryPlus(Rasional A) {
        pembilang = pembilang*A.penyebut+penyebut*A.pembilang;
        penyebut *= A.penyebut;
    }
    public boolean lessThan (Rasional A){
        return (pembilang * A.penyebut < penyebut * A.pembilang);
    }
    public boolean lessThanEqual (Rasional A){
        return (pembilang * A.penyebut <= penyebut * A.pembilang);
    }
    public boolean moreThanEqual (Rasional A){
        return (pembilang * A.penyebut >= penyebut * A.pembilang);
    }
    public void cetak() {
        System.out.println(pembilang + "/" + penyebut);
    }
    
}
