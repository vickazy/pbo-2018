package GreggyGF;

public class Ojek 
{
    private String nama, alamat;
    private int umur, JumlahRating;
    private Pelanggan jumlahKm;
    
    Ojek()
    {
        
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

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public Pelanggan getJumlahKm() {
        return jumlahKm;
    }

    public void setJumlahKm(Pelanggan jumlahKm) {
        this.jumlahKm = jumlahKm;
    }

    public int getJumlahRating() {
        return JumlahRating;
    }

    public void setJumlahRating(int JumlahRating) {
        this.JumlahRating = JumlahRating;
    }
    
    

    
    
    
    
    public void info()
    {
        System.out.println("Nama Tukang Ojek\t:" + getNama());
        System.out.println("Alamat\t\t: " + getAlamat());
        System.out.println("Umur\t: " + getUmur() + " Thn");
        System.out.println("Jumlah Rating\t: " + getJumlahRating());
        System.out.println(getJumlahKm());
    }
    
    
}
