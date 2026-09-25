public class Mahasiswa {
    //Enkapsulasi Atribut dibuat private
    private String nim;
    private String nama;

    //konstruktor
    public Mahasiswa (String nim, String nama)
    {
        this.nim = nim;
        this.nama = nama;
    }

    //getter
    public String getNim()
    {
        return nim;
    }

    public String getNama()
    {
        return nama;
    }

    //setter
    public void setNim(String nim)
    {
        this.nim = nim;
    }

    public void setNama(String nama)
    {
        this.nama = nama;
    }
}