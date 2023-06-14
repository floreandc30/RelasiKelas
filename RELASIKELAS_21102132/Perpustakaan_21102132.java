package com.Florean_Desvita_Cindirahayu.pbo.RELASIKELAS_21102132;

public class Perpustakaan_21102132 {
    private String namaPerpus_21102132;
    private Buku_21102132[] buku_21102132;
    private int jumlahBuku;

    public Perpustakaan_21102132(String namaPerpus) {
        this.namaPerpus_21102132 = namaPerpus;
        this.buku_21102132 = new Buku_21102132[3];
        this.jumlahBuku = 0;
    }

    public void tambahBuku_21102132(Buku_21102132 buku) {
        if (jumlahBuku < buku_21102132.length) {
            buku_21102132[jumlahBuku] = buku;
            jumlahBuku++;
        }
    }
    public void tampilPerpus_21102132() {
        System.out.println("*********Tampil Perpustakaan*********************");
        System.out.println("Nama Perpustakaan : " + namaPerpus_21102132);
        System.out.println("Jumlah Buku : " + jumlahBuku);
        System.out.println();

        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("*********Tampil Buku*********************");
            System.out.println("Data Buku Ke : " + (i + 1));
            buku_21102132[i].tampilBuku_21102132();
            System.out.println();
        }
    }
}
