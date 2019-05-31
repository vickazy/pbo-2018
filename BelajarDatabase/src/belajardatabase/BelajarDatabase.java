package belajardatabase;

import java.sql.SQLException;

public class BelajarDatabase 
{
    public static void main(String[] args) throws SQLException 
    {
        AksesMahasiswa am = new AksesMahasiswa();
        
        am.cekDriver();
        am.buatKoneksi();
        am.tampilkanDataMahasiswa("greggy");
    }
}
