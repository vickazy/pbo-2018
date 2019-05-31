package TugasJobsheet3;
import java.util.Scanner; // untuk inputan

public class TestKoperasi 
{
    public static void main(String[] args) 
    {
        int pinjaman,angsuran;
        Scanner input = new Scanner(System.in);
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        
        System.out.println("Nama Anggota\t: " + donny.getNama());
        System.out.println("Limit Pinjaman\t: " + donny.getLimitPinjaman());
        
        System.out.println("");
        
        // Pinjaman Pertama
        System.out.print("Masukkan uang pinjaman : ");
        pinjaman = input.nextInt();
        
        System.out.println("\nMeminjam uang " + pinjaman);
        donny.pinjam(pinjaman);
        
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
        // Pinjaman Kedua
        System.out.print("Masukkan uang pinjaman : ");
        pinjaman = input.nextInt();
        
        System.out.println("\nMeminjam uang " + pinjaman);
        donny.pinjam(pinjaman);
        
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
        // Angsuran Pertama
        System.out.print("Masukkan uang angsuran : ");
        angsuran = input.nextInt();
        
        System.out.println("\nMembayar angsuran " + angsuran);
        donny.angsur(angsuran);
        
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
        // Angsuran Kedua
        System.out.print("Masukkan uang angsuran : ");
        angsuran = input.nextInt();
        
        System.out.println("\nMembayar angsuran " + angsuran);
        donny.angsur(angsuran);
        
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
// NOMOR 4
//        System.out.println("\nMembayar angsuran 1.000.000");
//        donny.angsur(1000000);
//        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
//        
//        System.out.println("\nMembayar angsuran 3.000.000");
//        donny.angsur(3000000);
//        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
    }
}