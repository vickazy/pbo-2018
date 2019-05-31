package interfacelatihan;

/**
 * 
 * @author Greggy Gianini Firmansyah (1741720088 / TI-2F / 10)
 */

public class Program 
{
    public static void main(String[] args) 
    {
        Rektor pakRektor = new Rektor();
        
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");
        
//        pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
//        pakRektor.beriSertifikatCumlaude(masterCumlaude);

        pakRektor.beriSertifikatMawapres(sarjanaCumlaude);
        pakRektor.beriSertifikatMawapres(masterCumlaude);
    }
}
