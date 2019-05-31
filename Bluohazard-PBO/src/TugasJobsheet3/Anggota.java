package TugasJobsheet3;

public class Anggota 
{
    private String ktp, nama;
    private int LimitPinjaman,JumlahPinjaman,angsuran;
    
    Anggota(String ktp, String nama, int LimitPinjaman)
    {
        this.ktp = ktp;
        this.nama = nama;
        this.LimitPinjaman = LimitPinjaman;
    }
    
    public String getNama()
    {
        return nama;
    }

    public int getLimitPinjaman() 
    {
        return LimitPinjaman;
    }

    public int getJumlahPinjaman() 
    {
        return JumlahPinjaman;
    }
    
    public int getAngsuran()
    {
        return angsuran;
    }

    public void pinjam(int JumlahPinjaman) 
    {
        if(JumlahPinjaman > LimitPinjaman)
        {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        }
        else
        {
            this.JumlahPinjaman += JumlahPinjaman;
        }
    }
    
    public void angsur(int angsuran)
    {
        // menghitung total 10% dari jumlah pinjaman
        double total = 0.1 * JumlahPinjaman;
        
        if(angsuran>JumlahPinjaman)
        {
            System.out.println("Maaf, jumlah angsuran melebihi jumlah pinjaman.");
        }
        else if(angsuran<total) // jika total angsuran kurang dari 10%
        {
            System.out.println("Maaf,angsuran harus 10%	dari jumlah pinjaman");
        }
        else
        {
            this.JumlahPinjaman -= angsuran;
        }
    }
}
