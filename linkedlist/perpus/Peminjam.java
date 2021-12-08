/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

public class Peminjam {
    private int kodePeminjam;
    private String namaPeminjam;
    private String buku;
    public Peminjam next;

    private Scanner strScanner = new Scanner(System.in);
    private Scanner intScanner = new Scanner(System.in);
    
    public Peminjam() {
        System.out.println();
        System.out.print("Masukkan Kode Peminjam    : ");
        this.kodePeminjam = intScanner.nextInt();
        System.out.print("Masukkan Nama Peminjam    : ");
        this.namaPeminjam = strScanner.nextLine();
        System.out.print("Masukkan Nama Buku        : ");
        this.buku = strScanner.nextLine();
        this.next = null;
    }
    public Peminjam(int kodePeminjam, String namaPeminjam, String buku) {
        this.kodePeminjam = kodePeminjam;
        this.namaPeminjam = namaPeminjam;
        this.buku = buku;
        this.next = null;
    }
    public int getKodePeminjam() {
        return kodePeminjam;
    }
    public void setKodePeminjam(int kodePeminjam) {
        this.kodePeminjam = kodePeminjam;
    }
    public String getNamaPeminjam() {
        return namaPeminjam;
    }
    public void setNamaPeminjam(String namaPeminjam) {
        this.namaPeminjam = namaPeminjam;
    }
    public String getBuku() {
        return buku;
    }
    public void setBuku(String buku) {
        this.buku = buku;
    }
}