package LatihanRelasiKlas.Latihan2;

public class Main 
{
    public static void main(String[] args) 
    {
        // deklarasi nilai n1, mengisi detail nilai n1, dan menghitung nilai total
        Nilai n1 = new Nilai();
        n1.setQ1(90);
        n1.setQ2(80);
        n1.setTugas(100);
        n1.setUts(90);
        n1.setUas(80);
        n1.hitungNilaiTotal();
        
        // deklarasi mata kuliah mk1, mengisi detail mk1 dan memasukkan nilai n1 ke mata kuliah
        MataKuliah mk1 = new MataKuliah();
        mk1.setKode("MK1");
        mk1.setNamaMk("Dasar Pemrograman");
        mk1.setNilai(n1);
        mk1.setSks(6);
     
        // deklarasi nilai n2, mengisi detail nilai n2, dan menghitung nilai total
        Nilai n2 = new Nilai();
        n2.setQ1(75);
        n2.setQ2(85);
        n2.setTugas(90);
        n2.setUts(90);
        n2.setUas(85);
        n2.hitungNilaiTotal();
        
        // deklarasi mata kuliah mk2, mengisi detail mk1, dan memasukkan nilai n2 ke mata kuliah
        MataKuliah mk2 = new MataKuliah();
        mk2.setKode("MK2");
        mk2.setNamaMk("Ilmu Komunikasi dan Organisasi");
        mk2.setNilai(n2);
        mk2.setSks(6);
        
        // mengisi array mkArr dengan mata kuliah yang sudah diinisialisasi
        MataKuliah mkArr[] = {mk1, mk2};
        
        // deklarasi mahasiswa m, mengisi detail mahasiswa, dan memasukkan array mkArr ( 2 mata kuliah ) ke mata kuliah yang ditempuh
        Mahasiswa m = new Mahasiswa();
        m.setNim("1741720088");
        m.setNama("Greggy Gianini Firmansyah");
        m.setMk(mkArr);
        
        // menampilkan data dari objek m
        m.tampilData();
    }
}