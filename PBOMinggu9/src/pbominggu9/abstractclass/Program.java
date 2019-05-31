package pbominggu9.abstractclass;

/**
 * 
 * @author Greggy Gianini Firmansyah (1741720088 / TI-2F / 10)
 */

public class Program 
{
    public static void main(String[] args) 
    {
        Kucing kucingKampung = new Kucing();
        Ikan lumbaLumba = new Ikan();
        
        Orang ani = new Orang("Ani");
        Orang budi = new Orang("Budi");
        
        ani.peliharaHewan(kucingKampung);
        budi.peliharaHewan(lumbaLumba);
        
        ani.ajakPeliharaanJalanJalan();
        budi.ajakPeliharaanJalanJalan();
    }
}
