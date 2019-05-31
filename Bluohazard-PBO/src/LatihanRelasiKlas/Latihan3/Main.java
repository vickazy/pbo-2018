package LatihanRelasiKlas.Latihan3;

public class Main 
{
    public static void main(String[] args) 
    {
        Buku b1 = new Buku();
        Buku b2 = new Buku();
        
        b1.setKode("CMAB");
        b1.setJudul("Cara Memasak Ayam Bakar");
        b1.setPengarang("Republic of Ayam");
        b1.setThnTerbit(2017);  
        
        b2.setKode("CMAG");
        b2.setJudul("Cara Memasak Ayam Goreng");
        b2.setPengarang("Republic of Ayam");
        b2.setThnTerbit(2018);
        
        Buku buku[] = {b1,b2};
        
        /*-----------------------------------------------------*/
        
        Member m1 = new Member();
        
        m1.setId("ID1");
        m1.setNama("Pitik");
        m1.setBuku(buku);
        
        m1.tampilData();
    }
}
