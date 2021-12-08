
// Online IDE - Code Editor, Compiler, Interpreter
import java.util.Scanner;

public class Soal1 {

    Node head;
    class Node{
        int data;
        int id;
        Node next;
        Node(int i, int d){
            id = i;
            data = d;
            next = null;
        }
    }
    public void insert(int i, int new_data){
        Node new_node = new Node(i, new_data);
        if (head == null){
            head = new Node(i, new_data);
            return;
        }
        new_node.next = null;
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = new_node;
        return;
    }
    public void showdata(){
        Node tnode = head;
        while (tnode  != null){
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }
    public void showindex(){
        Node tnode = head;
        while (tnode  != null){
            System.out.print(tnode.id+" ");
            tnode = tnode.next;
        }
    }
    public void sortlist(){
        Node curr = head;
        Node index = null;
        if(head == null){
            return;
        }
        else{
            while (curr != null){
                index = curr.next;
                while(index != null){
                    if(curr.data < index.data){
                        int temp = curr.data;
                        int tempi = curr.id;
                        curr.data = index.data;
                        curr.id = index.id;
                        index.data = temp;
                        index.id = tempi;
                    }
                    index = index.next;
                }
                curr = curr.next;
            }
        }
    }
    public static void main(String[] args) {
        Soal1 list1 = new Soal1();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka yang akan diurutkan: ");
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Angka ke-" + (i+1) + ": ");
            int angka = scanner.nextInt();
            list1.insert((i+1), angka);
        }
        
        System.out.println("Sebelum Diurutkan   :");
        list1.showdata();
        System.out.println("\n");
        System.out.println("Sesudah Diurutkan   :");
        list1.sortlist();
        list1.showdata();
        System.out.println("\n");
        System.out.println("Urutan indeks yang memiliki nilai terbesar hingga terkecil    :");
        list1.showindex();
    }
}