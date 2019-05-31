package array;

public class array 
{
    public static void tampilkanArray(int[][] x)
    {
        System.out.println("-------------------------------");
        System.out.println("Sebelum operasi tukar kolom");
        System.out.println("-------------------------------");
        
        for(int a=0; a<4; a++)
        {
            for(int b=0; b<4; b++)
            {
                System.out.print(x[a][b] + "\t");
            }
            System.out.println("");
        }
        
        System.out.println("");
    }
    
    public static void manipulateArray(int[][] x)
    {
        int temp;
        
        System.out.println("-------------------------------");
        System.out.println("Hasil operasi tukar kolom");
        System.out.println("-------------------------------");
        
        for(int a=0; a<4; a++)
        {
            for(int b=0; b<4; b++)
            {
                if(b == 0 || b == 2)
                {
                    temp = x[a][b];
                    x[a][b] = x[a][b+1];
                    x[a][b+1] = temp;
                }
                System.out.print(x[a][b] + "\t");
            }
            System.out.println("");
        }
        
        System.out.println("");
    }
    
    public static void penjumlahanBaris(int[][] x)
    {
        int temp;
        
        System.out.println("-------------------------------");
        System.out.println("Hasil operasi penjumlahan baris");
        System.out.println("-------------------------------");
        
        for(int a=0; a<4; a++)
        {
            for(int b=0; b<4; b++)
            {
                if(a == 0 || a == 2)
                {
                    temp = x[a][b];
                    x[a+1][b] = x[a+1][b] + temp; 
                }
                
                System.out.print(x[a][b] + "\t");
            }
            System.out.println("");
        }
    }
    
    // Program Utama
    public static void main(String[] args) 
    {
        int data[][] = new int[4][4];
        
        // Baris Ke-1
        data[0][0] = 2;
        data[0][1] = 6;
        data[0][2] = 4;
        data[0][3] = 7;
        
        // Baris Ke-2
        data[1][0] = 3;
        data[1][1] = 5;
        data[1][2] = 9;
        data[1][3] = 5;
        
        // Baris ke-3
        data[2][0] = 1;
        data[2][1] = 3;
        data[2][2] = 10;
        data[2][3] = 6;
        
        // Baris ke-4
        data[3][0] = 7;
        data[3][1] = 2;
        data[3][2] = 1;
        data[3][3] = 4;
        
        // Menampilkan array
        tampilkanArray(data);
        
        // Menampilkan hasil operasi tukar kolom
        manipulateArray(data);
        
        // Menampilkan hasil operasi penjumlahan baris
        penjumlahanBaris(data);
    }
}