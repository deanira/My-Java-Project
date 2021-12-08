/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

public class Main {
     public static Scanner scanner = new Scanner(System.in);

    public static int printMenu() {
        System.out.println();
        System.out.println("Selamat Datang di Sistem Perpustakaan");
        System.out.println("1. Masukkan Data Peminjam di Awal");
        System.out.println("2. Masukkan Data Peminjam di Akhir");
        System.out.println("3. Masukkan Data Peminjam Berurutan (Tengah)");
        System.out.println("4. Hapus Data Peminjaman");
        System.out.println("5. Tampilkan Seluruh Data");
        System.out.println("6. Total Data");
        System.out.println("7. Urutkan nama berdasarkan abjad");
        System.out.println("8. Keluar Program");
        System.out.println();
        System.out.print("Masukkan Pilihan Menu: ");
        int choice = scanner.nextInt();
        return choice;
    }
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();

        while (true) {
            int choice = printMenu();

            switch (choice) {
                case 1:
                    perpustakaan.insertFirst(new Peminjam());
                    break;
                case 2:
                    perpustakaan.insertLast(new Peminjam());
                    break;
                case 3:
                    perpustakaan.insert(new Peminjam());
                    break;
                case 4:
                    perpustakaan.deleteData();
                    break;
                case 5:
                    perpustakaan.printList();
                    break;
                case 6:
                    System.out.println(perpustakaan.lengthOfLinkedList());
                    break;
                case 7:
                    perpustakaan.sortAlphabetically();
                    perpustakaan.printList();
                    break;
                default:
                    System.exit(0);
                    break;
            }
        }
    }
}