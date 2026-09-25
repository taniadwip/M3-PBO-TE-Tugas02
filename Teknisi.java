public class Teknisi {
    private String namaTeknisi;

    public Teknisi(String namaTeknisi)
    {
        this.namaTeknisi = namaTeknisi;
    }

    public String getNamaTeknisi()
    {
        return namaTeknisi;
    }

    public void setNamaTeknisi(String namaTeknisi)
    {
        this.namaTeknisi = namaTeknisi;
    }

    public void layaniPinjam(Mahasiswa mhs, Barang barang, int jumlah) {
        System.out.println("Teknisi " + this.namaTeknisi + " memproses permintaan dari " + mhs.getNama() + "...");

        if (barang.getStok() >= jumlah) {
            barang.kurangiStok(jumlah);
            System.out.println("-> STATUS : BERHASIL");
            System.out.println("   " + mhs.getNama() + " (" + mhs.getNim() + ") meminjam " + jumlah + " unit " + barang.getNamaBarang());
            System.out.println("   Sisa stok " + barang.getNamaBarang() + " saat ini: " + barang.getStok() + " unit\n");
        } else {
            System.out.println("-> STATUS : DITOLAK");
            System.out.println("   Stok " + barang.getNamaBarang() + " tidak mencukupi (sisa: " + barang.getStok() + " unit)\n");
        }
    }
}
