package LatihanRelasiKlas.Latihan2;

// inisialisasi class MataKuliah
public class MataKuliah 
{
    // inisialisasi atribut kode, namaMk bertipe-data String dan nilai dengan bertipe-data relasi class Nilai, dan sks bertipe-data integer
    private String kode;
    private String namaMk;
    private Nilai nilai;
    private int sks;
    
    // membuat konstruktor default
    MataKuliah() 
    {
        
    }
    
    // membuat setter untuk menge-set nilai kode
    public void setKode(String kode) 
    {
        this.kode = kode;
    }
    
    // membuat setter untuk menge-set nilai nama kuliah
    public void setNamaMk(String namaMk) 
    {
        this.namaMk = namaMk;
    }
    
    // membuat setter untuk menge-set nilai dari class Nilai
    public void setNilai(Nilai nilai) 
    {
        this.nilai = nilai;
    }
    
    // membuat setter untuk menge-set nilai sks
    public void setSks(int sks) 
    {
        this.sks = sks;
    }

    // membuat getter untuk mendapatkan nilai SKS
    public int getSks() 
    {
        return sks;
    }

    // membuat getter untuk mendapatkan nilai dari class Nilai
    public Nilai getNilai() 
    {
        return nilai;
    }
    
    // menampilkan data kode MK, nama MK, SKS, dan detail seluruh nilai dari MataKuliah (q1,q2,uts,uas,tugas)
    public void tampilData()
    {
        System.out.println("Kode MK\t\t= "+ kode);
        System.out.println("Nama MK\t\t= "+ namaMk);
        System.out.println("SKS\t\t= "+ sks);
        System.out.println("");
        nilai.tampilData();
    }
}