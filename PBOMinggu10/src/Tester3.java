/**
 * 
 * @author Greggy Gianini Firmansyah (1741720088 / TI-2F / 10)
 */

public class Tester3 
{
    public static void main(String[] args) 
    {
        PermanentEmployee pEmp = new PermanentEmployee("Fergusso", 500);
        InternshipEmployee iEmp = new InternshipEmployee("Maria", 5);
        ElectricityBill eBill = new ElectricityBill(5, "A-1");
        
        Employee e[] = {pEmp, iEmp};
        Payable p[] = {pEmp, eBill};
        Employee e2[] = {pEmp, iEmp, eBill};
    }
}