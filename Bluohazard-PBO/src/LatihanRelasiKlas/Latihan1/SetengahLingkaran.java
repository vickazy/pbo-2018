package LatihanRelasiKlas.Latihan1;

public class SetengahLingkaran 
{
    private int jariJari;
    
    SetengahLingkaran(int jari)
    {
        this.jariJari = jari;
    }

    public void setJariJari(int jari) 
    {
        this.jariJari = jari;
    }
    
    public int getJariJari() 
    {
        return jariJari;
    }
    
    public double hitungLuas()
    {
        return (3.14 * jariJari * jariJari) / 2;
    }
}