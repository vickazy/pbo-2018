package UTS;

public class Laptop 
{
    private String merek, processor;
    private int ram,harga;
    
    public Laptop(String merek, String processor, int ram, int harga)
    {
        this.merek = merek;
        this.processor = processor;
        this.ram = ram;
        this.harga = harga;
    }

    public String getMerek() 
    {
        return merek;
    }

    public void setMerek(String merek) 
    {
        this.merek = merek;
    }

    public String getProcessor() 
    {
        return processor;
    }

    public void setProcessor(String processor) 
    {
        this.processor = processor;
    }

    public int getRam() 
    {
        return ram;
    }

    public void setRam(int ram) 
    {
        this.ram = ram;
    }

    public int getHarga() 
    {
        return harga;
    }

    public void setHarga(int harga) 
    {
        this.harga = harga;
    }
    
    public void print()
    {
        System.out.println("--------------------------------------");
        System.out.println("Brand\t\t: " + merek);
        System.out.println("Processor\t: " + processor);
        System.out.println("RAM\t\t: " + ram + " GB");
        System.out.println("Harga\t\t: Rp." + harga + ",-");
    }
}
