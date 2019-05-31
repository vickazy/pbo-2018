package pbominggu12.lib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ManajerKoneksi 
{
    private final static String URL = "jdbc:mysql://localhost/nb_mahasiswa?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private final static String USER = "root";
    private final static String PASS = "";
    
    private static Connection koneksi;
    
    public static Connection getKoneksi()
    {
        if(ManajerKoneksi.koneksi == null)
            ManajerKoneksi.buatKoneksi();
        
        return ManajerKoneksi.koneksi;
    }
    
    public static void buatKoneksi()
    {        
        try 
        {
            ManajerKoneksi.koneksi = DriverManager.getConnection(ManajerKoneksi.URL, ManajerKoneksi.USER, ManajerKoneksi.PASS);
        } 
        catch (SQLException ex) 
        {
            System.out.println("Buat koneksi gagal! Errornya:");
            System.out.println(ex.getMessage());
        }
    }
    
    private static void cekDriver()
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
            
            // matikan program segera
            System.exit(1);
        }
    }
}
