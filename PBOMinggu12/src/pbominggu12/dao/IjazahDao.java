package pbominggu12.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import pbominggu12.entity.Ijazah;
import pbominggu12.lib.ManajerKoneksi;

public class IjazahDao 
{
    private final Connection koneksi;
    
    public IjazahDao()
    {
        this.koneksi = ManajerKoneksi.getKoneksi();
    }
    
    public ArrayList<Ijazah> ambilSemuaData() throws SQLException
    {
        ArrayList<Ijazah> semuanya = this.selectWhere(null);
        
        return semuanya;
    }
    
    public void insertData(Ijazah ijazah) throws SQLException
    {
        Integer nim = ijazah.getNim();
        String tglLulus = ijazah.getTanggal_lulus();
        float nilai = ijazah.getNilai();
        String predikat = ijazah.getPredikat();
        
        String sql = "INSERT INTO ijazah VALUES ('" + nim + "','" + tglLulus + "','" + nilai + "','" + predikat + "')";
        
        Statement s = this.koneksi.createStatement();
        
        s.executeUpdate(sql);
    }
    
    private ArrayList<Ijazah> selectWhere(String where) throws SQLException
    {
        String sql = "SELECT * FROM ijazah";
        
        if(where != null)
            sql += ("" + where);
        
        try
        {
            // Menjalankan SQL
            Statement s = this.koneksi.createStatement();
        
            ResultSet hasil = s.executeQuery(sql);
        
            // Siapkan array kosong untuk menyimpan mahasiswa dari ResultSet
            ArrayList<Ijazah> ijazahTerpilih = new ArrayList<>();

            while(hasil.next())
            {
                Ijazah i = new Ijazah();
                i.setNim(hasil.getInt("nim"));
                i.setTanggal_lulus(hasil.getString("tanggal_lulus"));
                i.setNilai(hasil.getFloat("nilai"));
                i.setPredikat(hasil.getString("predikat"));

                // Memasukkan objek m kedalam array list
                ijazahTerpilih.add(i);
            }
            
            return ijazahTerpilih;
        }
        catch(SQLException ex)
        {
            System.out.println("Select where error : " + ex.getMessage());
            return null;
        }
    }
}
