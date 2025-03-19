class Hewan {

    String nama;
    String jenis;
    String suara;

    // konstruktor untuk mengisi atribut diatas
    public Hewan(String nama, String jenis, String suara) {
        this.nama = nama;
        this.jenis = jenis;
        this.suara = suara;
    }
    // method
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Suara: " + suara);
        System.out.println();
    }
}


public class Main {
    public static void main(String[] args) {
        Hewan hewan1 = new Hewan("panda", "herbivora", "Hrrmm~~");
        Hewan hewan2 = new Hewan("Anjing", "karbivora", "Woof! Woof!!");

        hewan1.tampilkanInfo();
        hewan2.tampilkanInfo();
    }
}