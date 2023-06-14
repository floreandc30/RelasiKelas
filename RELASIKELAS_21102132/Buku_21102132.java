package com.Florean_Desvita_Cindirahayu.pbo.RELASIKELAS_21102132;

public class Buku_21102132 {
        private String isbn_21102132;
        private String judul_21102132;
        private Pengarang_21102132[] pengarang_21102132;
        private int jumlahPengarang;

        public Buku_21102132(String isbn, String judul) {
            this.isbn_21102132 = isbn;
            this.judul_21102132 = judul;
            this.pengarang_21102132 = new Pengarang_21102132[3];
            this.jumlahPengarang = 0;
        }

        public void tambahPengarang_21102132(Pengarang_21102132 pengarang) {
            if (jumlahPengarang < pengarang_21102132.length) {
                pengarang_21102132[jumlahPengarang] = pengarang;
                jumlahPengarang++;
            }
        }
    public void tampilBuku_21102132() {
        System.out.println("ISBN : " + isbn_21102132);
        System.out.println("Judul : " + judul_21102132);
        System.out.println("Jumlah Pengarang : " + jumlahPengarang);
        System.out.println();

        for (int i = 0; i < jumlahPengarang; i++) {
            System.out.println("*********Tampil Pengarang*********************");
            System.out.println("Data Pengarang Ke : " + (i + 1));
            pengarang_21102132[i].tampilPengarang_21102132();
            System.out.println();
        }
    }
}

