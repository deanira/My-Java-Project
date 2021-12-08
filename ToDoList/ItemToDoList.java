public class ItemToDoList {
    private String judul;
    private String deskripsi;
    
    ItemToDoList(String judul, String desk){
        this.judul = judul;
        this.deskripsi = desk;
    }
    public String getJudul() {
        return judul;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public String getDeskripsi() {
        return deskripsi;
    }
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}