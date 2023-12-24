

import static junit.framework.Assert.assertEquals;

import org.junit.Assert;

import org.junit.Test;



public class mainTest 
{
    
  
    @Test
    public void ortalama_hesapla()
    {
       Ders obj = new Ders();
       obj.vize=35;
       obj.dsonu=80;
       obj.ortalama_hesapla();
//       double expecteds= obj.vize*0.4+obj.dsonu*0.6;
//       expecteds=68;
       assertEquals(68.0, obj.ortalama_gor());
       
       Ders obj1 = new Ders();
       obj1.vize=55;
       obj1.dsonu=76;
       obj1.ortalama_hesapla();
//       double expecteds= obj.vize*0.4+obj.dsonu*0.6;
//       expecteds=64.0;
       assertEquals(64.0, obj1.ortalama_gor());
    }   
    @Test
    public void harfnotu_hesapla () 
    {
        Ders obj2 = new Ders();
        obj2.vize=1;
        obj2.dsonu=1;
        obj2.ortalama_hesapla();
        obj2.harfnotu_hesapla();
//      expecteds=FF
        Assert.assertEquals("FD",obj2.harfnotu_gor());
        
        Ders obj3 = new Ders();
        obj3.vize=56;
        obj3.dsonu=87;
        obj3.ortalama_hesapla();
        obj3.harfnotu_hesapla();
//      expecteds=BA
        Assert.assertEquals("BA",obj3.harfnotu_gor());
        
        
        Ders obj9 = new Ders();
        obj9.vize=90;
        obj9.dsonu=95;
        obj9.ortalama_hesapla();
        obj9.harfnotu_hesapla();
//      expecteds=BA
        Assert.assertEquals("AA",obj9.harfnotu_gor());
    }
    @Test
    public void vizekontrol()
    {
        Ders obj4 = new Ders();
        obj4.vize=101;
        obj4.vizekontrol();
        
        Assert.assertEquals("Gecersiz vize notu",obj4.vizekontrol());
        
        Ders obj5 = new Ders();
        obj5.vize=65;
        obj5.vizekontrol();
        Assert.assertEquals(null,obj5.vizekontrol());
        
        
        Ders obj6= new Ders();
        obj6.vize=-65;
        obj6.vizekontrol();
        Assert.assertEquals("Gecersiz vize notu",obj6.vizekontrol());
    } 
    @Test
    public void dSonukontrol()
    {
        Ders obj7 = new Ders();
        obj7.dsonu=101;
        obj7.dSonukontrol();
        Assert.assertEquals("Gecersiz final notu",obj7.dSonukontrol());
        
        Ders obj8 = new Ders();
        obj8.dsonu=65;
        obj8.dSonukontrol();
        Assert.assertEquals(null,obj8.dSonukontrol());
        
        
        Ders obj9= new Ders();
        obj9.dsonu=-65;
        obj9.dSonukontrol();
        Assert.assertEquals("Gecersiz final notu",obj9.dSonukontrol());
    }
   
}   
