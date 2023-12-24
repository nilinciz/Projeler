
public class Ders 
{
    public String adi;
    public double vize;
    public double dsonu;
    private double ortalama;
    private String harfnotu;
    

    public void ortalama_hesapla()
    {
        ortalama=(vize*0.4) + (dsonu*0.6);
        harfnotu_hesapla();
    }

    public double ortalama_gor() 
    {
        return ortalama;
    }

    

    public void harfnotu_hesapla ()
    {
        if(ortalama>=90) 
        {
            harfnotu="AA";
        }
        else if (ortalama>=85) 
        {
            harfnotu="BA";
        } 
        else if (ortalama>=80) 
        {
            harfnotu="BB";
        }
        else if (ortalama>=75) 
        {
            harfnotu="CB";
        }
        else if (ortalama>=70)
        {
            harfnotu="CC";
        }
        else  if (ortalama>=65)
        {
            harfnotu="DC";
        }
        else if (ortalama>=60) 
        {
            harfnotu="DD";
        }
        else if (ortalama>=1) 
        {
            harfnotu="FD";
        }
        else if(ortalama==0) 
        {
            harfnotu="FF";
        }
    }
    
    public String harfnotu_gor()
    {
        return harfnotu;
    }
    
    public String vizekontrol()
    {
        if ((this.vize>100)||(this.vize<0)) 
            {
                return "Gecersiz vize notu";
            }
        return null;
    }
    public String dSonukontrol()
    {
        if ((this.dsonu>100)||(this.dsonu<0)) 
            {
                return "Gecersiz final notu";
            }
        return null;
    }
}
