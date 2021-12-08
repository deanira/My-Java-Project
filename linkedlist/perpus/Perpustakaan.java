/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

public class Perpustakaan {

    public Peminjam head;
    public Peminjam tail;
    public static Scanner scanner = new Scanner(System.in);

    public Perpustakaan() {
        this.head = null;
        this.tail = null;
    }

    public void insertFirst(Peminjam peminjam) {
        if (this.head == null) {
            this.head = peminjam;
            this.tail = peminjam;
        } else {
            Peminjam temp = this.head;
            this.head = peminjam;
            this.head.next = temp;
        }
    }

    public void insertLast(Peminjam peminjam) {
        if (this.head == null) {
            this.insertFirst(peminjam);
        } else {
            this.tail.next = peminjam;
            this.tail = this.tail.next;
        }
    }

    public void insert(Peminjam peminjam) {
        if (this.head == null) {
            this.insertFirst(peminjam);
        } else {
            Peminjam temp = this.head;
            if (peminjam.getKodePeminjam() >= temp.getKodePeminjam()) {
                while (temp.next != null) {
                    if (peminjam.getKodePeminjam() < temp.next.getKodePeminjam()) {
                        break;
                    }
                    temp = temp.next;
                }
                if (temp.next == null) {
                    this.insertLast(peminjam);
                } else {
                    Peminjam temp2 = temp.next;
                    temp.next = peminjam;
                    temp.next.next = temp2;
                }
            } else {
                this.insertFirst(peminjam);
            }
        }
    }

    public void deleteData() {
        if (this.head == null) {
            System.out.println("Data Playlist Kosong!");
        } else {
            System.out.print("Masukkan Kode Peminjam yang ingin di Hapus: ");
            int kodePeminjam = scanner.nextInt();
            boolean isFound = false;

            Peminjam temp = this.head;
            if (kodePeminjam != temp.getKodePeminjam()) {

                while (temp.next != null) {
                    if (kodePeminjam == temp.next.getKodePeminjam()) {
                        isFound = true;
                        break;
                    }
                    temp = temp.next;
                }
                if (isFound == false) {
                    System.out.println("Data Kode Peminjam Tidak Ditemukan");
                } else if (temp.next == this.tail) {
                    temp.next = null;
                    this.tail = temp;
                } else {
                    temp.next = temp.next.next;
                }
            } else {
                this.head = this.head.next;
            }
        }
    }

    public void printList() {
        Peminjam temp = this.head;
        int counter = 1;

        while (temp != null) {
            System.out.println();
            System.out.println("Data Peminjam ke-" + counter); 
            System.out.println("Kode Peminjam   : " + temp.getKodePeminjam() + " ");
            System.out.println("Nama Peminjam   : " + temp.getNamaPeminjam());
            System.out.println("Buku Dipinjam   : " + temp.getBuku());
            counter++;
            temp = temp.next;
        }
    }
    
    public int lengthOfLinkedList() {
        Peminjam temp=head;
        int count = 0;
        while(temp!=null)
            {
                temp=temp.next;
                count++;  
            }
        return count;
    }
    
    public void sortAlphabetically() {
        Peminjam curr = head;
        Peminjam index = null;
        Peminjam temp;
        if(head == null){
            return;
        }
        else{
            while (curr != null){
                index = curr.next;
                
                while(index != null){
                    if (curr.getNamaPeminjam().compareTo(index.getNamaPeminjam()) > 0) {
                        if(curr==head){
                            head=index;
                        } 
                        // System.out.println(curr.getNamaPeminjam() + " " + index.getNamaPeminjam());
                        // System.out.println((curr.getNamaPeminjam().compareTo(index.getNamaPeminjam()) > 0));
			    	    // swapping
				    	temp = curr;
					    curr = index;
				    	index = temp;
				    	if(index.next.next != null){
					        index.next = index.next.next;
				    	} else {
				    	    index.next = null;
				    	}
					    curr.next = index;
				    }
                    index = index.next;
                }
                curr = curr.next;
            }
        }
        
        
    }
}