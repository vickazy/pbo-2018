package LatihanRelasiKlas.Latihan1;

public class SegiEmpat
{
    private int panjang, lebar;
    
    SegiEmpat(int pjg, int lb)
    {
        this.panjang = pjg;
        this.lebar = lb;
    }

    public void setPanjang(int pj) 
    {
        this.panjang = pj;
    }

    public void setLebar(int lb) 
    {
        this.lebar = lb;
    }
    
    public int getPanjang() 
    {
        return panjang;
    }
    
    public int getLebar() 
    {
        return lebar;
    }

    public double hitungLuas()
    {
        return panjang * lebar;
    }
}
