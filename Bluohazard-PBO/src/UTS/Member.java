package UTS;

public class Member extends Pembeli 
{
    public void hitungHargaTotal()
    {
        double total = 0;
        double diskon = 0;
        for(int i = 0; i < laptop.length; i++)
        {
            total += laptop[i].getHarga();
        }
        
        diskon = 0.05 * total;
        total -= diskon;
        System.out.println("Diskon\t\t: Rp." + diskon);
        System.out.println("--------------------------------------");
        System.out.println("Harga Total\t: Rp." + total + ",-");
    }
}
