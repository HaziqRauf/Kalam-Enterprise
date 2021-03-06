public class Customer
{
    private String name,address;
    private int phone;
    Bed bed[]=new Bed[2];
    //normal constructor
    public Customer(String name,String address,int phone)
    {
        this.name=name;
        this.address=address;
        this.phone=phone;
    }
    //mutator
    public void setName(String name)
    {
        name=name;
    }
    public void setAddress(String address)
    {
        address=address;
    }
    public void setPhone(int phone)
    {
        phone=phone;
    }
    
    //accessor
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public int getPhone()
    {
        return phone;
    }
    
    //method calculate total price
    public double calcTotal(double mattPrice,double bedPrice)
    {
        double totalPrice=0.00;
        totalPrice=mattPrice+bedPrice;
        return totalPrice;
    }
    public String toString(double total,String bed,String matt)
    {
        return("Name: "+getName()+"\nAddress: "+getAddress()+"\nPhone Number:0"+getPhone()+"\nTotal:RM "+total+"\nBed: "+bed+"\nMattress: "+matt);
    }
    
}