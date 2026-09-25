public class Barang {
    
    ///Enkapsulasi Atribut dibuat private
    private String namaBarang;
    private int stok;

    //Konstruktor
    public Barang(String namaBarang, int stok)
    {
        this.namaBarang = namaBarang;
        setStok(stok);
    }

    //Getter
    public String getNamaBarang()
    {
        return namaBarang;
    }

    public int getStok()
    {
        return stok;
    }

    public void setNamaBrang(String namaBarang)
    {
        this.namaBarang = namaBarang;
    }

    // Validasi enkapsulasi: stok tidak boleh minus
    public void setStok(int stok) {
        if (stok >= 0) {
            this.stok = stok;
        } else {
            this.stok = 0;
        }
    }

    // Mengurangi stok barang
    public void kurangiStok(int jumlah) {
        this.stok -= jumlah;
    }

}