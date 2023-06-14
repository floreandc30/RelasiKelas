package com.Florean_Desvita_Cindirahayu.pbo.RELASIKELAS_21102132;

import java.util.Scanner;
    public class Main_21102132 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nama Perpustakaan: ");
            String namaPerpus = scanner.nextLine();
            Perpustakaan_21102132 perpustakaan = new Perpustakaan_21102132(namaPerpus);

            System.out.print("Jumlah Buku: ");
            int jumlahBuku = scanner.nextInt();
            scanner.nextLine(); // Membaca newline character setelah angka

            for (int i = 0; i < jumlahBuku; i++) {
                System.out.println("Data Buku - " + (i + 1));

                System.out.print("ISBN: ");
                String isbn = scanner.nextLine();

                System.out.print("Judul: ");
                String judul = scanner.nextLine();

                Buku_21102132 buku = new Buku_21102132(isbn, judul);

                System.out.print("Jumlah Pengarang: ");
                int jumlahPengarang = scanner.nextInt();
                scanner.nextLine(); // Membaca newline character setelah angka

                for (int j = 0; j < jumlahPengarang; j++) {
                    System.out.println("Data Pengarang - " + (j + 1));

                    System.out.print("Nama Pengarang: ");
                    String namaPengarang = scanner.nextLine();

                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    System.out.print("Telp: ");
                    String telp = scanner.nextLine();

                    Pengarang_21102132 pengarang = new Pengarang_21102132(namaPengarang, email, telp);
                    buku.tambahPengarang_21102132(pengarang);
                }
                perpustakaan.tambahBuku_21102132(buku);
            }

            perpustakaan.tampilPerpus_21102132();
        }
    }


