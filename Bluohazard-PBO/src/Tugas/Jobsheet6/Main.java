package Tugas.Jobsheet6;

public class Main 
{
    public static void main(String[] args) 
    {
        Komputer komputer = new Komputer("Samsul",2,4,"Intel core i3");
        Laptop laptop = new Laptop("Asus",3,8,"Intel core i5","tanam");
        Pc pc = new Pc("Toshiba",4,16,"Intel core i7",19);
        Mac mac = new Mac("Mac",5,12,"AMD Ryzen","Tanam","Mantul");
        Windows windows = new Windows("Windows",4,6,"AMD A8","Tanam","Mantul");
        
        komputer.tampilData();
        System.out.println("--------------------------------------------");
        laptop.tampilLaptop();
        System.out.println("--------------------------------------------");
        pc.tampilPc();
        System.out.println("--------------------------------------------");
        mac.tampilMac();
        System.out.println("--------------------------------------------");
        windows.tampilWindows();
        
    }
}
