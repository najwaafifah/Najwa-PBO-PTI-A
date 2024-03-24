package Modul3;

import java.util.Scanner;

public class ListBuku {
    PropertiBuku[] buku = new PropertiBuku[100];

    public void berdasarkanKategori(int pilihanKategori) {
        switch (pilihanKategori) {
            case 1:
                System.out.println("\n=======================");
                System.out.println("Kategori : Teknologi\n");
                buku[0].cetakPropertiBuku();
                buku[0].cekJumlahKataSinopsis();
                buku[1].cetakPropertiBuku();
                buku[1].cekJumlahKataSinopsis();
                break;
            case 2:
                System.out.println("\n=======================");
                System.out.println("Kategori : Filsafat\n");
                buku[2].cetakPropertiBuku();
                buku[2].cekJumlahKataSinopsis();
                buku[3].cetakPropertiBuku();
                buku[3].cekJumlahKataSinopsis();
                break;
            case 3:
                System.out.println("\n=======================");
                System.out.println("Kategori : Sejarah\n");
                buku[4].cetakPropertiBuku();
                buku[4].cekJumlahKataSinopsis();
                buku[5].cetakPropertiBuku();
                buku[5].cekJumlahKataSinopsis();
                break;
            case 4:
                System.out.println("\n=======================");
                System.out.println("Kategori : Agama\n");
                buku[6].cetakPropertiBuku();
                buku[6].cekJumlahKataSinopsis();
                buku[7].cetakPropertiBuku();
                buku[7].cekJumlahKataSinopsis();
                break;
            case 5:
                System.out.println("\n=======================");
                System.out.println("Kategori : Psikologi\n");
                buku[8].cetakPropertiBuku();
                buku[8].cekJumlahKataSinopsis();
                buku[9].cetakPropertiBuku();
                buku[9].cekJumlahKataSinopsis();
                break;
            case 6:
                System.out.println("\n=======================");
                System.out.println("Kategori : Politik\n");
                buku[10].cetakPropertiBuku();
                buku[10].cekJumlahKataSinopsis();
                buku[11].cetakPropertiBuku();
                buku[11].cekJumlahKataSinopsis();
                break;
            case 7:
                System.out.println("\n=======================");
                System.out.println("Kategori : Fiksi\n");
                buku[12].cetakPropertiBuku();
                buku[12].cekJumlahKataSinopsis();
                buku[13].cetakPropertiBuku();
                buku[13].cekJumlahKataSinopsis();
                break;
            default:
                System.out.println("Kategori yang anda masukkan tidak tersedia");
                break;

            }
        }

    public void inputCekTingkatKesamaan() {
        Scanner input = new Scanner(System.in);

        System.out.println("Cari berdasarkan id buku");
        System.out.println("Bandingkan buku pertama dan buku kedua");

        System.out.println("ID buku pertama : ");
        int idBukuA = input.nextInt();
        input.nextLine();
        System.out.println("ID buku kedua : ");
        int idBukuB = input.nextInt();
        input.nextLine();

        System.out.println("Tingkat kesamaan : " + cekTingkatKesamaan(idBukuA, idBukuB));
    }

    public double cekTingkatKesamaan(int idBukuA, int idBukuB) {
        double poin = 0;

            if (buku[idBukuA].getNamaBuku().equals(buku[idBukuB].getNamaBuku())) {
                poin += 1;
            }

            if (buku[idBukuA].getPenulis1().equals(buku[idBukuB].getPenulis1())) {
                poin += 1;
            }

            if (buku[idBukuA].getPenulis2().equals(buku[idBukuB].getPenulis2())) {
                poin += 1;
            }

            if (buku[idBukuA].getTahun() == (buku[idBukuB].getTahun())) {
                poin += 1;
            }

            if (buku[idBukuA].getSinopsis().equals((buku[idBukuB].getSinopsis()))) {
                poin += 1;
            }

            return poin / 5 * 100;
        }

    public void cariBukuTertentu() {
        Scanner input = new Scanner(System.in);

        System.out.println("Cari berdasarkan id buku");
        int bukuA = input.nextInt();
        input.nextLine();
        buku[bukuA].cetakPropertiBuku();
    }

