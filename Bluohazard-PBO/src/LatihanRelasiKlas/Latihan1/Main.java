package LatihanRelasiKlas.Latihan1;

public class Main 
{
    public static void main(String[] args) 
    {
        SegiEmpat s4 = new SegiEmpat(5,5);
        System.out.println("-------------------------------------");
        System.out.println("Segi Empat");
        System.out.println("-------------------------------------");
        System.out.println("Panjang = " + s4.getPanjang());
        System.out.println("Lebar   = " + s4.getLebar());
        System.out.println("Luas    = " + s4.hitungLuas());
        
        System.out.println("");
        
        SegiTigaSamaKaki s3 = new SegiTigaSamaKaki(6,5);
        System.out.println("-------------------------------------");
        System.out.println("Segitiga Sama Kaki");
        System.out.println("-------------------------------------");
        System.out.println("Panjang = " + s3.getAlas());
        System.out.println("Lebar   = " + s3.getTinggi());
        System.out.println("Luas    = " + s3.hitungLuas());
        
        System.out.println("");
        
        SetengahLingkaran ling = new SetengahLingkaran(5);
        System.out.println("-------------------------------------");
        System.out.println("Setengah Lingkaran");
        System.out.println("-------------------------------------");
        System.out.println("Jari-Jari   = " + ling.getJariJari());
        System.out.println("Luas        = " + ling.hitungLuas());
        
        System.out.println("");
        
        BangunCampuran bc = new BangunCampuran(s4, s3, ling); 
        System.out.println("-------------------------------------");
        System.out.println("Bangun Campuran");
        System.out.println("-------------------------------------");
        System.out.println("Luas Total  = " + bc.hitungLuasTotal());       
    } 
}
