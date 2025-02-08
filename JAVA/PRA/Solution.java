package java.PRA;
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
           String brandname = sc.nextLine();
           String rom = sc.nextLine();
           double price = sc.nextDouble();
        }
        sc.nextLine();
        String findname =  sc.nextLine();
        double startRange = sc.nextDouble();
        double endRange = sc.nextDouble();  
        
        ArrayList<Smartphone> res = filterTheSmartPhoneByBrandName(set, findname);

        if(res == null)
        {
            System.out.println("No mobile found with mentioned brand name");
        }
        else
        {
            for(Smartphone el : res)
            {
                System.out.println(el.getid());
                System.out.println(el.getName());
                System.out.println(el.getrom());
                System.out.println(el.getprice());
            }
        }

        Smartphone e = findthe(set, startRange, endRange);
        if(e == null)
        {
            System.out.println("No mobile found with mentioned brand name");
        }
        else
        {
           
                System.out.println(e.getid());
                System.out.println(e.getName());
                System.out.println(e.getrom());
                System.out.println(e.getprice());
            
        }
        sc.close();
}
public static ArrayList<Smartphone> filterTheSmartPhoneByBrandName(LinkedHashSet<Smartphone> set, String findname)
{
    ArrayList<Smartphone> arr = new ArrayList<>();
    for(Smartphone e : arr)
    {
      if(e.getName().equalsIgnoreCase(findname))
      {
        arr.add(e);
      }
    }
    if(arr.isEmpty())
    {
       return null;
    }
    else
    {
        return arr;
    }
}


public static Smartphone findthe(LinkedHashSet<Smartphone> set, double startRange , double endRange)
{
      Smartphone arr = null;
      for(Smartphone e : set)
      {
        if(e.getprice() > startRange && e.getprice() < endRange)
        {
            if(arr == null || e.getprice() > arr.getprice() )
            {
                  arr = e;
            }
        }
      }
      return arr;
}
 
}
        
        
      