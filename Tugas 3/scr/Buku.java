public class Buku {
        private String judul;
        private String pengarang;
        private String isbn;
        private boolean statusPinjam;
    
        public Buku(String judul, String pengarang, String isbn) {
            this.judul = judul;
            this.pengarang = pengarang;
            this.isbn = isbn;
        }
    
        public void cetakInfoBuku() {
            System.out.println("Judul :" + judul);
            System.out.println("Pengarang : " + pengarang);
            System.out.println("ISBN : " + isbn);
        }
    
        public void pinjamBuku() {
            statusPinjam = true;
        }
        
        public void kembalikanBuku() {
            statusPinjam = false;
        }
        
        public String getJudul() {
            return judul;
        }
    
        public String getPengarang() {
            return pengarang;
        }
        
        public String getISBN() {
            return isbn;
        }
        
        public boolean getStatusPinjam() {
            return statusPinjam;
        }

}


