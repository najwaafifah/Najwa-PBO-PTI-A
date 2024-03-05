public class ListBuku {
    public void berdasarkanKategori(int pilihanKategori) {
       PropertiBuku propertiBuku = new PropertiBuku();
       
       switch (pilihanKategori){
       case 1 :
           System.out.println("\n=======================");
           System.out.println("Kategori : Teknologi\n");
           propertiBuku.cetakInfoBuku("Data Structures and Algorithms", "Michael T. Goodrich","Roberto T.",2007);
           propertiBuku.cetakInfoBuku("Pemrograman Web", "Priyanto H.","-", 2015);
           break;
        case 2:
           System.out.println("\n=======================");
           System.out.println("Kategori : Filsafat\n");
           propertiBuku.cetakInfoBuku("Sejarah Dunia yang Disembunyikan", "Jonathan Black","-", 2010);
           propertiBuku.cetakInfoBuku("Filsafat Pancasila", "Haelan","-", 2020);
           break;
       case 3:
           System.out.println("\n=======================");
           System.out.println("Kategori : Sejarah\n");
           propertiBuku.cetakInfoBuku("10 Dosa Besar Soeharto", "Wimanjaya K.","-",1990);
           propertiBuku.cetakInfoBuku("Sejarah Indonesia", "Kemdikbud", "-", 2020);
           break;
       case 4:
           System.out.println("\n=======================");
           System.out.println("Kategori : Agama\n");
           propertiBuku.cetakInfoBuku("Hadis Nabi", "Muhammad Ajaj Al-Khatib","-",2003);
           propertiBuku.cetakInfoBuku("Dasar Dasar Pendidikan Agama Islam", "Maman", "-", 2007);
           break;
        case 5:
           System.out.println("\n=======================");
           System.out.println("Kategori : Psikologi\n");
           propertiBuku.cetakInfoBuku("Psikologi Kepribadian", "Lynn Wileox","-",2005);
           propertiBuku.cetakInfoBuku("Teori Belajar dan Pembelajaran", "Nurlina", "-", 2015);
           break;
        case 6:
           System.out.println("\n=======================");
           System.out.println("Kategori : Politik\n");
           propertiBuku.cetakInfoBuku("Dasar Dasar Ilmu Politik", "Miriam B.","-",2010);
           propertiBuku.cetakInfoBuku("Politik dan Kekuasaan", "Ibnu Qutaibah", "-", 2014);
           break;
        case 7:
           System.out.println("\n=======================");
           System.out.println("Kategori : Fiksi\n");
           propertiBuku.cetakInfoBuku("Hujan", "Tere Liye","-",2018);
           propertiBuku.cetakInfoBuku("Laskar Pelangi", "Andrea Hirata", "-", 2005);
           break;
       default :
           System.out.println("Kategori yang anda masukkan tidak tersedia");
           break;
       }
    }    
}
