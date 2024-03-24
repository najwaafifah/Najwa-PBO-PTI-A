import Modul2.Student;
import java.util.Scanner;

public class MainStudentt {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("SIAM Siswa : Input datasiswa");
    System.out.println("Masukkan jumlah sisw yang ingin dimasukkan : ");
    int jumlahSiswa = in.nextInt();
    in.nextLine();

    Student[] student = new Student[jumlahSiswa + 1]; // buat array utk objek
    int id = 0;

    for (id = 0; id < jumlahSiswa; id++) {
        System.out.println("Siswa ke " + (id + 1));
        System.out.print("\nNama siswa : ");
        String nama = in.nextLine();

        System.out.print("Lokasi : ");
        String lokasi = in.nextLine();
        System.out.print("Umur : ");
        int umur = in.nextInt();
        in.nextLine();

        System.out.print("Nilai math : ");
        int mathGrade = in.nextInt();
        in.nextLine();
        System.out.print("Nilai english : ");
        int englishGrade = in.nextInt();
        in.nextLine();
        System.out.print("Nilai science : ");
        int scienceGrade = in.nextInt();
        in.nextLine();

        student[id] = new Student(id, nama, lokasi, umur, mathGrade, englishGrade, scienceGrade);
    }

    for (int i = 0; i < jumlahSiswa; i++) {
        student[i].displayMessage();
    }

    student[id - 1].jumlahObjek();
}
}
