package LatihanRelasiKlas.Latihan1;

public class SegiTigaSamaKaki 
{
    private int alas, tinggi;
    
    SegiTigaSamaKaki(int als, int tg)
    {
        this.alas = als;
        this.tinggi = tg;
    }

    public void setAlas(int als) 
    {
        this.alas = als;
    }

    public void setTinggi(int tg) 
    {
        this.tinggi = tg;
    }

    public int getAlas() 
    {
        return alas;
    }

    public int getTinggi() 
    {
        return tinggi;
    }
    
    public double hitungLuas()
    {
        return (alas * tinggi) / 2;
    }
}
