import java.util.*;

class Smartphone
{
    private int productId;
    private String brandname;
    private String rom;
    private double price;

    public Smartphone(int productId ,String brandname ,String rom ,double price)
    {
      this.productId = productId;
      this.brandname = brandname;
      this.rom = rom;
      this.price = price;
    }

    public int getid()
    {
        return productId;
    }
    public void setid(int nId)
    {
        this.productId = nId;
    }

    public String getName()
    {
        return brandname;
    }
    public void setName(String nName)
    {
        this.brandname = nName;
    }

    public String getrom()
    {
        return rom;
    }
    public void setrom(String nRom)
    {
        this.rom = nRom;
    }

    public double getprice()
    {
        return price;
    }
    public void setprice(double nPrice)
    {
        this.price = nPrice;
    }

}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        LinkedHashSet<Smartphone> set = new LinkedHashSet<>();

        for(int i = 0 ; i < N ; i++)
        {
            int id = sc.nextInt();sc.nextLine();
            String name = sc.nextLine();
            String rom = sc.nextLine();
            double price = sc.nextDouble();

            set.add(new Smartphone(id, name, rom, price));
        }
        sc.nextLine();
        String Bname = sc.nextLine();
        double startRange = sc.nextDouble();
        double endRange = sc.nextDouble();

        ArrayList<Smartphone> res = filterTheSmartPhoneByBrandName(set, Bname);
        if(res.isEmpty())
        {
         System.out.println("No mobile found with mentioned brand name");    
        }
        else
        {
            for(Smartphone e: res)
            {
              System.out.println(e.getid());
              System.out.println(e.getName());
              System.out.println(e.getrom());
              System.out.println(e.getprice());  
            }
        }

        Smartphone range = findTheSartWithMaxPriceGivenPriceRange(set, endRange, startRange);
        if(range == null)
        {
         System.out.println("No mobile found in the give price range");    
        }
        else
        {
              System.out.println(range.getid());
              System.out.println(range.getName());
              System.out.println(range.getrom());
              System.out.println(range.getprice());  
            
        }


    }
    public static ArrayList<Smartphone> filterTheSmartPhoneByBrandName(LinkedHashSet<Smartphone> set ,String Bname)
    {
          ArrayList<Smartphone> result = new ArrayList<>();
          for(Smartphone e : set)
          {
            if(e.getName().equalsIgnoreCase(Bname))
            {
                result.add(e);
            }
          }
          return result;
    }

    public static Smartphone findTheSartWithMaxPriceGivenPriceRange(LinkedHashSet<Smartphone> set , double endRange , double startRange)
    {
        Smartphone maxPricePhone = null;

        for(Smartphone e : set)
          {
            if(e.getprice() > startRange && e.getprice() < endRange)
            {
                if( maxPricePhone == null || e.getprice() > maxPricePhone.getprice() ) {
                    maxPricePhone = e;
                }
               
            }
          }
          return maxPricePhone;
    }
}
