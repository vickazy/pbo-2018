package GreggyGF;

public class Main 
{   
    public static void main(String[] args) 
    {
        Ojek o = new Ojek();
        o.setNama("Hapis");
        o.setAlamat("Singosari");
        o.setUmur(19);
        o.setJumlahRating(5);
        o.info();
        
        System.out.println("-------------------------------------");
        
        Motor m = new Motor();
        m.setMerek("Yamaha");
        m.setNoPlat("N 6577 AAJ");
        m.info();
        
        System.out.println("-------------------------------------");
         
        Pelanggan p = new Pelanggan();
        p.setNama("Greggy");
        p.setAlamatPenjemputan("Klojen");
        p.setAlamatTujuan("Lowokwaru");
        p.setJumlahKm(10);
        p.info();
        
        System.out.println("-------------------------------------");
    }
}
