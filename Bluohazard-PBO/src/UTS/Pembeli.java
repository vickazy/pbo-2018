package UTS;

public class Pembeli 
{
    public String nama;
    public Laptop laptop[];
    
    public Pembeli()
    {

    }
    
    public void hitungHargaTotal()
    {
        int total = 0;
        for(int i = 0; i < laptop.length; i++)
        {
            total += laptop[i].getHarga();
        }
        System.out.println("Harga Total\t: Rp." + total + ",-");
    }
    
    public void print()
    {
        System.out.println("--------------------------------------");
        System.out.println("Nama Pembeli\t: " + nama);
        for (int i = 0; i < laptop.length; i++)
        {
            laptop[i].print();
        }
        System.out.println("--------------------------------------");
        hitungHargaTotal();
        System.out.println("--------------------------------------");
    }
}
