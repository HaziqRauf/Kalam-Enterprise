public class Mattress
{
    private String typeMattress;
    private double priceMattress=0.00;
    //normal constructor
    public Mattress(String typeMattress)
    {
        this.typeMattress=typeMattress;
    }
    //mutator
    public void setMattress(String typeMattress)
    {
        typeMattress=typeMattress;
    }
    public void setPriceMattress(double priceMattress)
    {
        priceMattress=priceMattress;
    }
    //accessor
    public String getMattress()
    {
        return typeMattress;
    }
    public double getPriceMattress()
    {
        return priceMattress;
    }
    //method
    public void calcMattress()
    {
        if(typeMattress.equalsIgnoreCase("Foam"))
        {
            priceMattress=890;
            typeMattress="Foam";
        }
        else if(typeMattress.equalsIgnoreCase("Innerspring"))
        {
            priceMattress=950;
            typeMattress="Innerspring";
        }
        else if(typeMattress.equalsIgnoreCase("MemoryFoam"))
        {
            priceMattress=1370;
            typeMattress="MemoryFoam";
        }
        else if(typeMattress.equalsIgnoreCase("Hybrid"))
        {
            priceMattress=1975;
            typeMattress="Hybrid";
        }
        else if(typeMattress.equalsIgnoreCase("Latex"))
        {
            priceMattress=2200;
            typeMattress="Latex";
        }
        else
        {
            priceMattress=0.00;
        }
    }
}
