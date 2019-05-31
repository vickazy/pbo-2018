package MotorEncapsulation;

public class Motor 
{
    private int kecepatan = 80;
    private boolean kontakOn = false;
    
    public void nyalakanMesin()
    {
        kontakOn = true;
    }
    
    public void matikanMesin()
    {
        kontakOn = false;
        kecepatan = 0;
    }
    
    public void tambahKecepatan()
    {
        if(kontakOn == false)
        {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin off! \n");
        }
        else if(kecepatan >= 100)
        {
            System.out.println("Kecepatan tidak bisa bertambah kecepatan maksimal adalah 100! \n");
        }
        else
        {
            kecepatan += 5;
        }
    }
    
    public void kurangiKecepatan()
    {
        if(kontakOn == false)
        {
            System.out.println("Kecepatan tidak bisa berkurang karena mesin off! \n");
        }
        else if(kecepatan <= 0)
        {
            System.out.println("Kecepatan tidak bisa berkurang kecepatan kurang dari 0! \n");
        }
        else
        {
            kecepatan += 5;
        }
    }
    
    public void printStatus()
    {
        if(kontakOn == true)
        {
            System.out.println("Kontak On");
        }
        else
        {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan+"\n");
    }
}
