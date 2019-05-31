package inheritance.percobaan2;
import inheritance.percobaan1.ClassC;

public class ClassD extends ClassC
{
    public int x;
    
    public static void main(String[] args) 
    {
        ClassD d = new ClassD();
        d.t = 10;
        d.u = 7;
        d.v = 5;
        d.w = 10;
    }
}
