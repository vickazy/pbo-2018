package UTS;

public class LaptopGaming extends Laptop 
{
    private String vga;
    public LaptopGaming(String merek, String processor, int ram, int harga, String vga) 
    {
        super(merek, processor, ram, harga);
        this.vga = vga;
    }

    public String getVga() {
        return vga;
    }

    public void setVga(String vga) {
        this.vga = vga;
    }
    
    public void print()
    {
        super.print();
        System.out.println("VGA\t\t: " + vga);
    }
}
