public class Bed
{
    private String typeBed;
    private double priceBed=0.00;
    //normal constructor
    public Bed(String typeBed)
    {
        this.typeBed=typeBed;
    }
    //mutator
    public void setBed(String typeBed)
    {
        typeBed=typeBed;
    }
    public void setPriceBed(double priceBed)
    {
        priceBed=priceBed;
    }
    //accessor
    public String getBed()
    {
        return typeBed;
    }
    public double getPriceBed()
    {
        return priceBed;
    }
    //method
    public void calcBed()
    {
        if(typeBed.equalsIgnoreCase("Cabin"))
        {
            priceBed=239;
            typeBed="Cabin";
        }
        else if(typeBed.equalsIgnoreCase("Bunk"))
        {
            priceBed=279;
            typeBed="Bunk";
        }
        else if(typeBed.equalsIgnoreCase("Ottoman"))
        {
            priceBed=289;
            typeBed="Ottoman";
        }
        else if(typeBed.equalsIgnoreCase("Guest"))
        {
            priceBed=299;
            typeBed="Guest";
        }
        else if(typeBed.equalsIgnoreCase("Divan"))
        {
            priceBed=329;
            typeBed="Divan";
        }
        else if(typeBed.equalsIgnoreCase("Sleigh"))
        {
            priceBed=349;
            typeBed="Sleigh";
        }
        else
        {
            priceBed=0.00;
        }
    }
}
