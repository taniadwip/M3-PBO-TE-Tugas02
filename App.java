public class App {
    public static void main(String[] args) {
        System.out.println("==========================================================");
        System.out.println("        SISTEM PEMINJAMAN BARANG TEKNISI JTK             ");
        System.out.println("==========================================================\n");

        Mahasiswa mhs1 = new Mahasiswa("064", "Rahma Ayu");
        Mahasiswa mhs2 = new Mahasiswa("063", "Rendra Uya");

        Barang kabelLan = new Barang("Kabel LAN Tester", 5);
        Barang proyektor = new Barang("Proyektor HDMI", 1);

        Teknisi petugas = new Teknisi("Pak Anwar");

        // KASUS 1: Peminjaman Normal Berhasil (Stok Cukup)
        System.out.println("[KASUS 1: Peminjaman Berhasil - Stok Cukup]");
        petugas.layaniPinjam(mhs1, kabelLan, 2);

        // KASUS 2: Peminjaman Berhasil Menghabiskan Sisa Stok (Stok Menjadi 0)
        System.out.println("[KASUS 2: Peminjaman Berhasil - Sisa Stok Tepat 0]");
        petugas.layaniPinjam(mhs1, proyektor, 1);

        // KASUS 3: Peminjaman Ditolak karena Stok Sudah Habis (Stok = 0)
        System.out.println("[KASUS 3: Peminjaman Ditolak - Stok Kosong]");
        petugas.layaniPinjam(mhs2, proyektor, 1);

        // KASUS 4: Peminjaman Ditolak karena Permintaan Melebihi Sisa Stok
        // Sisa kabel LAN = 3, namun mahasiswa meminta 4
        // ---------------------------------------------------------------------
        System.out.println("[KASUS 4: Peminjaman Ditolak - Jumlah Diminta Melebihi Stok]");
        petugas.layaniPinjam(mhs2, kabelLan, 4);

        // KASUS 5: Pembuktian Enkapsulasi & Validasi Data Hiding
        // Membuktikan setter mencegah nilai negatif masuk ke atribut privat
        System.out.println("[KASUS 5: Pengujian Enkapsulasi Validasi Setter Stok Negatif]");
        System.out.println("Mencoba mengubah stok " + kabelLan.getNamaBarang() + " menjadi -10 secara paksa via setter...");
        kabelLan.setStok(-10);
        System.out.println("Hasil validasi enkapsulasi: Nilai stok otomatis diamankan menjadi = " + kabelLan.getStok() + " unit\n");

        System.out.println("==========================================================");
        System.out.println("            SIMULASI PENGUJIAN SELESAI                   ");
        System.out.println("==========================================================");
    }
}