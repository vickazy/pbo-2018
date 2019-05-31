package SepedaDemo;

public class Sepeda 
{
    private String merek,warna;
    private int kecepatan;
    private int gear;
    
    public void setWarna(String newValue)
    {
        warna = newValue;
    }
    
    public void setMerek(String newValue)
    {
        merek = newValue;
    }
    
    public void gantiGear(int newValue)
    {
        gear = newValue;
    }
    
    public void tambahKecepatan(int increment)
    {
        kecepatan = kecepatan + increment;
    }
    
    public void rem(int decrement)
    {
        kecepatan = kecepatan - decrement;
    }
    
    public void cetakStatus()
    {
        System.out.println("Merek\t: " + merek);
        System.out.println("Kecepatan\t: " + kecepatan);
        System.out.println("Gear\t: " + gear);
        System.out.println("Warna\t: " + warna);
    }
}
