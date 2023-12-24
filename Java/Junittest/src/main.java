
public class main 
{

    
    public static void main(String[] args) 
    {
        Ders d1 = new Ders();
        d1.vize=80;
        d1.dsonu=95;

        d1.ortalama_hesapla();

        System.out.println(d1.ortalama_gor());
        System.out.println("-----------------");
        System.out.println(d1.harfnotu_gor());

    }
    
}
