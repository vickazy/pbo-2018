package LatihanRelasiKlas.Latihan3;

public class Member 
{
    private String id, nama;
    private Buku buku[];
    
    Member()
    {
        
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setBuku(Buku[] buku) {
        this.buku = buku;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public Buku[] getBuku() {
        return buku;
    }

    public void tampilData()
    {
        System.out.println("ID\t: " + id);
        System.out.println("Nama\t: " + nama);
        System.out.println("");
        
        System.out.println("List Buku");
        
        for(int i = 0; i<buku.length;i++)
        {
            buku[i].tampilData();
            System.out.println("-----------------------------------------");
        }
    }
    
    public void tampilBukuTerbaru()
    {
        for(int i = 0; i<buku.length;i++)
        {
            
        }
    }
    
    public void tampilBukuTerlama()
    {
        
    }
}

