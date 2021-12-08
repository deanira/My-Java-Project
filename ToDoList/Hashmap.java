/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Hashmap {

    public static Scanner numScanner = new Scanner(System.in);
    public static Scanner strScanner = new Scanner(System.in);
    ToDoList list = new ToDoList();
    String judulTask, deskripsiTask;

    public static int printMenu() {
        System.out.println("=================================");
        System.out.println("To Do List ");
        System.out.println("=================================");
        System.out.println("1. Menambahkan catatan");
        System.out.println("2. Menghapus catatan");
        System.out.println("3. Menampilkan catatan");
        System.out.println("4. Keluar Program");
        System.out.println("=================================");
        System.out.println();
        System.out.print("Masukkan Pilihan Menu: ");
        int choice = numScanner.nextInt();

        return choice;
    }

    public static void main(String[] args) {
        //HashMap<String, String> maptodolist = new HashMap<>();
        ToDoList list = new ToDoList();

        while (true) {
            int choice = printMenu();
            String judulTask, deskripsiTask;

            switch (choice) {
                case 1:
                    System.out.println("=================================");
                    System.out.println("Add New Task");
                    System.out.println("=================================");

                    System.out.print("Judul Task\t: ");
                    judulTask = strScanner.nextLine();
                    System.out.print("Deskripsi Task\t: ");
                    deskripsiTask = strScanner.nextLine();
                    
                    ItemToDoList newItem = new ItemToDoList(judulTask, deskripsiTask);
                    list.addToDoList(newItem);

                    System.out.println("=================================");
                    break;
                case 2:
                    System.out.println("=================================");
                    System.out.println("Delete Task");
                    System.out.println("=================================");

                    System.out.print("Judul Task\t: ");
                    judulTask = strScanner.nextLine();

                    list.deleteItemToDoList(judulTask);
                    
                    System.out.println("=================================");
                    break;
                case 3:
                    System.out.println("=========================================");
                    System.out.println("To Do List");
                    System.out.println("=========================================");

                    list.showToDoList();

                    System.out.println("=========================================");
                    break;
                default:
                    System.exit(0);
                    break;
            }
            System.out.println();
        }
    }
}