import java.util.HashMap;
public class ToDoList {
    HashMap<String, String> list = new HashMap<>();
    
    public void addToDoList(ItemToDoList newItem) {
        String cek = list.put(newItem.getJudul(), newItem.getDeskripsi()); 
        if (cek != null) {
            System.out.println("Judul " + newItem.getJudul() + " sudah terdapat pada List");
        }
    }
    public void deleteItemToDoList(String judul) {
        if (list.containsKey(judul)) {
            list.remove(judul);
            System.out.println("Penghapusan task berhasil");
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
    public int getSize() {
        return list.size();
    }
    public void showToDoList() {
         if (list.size() == 0) {
            System.out.println("To Do List kosong");
        } else {
            System.out.println("| Judul Task\t" + "| Deskripsi\t\t|");
            System.out.println("-----------------------------------------");
                for (String taskKey : list.keySet()) {
                System.out.println("| " + taskKey + "\t| " + list.get(taskKey) + "\t\t|");
            }
        }
    }
}