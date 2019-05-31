package LatihanRelasiKlas.Latihan2;

// inisialisasi class Mahasiswa
public class Mahasiswa 
{
    // inisialisasi atribut nim, nama bertipe-data String dan mk dengan bertipe-data relasi array MataKuliah
    private String nim;
    private String nama;
    private MataKuliah[] mk;
    
    // membuat konstruktor default
    Mahasiswa()
    {
        
    }
    
    // membuat setter untuk menge-set nilai NIM
    public void setNim(String nim) 
    {
        this.nim = nim;
    }
    
    // membuat setter untuk menge-set nilai Nama
    public void setNama(String nama) 
    {
        this.nama = nama;
    }
    
    // membuat setter untuk menge-set nilai mk
    public void setMk(MataKuliah[] mk) 
    {
        this.mk = mk;
    }
    
    // membuat getter untuk mendapatkan nilai NIM
    public String getNim() 
    {
        return nim;
    }
    
    // membuat getter untuk mendapatkan nilai Nama
    public String getNama() 
    {
        return nama;
    }
    
    // membuat getter untuk mendapatkan nilai mk
    public MataKuliah[] getMk() 
    {
        return mk;
    }
    
    // menghitung nilai rata-rata dari seluruh nilai total mata kuliah
    public double hitungNilaiRataRata() 
    {
        double rataRata = 0;
        double jmlNilai =0;
        double jmlSks = 0;
        
        for (int i = 0; i <mk.length; i++)
        {
            jmlNilai += mk[i].getNilai().hitungNilaiTotal() * mk[i].getSks();
            jmlSks += mk[i].getSks();
        }
         
        rataRata = jmlNilai / jmlSks;
        return rataRata;
    }
    
    // menampilkan data NIM, nama, dan daftar nilai.
    public void tampilData()
    {
        System.out.println("NIM\t\t= "+nim);
        System.out.println("Nama Mahasiswa\t= "+nama);
        
        System.out.println("");
        
        System.out.println("------------------------------------------------");
        System.out.println("                DAFTAR NILAI                    ");
        System.out.println("------------------------------------------------");
        
        // menampilkan data kode MK, nama MK, SKS, detail seluruh nilai, dan nilai total
        for(int i=0; i<mk.length; i++)
        {
            mk[i].tampilData();
            System.out.println("------------------------------------------------");
        }
        
        // menampilkan rata-rata dari seluruh nilai total mata kuliah
        System.out.println("Nilai Rata-Rata\t= " + hitungNilaiRataRata());
        System.out.println("------------------------------------------------");
    }
}