package LatihanRelasiKlas.Latihan2;

// inisialisasi class Nilai
public class Nilai 
{
    // inisialisasi atribut q1, q2, uts, uas, tugas dengan bertipe-data double
    private double q1;
    private double q2;
    private double uts;
    private double uas;
    private double tugas;

    // membuat konstruktor default
    public Nilai()
    {
        
    }
    
    // membuat setter untuk menge-set nilai Q1
    public void setQ1(double q1) 
    {
        this.q1 = q1;
    }
    
    // membuat setter untuk menge-set nilai Q2
    public void setQ2(double q2) 
    {
        this.q2 = q2;
    }
    
    // membuat setter untuk menge-set nilai UTS
    public void setUts(double uts)
    {
        this.uts = uts;
    }
    
    // membuat setter untuk menge-set nilai UAS
    public void setUas(double uas)
    {
        this.uas = uas;
    }
    
    // membuat setter untuk menge-set nilai Tugas
    public void setTugas(double tugas) 
    {
        this.tugas = tugas;
    }
    
    // membuat getter untuk mendapatkan nilai Q1
    public double getQ1() 
    {
        return q1;
    }
    
    // membuat getter untuk mendapatkan nilai Q2
    public double getQ2() 
    {
        return q2;
    }
    
    // membuat getter untuk mendapatkan nilai UTS
    public double getUts() 
    {
        return uts;
    }
    
    // membuat getter untuk mendapatkan nilai UAS
    public double getUas() 
    {
        return uas;
    }
    
    // membuat getter untuk mendapatkan nilai Tugas
    public double getTugas() 
    {
        return tugas;
    }
    
    // menghitung nilai total dengan rumus
    public double hitungNilaiTotal()
    {
        return (0.15 * q1) + (0.15 * q2) + (0.25 * uts) + (0.35 * uas) + (0.1 * tugas);
    }
    
    // menampilkan data seluruh nilai
    public void tampilData()
    {
        System.out.println("Nilai Q1\t= " + q1);
        System.out.println("Nilai Q2\t= " + q2);
        System.out.println("Nilai UTS\t= " + uts);
        System.out.println("Nilai UAS\t= " + uas);
        System.out.println("Nilai Tugas\t= " + tugas);
        System.out.println("");
        System.out.println("Nilai Total\t= "+ hitungNilaiTotal());
    }         
}