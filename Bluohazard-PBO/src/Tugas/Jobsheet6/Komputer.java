package Tugas.Jobsheet6;

public class Komputer 
{
    public String merk, jnsProsesor;
    public int kecProsesor, sizeMemory;
    
    public Komputer()
    {
        
    }
    
    public Komputer(String merk, int kecProsesor, int sizeMemory, String jnsProsesor)
    {
        this.merk = merk;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
        this.jnsProsesor = jnsProsesor;
    }
    
    public void tampilData()
    {
        System.out.println("Merk\t\t\t= " + merk);
        System.out.println("Kecepatan Prosesor\t= " + kecProsesor + "GHz");
        System.out.println("Size Memory\t\t= " + sizeMemory + "GB");
        System.out.println("Jenis Prosesor\t\t= " + jnsProsesor);
    }
}
