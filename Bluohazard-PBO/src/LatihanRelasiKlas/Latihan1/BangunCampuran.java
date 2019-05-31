package LatihanRelasiKlas.Latihan1;

public class BangunCampuran 
{
    private SegiEmpat s4;
    private SegiTigaSamaKaki s3;
    private SetengahLingkaran ling;
    
    BangunCampuran(SegiEmpat s4, SegiTigaSamaKaki s3, SetengahLingkaran ling)
    {
        this.s4 = s4;
        this.s3 = s3;
        this.ling = ling;
    }
    
    public double hitungLuasTotal()
    {
        return s4.hitungLuas() + s3.hitungLuas() + ling.hitungLuas();
    }
}
