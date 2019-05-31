package belajardatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AksesMahasiswa 
{
    private Connection koneksiUtama;
    
    public AksesMahasiswa()
    {
        
    }
    
    public void cekDriver()
    {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Cek Driver Berhasil!");
        } 
        catch (ClassNotFoundException ex) 
        {
            System.out.println("Cek Driver Gagal! Errornya :");
            System.out.println(ex.getMessage());
        }
    }
    
    public void buatKoneksi()
    {
        String url = "jdbc:mysql://localhost/nb_mahasiswa?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String user = "root";
        String password = "";
        
        try 
        {
            this.koneksiUtama = DriverManager.getConnection(url, user, password);
            
            System.out.println("Buat Koneksi OK.");
        } 
        catch (SQLException ex) 
        {
            System.out.println("Buat koneksi gagal! Errornya:");
            System.out.println(ex.getMessage());
        }
    }
    
    public void tutupKoneksi(Connection koneksiUtama) throws SQLException
    {
//        this.koneksiUtama.close();
    }

    void tampilkanDataMahasiswa(String namaMahasiswa) throws SQLException 
    {
        Statement statement = this.koneksiUtama.createStatement();
        
        String sql = "SELECT * FROM mahasiswa where nama='" + namaMahasiswa + "'";
        
        ResultSet hasil = statement.executeQuery(sql);
        
        System.out.println("NIM\t\t|Nama\t\t|Alamat");
        
        while(hasil.next())
        {
            int nim = hasil.getInt(1);
            String nama = hasil.getString(2);
            String alamat = hasil.getString(3);
            
            System.out.println(nim + "\t|" + nama + "\t\t|" + alamat);
           
        }
    }
}
