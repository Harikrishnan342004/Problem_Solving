
import java.util.*;

class Militant
{
    int militantId;
    String name;
    String category;
    double experience;

    public Militant(int militantId ,String name ,String category ,double experience )
    {
        this.militantId = militantId;
        this.name = name;
        this.category = category;
        this.experience = experience;
    }

    public int  getMilitiantId()
    {
        return militantId ;
    }
    public String getName()
    {
        return name ;
    }
    public String  getCategory()
    {
        return category ;
    }
    public  double  getexperience()
    {
        return experience ;
    }
}

public class  MilitantMain
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N =  sc.nextInt();

        LinkedHashSet<Militant> Array = new LinkedHashSet<>();

        for(int i = 0 ; i < N ; i++)
        {
            int id = sc.nextInt();sc.nextLine();
            String name = sc.nextLine();
            String category = sc.nextLine();
            double experience = sc.nextDouble();

            Array.add(new Militant(id, name, category, experience));
        }

        int findid = sc.nextInt();

        Militant e = searchMilitantByMilitantId(Array, findid);

        if(e == null)
        {
            System.out.println("No militant found");
        }
        else
        {
            
            System.out.println(e.getMilitiantId());
            System.out.println(e.getName());
            System.out.println(e.getCategory());
            System.out.println(e.getexperience());
            
        }

        ArrayList<Militant> resu = findMilitantsWithLessThanTwoYearsExperience(Array );

        if(resu.isEmpty())
        {
            System.out.println("No militant found");
        }
        else
        {
            for(Militant ei : resu)
            {
            System.out.println(ei.getMilitiantId());
            System.out.println(ei.getName());
            System.out.println(ei.getCategory());
            System.out.println(ei.getexperience());
            }
        }


    }
    public static Militant searchMilitantByMilitantId(LinkedHashSet<Militant> Array , int findid)
    {
       Militant fresult =  null;
       for(Militant e : Array )
       {
        if(e.getMilitiantId() == findid)
        {
            fresult = e;
        }
       }
       if(fresult == null)
       {
        return null;
       }
       else
       {
        return fresult ;
       }
    }

    public static ArrayList<Militant> findMilitantsWithLessThanTwoYearsExperience( LinkedHashSet<Militant> Array )
    {
        ArrayList<Militant> res = new ArrayList<>();
        for(Militant e : Array)
        {
           if( e.getexperience() < 2 )
           {
               res.add(e);
           }
        }
        return  res;
    }
    
}