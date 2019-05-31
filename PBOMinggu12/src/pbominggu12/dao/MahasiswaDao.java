package pbominggu12.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import pbominggu12.entity.Mahasiswa;
import pbominggu12.lib.ManajerKoneksi;

public class MahasiswaDao 
{
    private final Connection koneksi;
    
    public MahasiswaDao()
    {
        this.koneksi = ManajerKoneksi.getKoneksi();
    }
    
    public ArrayList<Mahasiswa> ambilSemuaData() throws SQLException
    {
        ArrayList<Mahasiswa> semuanya = this.selectWhere(null);
        
        return semuanya;
    }
    
    public void insert(int nim, String nama, String alamat) throws SQLException
    {
        String sql = "INSERT INTO mahasiswa VALUES ('" + nim + "','" + nama + "','" + alamat + "')";
        
        Statement s = this.koneksi.createStatement();
        
        s.executeUpdate(sql);
    }
    
    public void insert(Mahasiswa mahasiswa) throws SQLException
    {
        Integer nim = mahasiswa.getNim();
        String nama = mahasiswa.getNama();
        String alamat = mahasiswa.getAlamat();
        
        String sql = "INSERT INTO mahasiswa VALUES ('" + nim + "','" + nama + "','" + alamat + "')";
        
        Statement s = this.koneksi.createStatement();
        
        s.executeUpdate(sql);
    }
    
    private ArrayList<Mahasiswa> selectWhere(String where) throws SQLException
    {
        String sql = "SELECT * FROM mahasiswa";
        
        if(where != null)
            sql += ("" + where);
        
        try
        {
            // Menjalankan SQL
            Statement s = this.koneksi.createStatement();
        
            ResultSet hasil = s.executeQuery(sql);
        
            // Siapkan array kosong untuk menyimpan mahasiswa dari ResultSet
            ArrayList<Mahasiswa> mhsTerpilih = new ArrayList<>();

            while(hasil.next())
            {
                Mahasiswa m = new Mahasiswa();
                m.setNim(hasil.getInt("nim"));
                m.setNama(hasil.getString("nama"));
                m.setAlamat(hasil.getString("alamat"));

                // Memasukkan objek m kedalam array list
                mhsTerpilih.add(m);
            }
            
            return mhsTerpilih;
        }
        catch(SQLException ex)
        {
            System.out.println("Select where error : " + ex.getMessage());
            return null;
        }
    }
}
