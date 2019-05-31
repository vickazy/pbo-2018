package pbominggu12.entity;

public class Ijazah 
{
    // POJO ---> Plain Old Java Object
    private Integer nim;
    private String tanggal_lulus;
    private float nilai;
    private String predikat;
    
    public Ijazah()
    {
        
    }

    public Integer getNim() {
        return nim;
    }

    public void setNim(Integer nim) {
        this.nim = nim;
    }

    public String getTanggal_lulus() {
        return tanggal_lulus;
    }

    public void setTanggal_lulus(String tanggal_lulus) {
        this.tanggal_lulus = tanggal_lulus;
    }

    public float getNilai() {
        return nilai;
    }

    public void setNilai(float nilai) {
        this.nilai = nilai;
    }

    public String getPredikat() {
        return predikat;
    }

    public void setPredikat(String predikat) {
        this.predikat = predikat;
    }
}
