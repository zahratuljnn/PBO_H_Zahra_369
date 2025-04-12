class Rekening {
    String nomorRekening;
    String namaPemilik;
    double saldo;

    public Rekening(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    public void setor(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println(namaPemilik + " menyetor Rp" + jumlah + ". Saldo sekarang: Rp" + saldo);
            System.out.println();
        }
    }

    public void tarik(double jumlah) {
        if (jumlah > saldo) {
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Gagal, Saldo tidak mencukupi) Saldo saat ini: Rp" + saldo);
        } else {
            saldo -= jumlah;
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Berhasil) Saldo sekarang: Rp" + saldo);
        }
    }

    public void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp" + saldo);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Rekening r1 = new Rekening("202410370110369", "Zahra", 500000.0);
        Rekening r2 = new Rekening("202410370110343", "Zaskia", 1000000.0);

        r1.tampilkanInfo();
        r2.tampilkanInfo();

        r1.setor(200000.0);
        r2.setor(500000.0);

        r1.tarik(800000.0);
        r2.tarik(500000.0);

        r1.tampilkanInfo();
        r2.tampilkanInfo();
    }
}