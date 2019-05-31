package GreggyGF;

public class Pelanggan 
{
    private String nama, alamatPenjemputan, alamatTujuan;
    private int jumlahKm;
    
    Pelanggan()
    {
        
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamatPenjemputan() {
        return alamatPenjemputan;
    }

    public void setAlamatPenjemputan(String alamatPenjemputan) {
        this.alamatPenjemputan = alamatPenjemputan;
    }

    public String getAlamatTujuan() {
        return alamatTujuan;
    }

    public void setAlamatTujuan(String alamatTujuan) {
        this.alamatTujuan = alamatTujuan;
    }

    public int getJumlahKm() {
        return jumlahKm;
    }

    public void setJumlahKm(int jumlahKm) {
        this.jumlahKm = jumlahKm;
    }
    
    public void info()
    {
        System.out.println("Nama Pelanggan\t: " + getNama());
        System.out.println("Alamat Penjemputan\t: " + getAlamatPenjemputan());
        System.out.println("Alamat Tujuan\t:" + getAlamatTujuan());
        System.out.println("Jumlah km\t: " + getJumlahKm());
    }
}
