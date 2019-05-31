package pbominggu12.entity;

public class Mahasiswa 
{
    // POJO ---> Plain Old Java Object
    private Integer nim;
    private String nama;
    private String alamat;
    
    public Mahasiswa()
    {
        // konstruktor kosong
    }

    public Integer getNim() {
        return nim;
    }

    public void setNim(Integer nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    
}
