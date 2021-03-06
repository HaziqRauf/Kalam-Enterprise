import java.util.*;
import java.text.*;
public class main
{
    public static void main(String [] args)
    {
        String name,add,bedChoice,mattChoice;
        
        int number;
        Display disp=new Display();
        Mattress matt[]=new Mattress[2];
        Bed bed[]=new Bed[2];
        Customer customer[]=new Customer[2];
        double[] tp=new double[2];
        String[] bedDecision=new String[2];
        String[] mattDecision=new String[2];
        
        Scanner kb=new Scanner(System.in);
        kb.useDelimiter("\n");
       for(int i=0;i<customer.length;i++)
       {
        double bedPrice=0.00,mattPrice=0.00;
        System.out.println("Enter customer name: ");
        name=kb.next();
        
        System.out.println("Enter customer address: ");
        add=kb.next();
        
        System.out.println("Enter customer phone number: ");
        number=kb.nextInt();
        
        customer[i]=new Customer(name,add,number);
        
        disp.showBed();
        System.out.println("Choose type of bed: ");
        bedChoice=kb.next();
        bed[i]=new Bed(bedChoice);
        bed[i].calcBed();
        bedPrice=bed[i].getPriceBed();
        bedDecision[i]=bed[i].getBed();
        
        disp.showMatt();
        System.out.println("Choose type of Mattress: ");
        mattChoice=kb.next();
        matt[i]=new Mattress(mattChoice);
        matt[i].calcMattress();
        mattPrice=matt[i].getPriceMattress();
        mattDecision[i]=matt[i].getMattress();
        
        tp[i]=customer[i].calcTotal(mattPrice,bedPrice);
       
       }
       for(int j=0;j<customer.length;j++)
       {
           System.out.println(customer[j].toString(tp[j],bedDecision[j],mattDecision[j]));
       }
    }
}
