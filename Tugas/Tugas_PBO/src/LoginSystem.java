import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih Tipe Login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.println("Masukkan pilihan (1/2): ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (pilihan == 1) {
            // Login sebagai Admin
            String usernameAdmin = "Admin369";
            String passwordAdmin = "Password369";

            System.out.print("Masukkan Username Admin: ");
            String inputUsername = scanner.nextLine();
            System.out.print("Masukkan Password Admin: ");
            String inputPassword = scanner.nextLine();
            // Memanggil username dan memilah benar atau salah
            if (inputUsername.equals(usernameAdmin) && inputPassword.equals(passwordAdmin)) {
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        } else if (pilihan == 2) {
            // Login sebagai Mahasiswa
            String namaMahasiswa = "zahratul jannah";
            String nimMahasiswa = "202410370110369";

            System.out.print("Masukkan Nama Mahasiswa: ");
            String inputNama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String inputNim = scanner.nextLine();
            // Memanggil username dan memilah benar atau salah
            if (inputNama.equals(namaMahasiswa) && inputNim.equals(nimMahasiswa)) {
                System.out.println("Login Mahasiswa berhasil!");
                System.out.println("Nama: " + inputNama);
                System.out.println("NIM: " + inputNim);
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        //penutup program
        scanner.close();
    }
}