package LatihanRelasiKlas.Latihan3;

public class Buku 
{
    private String kode, judul, pengarang;
    private int thnTerbit;
    
    Buku()
    {
        
    }

    public void setKode(String kode) 
    {
        this.kode = kode;
    }

    public void setJudul(String judul) 
    {
        this.judul = judul;
    }

    public void setPengarang(String pengarang) 
    {
        this.pengarang = pengarang;
    }

    public void setThnTerbit(int thnTerbit) 
    {
        this.thnTerbit = thnTerbit;
    }
    
    public void tampilData()
    {
        System.out.println("Kode\t\t: " + kode);
        System.out.println("Judul\t\t: " + judul);
        System.out.println("Pengarang\t: " + pengarang);
        System.out.println("Tahun Terbit\t: " + thnTerbit);
    }
}
