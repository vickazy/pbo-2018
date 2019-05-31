package UTS;

public class Main 
{
    public static void main(String[] args) 
    {
        Laptop l1 = new Laptop("Asus","Intel Atom",1,1000000);
        Laptop l2 = new Laptop("Acer","Intel Pentium",2,1250000);
        Laptop l3 = new Laptop("HP","Intel Core i3",4,2000000);
        
        LaptopGaming lg1 = new LaptopGaming("ROG Predator","Intel core i13",32,25000000,"RTX 2080");
        LaptopGaming lg2 = new LaptopGaming("Acer Omen","Intel core i15",64,40000000,"RTX 2080 TI ");
        LaptopGaming lg3 = new LaptopGaming("HP Legion","Intel core i17",128,60000000,"RTX 2080 Pascal");
        
        System.out.println("======================================");
        System.out.println("          GREGGY LAPTOP SHOP");
        System.out.println("======================================");
        
        System.out.println("");
        
        Laptop l[] = {lg1,l2};
        
        Pembeli p1 = new Pembeli();
        p1.nama = "Ilham Nuswantoro A.";
        p1.laptop = l;
        p1.print();
        
        System.out.println("");
        
        Laptop ll[] = {l1,l2};
        Member m1 = new Member();
        m1.nama = "Hafizh Dias R.";
        m1.laptop = ll;
        
        m1.print();
    }
}
