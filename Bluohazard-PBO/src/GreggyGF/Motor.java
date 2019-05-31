package GreggyGF;

public class Motor 
{
    private String merek, noPlat;
    
    Motor()
    {
        
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getNoPlat() {
        return noPlat;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void info()
    {
        System.out.println("Data Kendaraan :");
        System.out.println("Merek Motor\t: " + merek);
        System.out.println("No Plat\t: " + noPlat);
    }
}