    public void inputHitungRoyalti() {
        Scanner input = new Scanner(System.in);

        System.out.println("\nHitung royalti buku");
        System.out.println("Pilih buku (berdasarkan id)");
        int id = input.nextInt();
        input.nextLine();
        buku[id].cetakPropertiBuku();

        System.out.println("1. Berdasarkan penjualan bulan ini\n2. Berdasarkan persentase");
        int pilihan = input.nextInt();
        input.nextLine();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan harga buku : ");
                buku[id].hitungRoyalti(input.nextInt());
                buku[id].cetakBiayaRoyalti();
                break;
            case 2:
                System.out.print("Masukkan harga buku :");
                int harga = input.nextInt();
                System.out.print("Masukkan persen :");
                double persen = input.nextDouble();
                buku[id].hitungRoyalti(harga, persen);
                buku[id].cetakBiayaRoyalti();
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
                break;
        }
    }

    public PropertiBuku[] getDataBuku() {
        return buku;
    }

    public void setInstanceSemuaBuku() {
        buku[0] = new PropertiBuku(0, "Data Structures and Algorithms", "Michael T. Goodrich", "Roberto T.", 2007,"");
        buku[0].setSinopsis("Explore the world of algorithms and data structures in this comprehensive guide.");
        buku[1] = new PropertiBuku(1, "Data Structures and Algorithms", "Priyanto H.", "-", 2015, "");
        buku[1].setSinopsis("Learn the fundamentals of web programming and design with this practical book.");
        buku[2] = new PropertiBuku(2, "Sejarah Dunia yang Disembunyikan", "Jonathan Black", "-", 2010, "");
        buku[2].setSinopsis("Uncover hidden stories from the history of the world in this thought-provoking exploration.");
        buku[3] = new PropertiBuku(3, "Filsafat Pancasila", "Haelan", "-", 2020, "");
        buku[3].setSinopsis("Delve into the philosophical principles of Pancasila in this insightful book.");
        buku[4] = new PropertiBuku(4, "10 Dosa Besar Soeharto", "Wimanjaya K.", "-", 1990, "");
        buku[4].setSinopsis("Examine the ten major mistakes of Soeharto's era in this historical account.");
        buku[5] = new PropertiBuku(5, "Sejarah Indonesia", "Kemdikbud", "-", 2020, "");
        buku[5].setSinopsis("Discover the rich history of Indonesia from ancient times to the present day.");
        buku[6] = new PropertiBuku(6, "Hadis Nabi", "Muhammad Ajaj Al-Khatib", "-", 2003, "");
        buku[6].setSinopsis("Explore the sayings and actions of Prophet Muhammad in this comprehensive collection of hadith.");
        buku[7] = new PropertiBuku(7, "Dasar Dasar Pendidikan Agama Islam", "Maman", "-", 2007, "");
        buku[7].setSinopsis("Understand the fundamental principles of Islamic education in this insightful book.");
        buku[8] = new PropertiBuku(8, "Psikologi Kepribadian", "Lynn Wileox", "-", 2005, "");
        buku[8].setSinopsis("Explore the intricacies of personality psychology in this engaging and informative book.");
        buku[9] = new PropertiBuku(9, "Teori Belajar dan Pembelajaran", "Nurlina", "-", 2015, "");
        buku[9].setSinopsis("Understand various learning theories and their applications in education with this essential guide.");
        buku[10] = new PropertiBuku(10, "Dasar Dasar Ilmu Politik", "Miriam B.", "-", 2010, "");
        buku[10].setSinopsis("Gain a foundational understanding of political science and its key concepts in this enlightening book.");
        buku[11] = new PropertiBuku(11, "Politik dan Kekuasaan", "Ibnu Qutaibah", "-", 2014, "");
        buku[11].setSinopsis("Explore the dynamics of politics and power in this insightful examination of political systems.");
        buku[12] = new PropertiBuku(12, "Hujan", "Tere Liye", "-", 2018, "");
        buku[12].setSinopsis("Immerse yourself in a captivating fiction story filled with emotion, drama, and unexpected twists.");
        buku[13] = new PropertiBuku(13, "Laskar Pelangi", "Andrea Hirata", "-", 2005, "");
        buku[13].setSinopsis("Experience the inspiring journey of a group of students in a small Indonesian village in this heartwarming novel.");
    }
}


