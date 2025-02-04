import java.util.*;

class Militant
{
    private int militantId;
    private String name;
    private String category;
    private double experience;

    public Militant(int militantId , String name , String category, double experience)
    {
       this.militantId = militantId;
       this.name = name;
       this.category = category;
       this.experience = experience;
    }

    public int getId()
    {
        return militantId;
    }
    public void setMilitantId(int newMilitantId )
    {
      this.militantId = newMilitantId;
    }


    public String getName()
    {
      return name;
    }
    public void setName(String newName)
    {
        this.name = newName;
    }

    public String getCategory()
    {
        return category;
    }
    public void setCategory(String newCategory)
    {
       this.category = newCategory;
    }
    
    public double getExperience()
    {
      return experience;
    }
    public void setExperience(double newExperience)
    {
        this.experience = newExperience;
    }
    
}

public class MilitanMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N =  sc.nextInt();
        Militant[] m = new Militant[N];

        for(int i = 0 ; i < N ; i++)
        {
            int id = sc.nextInt();sc.nextLine();
            String name = sc.nextLine();
            String category = sc.nextLine();
            double experience = sc.nextInt();

            m[i] = new Militant(id , name , category , experience);
        }
        int findId = sc.nextInt();
        ArrayList<Militant> Ansid = searchMilitantByMilitantId(m , findId );

        if( Ansid.size() == 0)
        {
            System.out.println("Not found");
        }
        for(int i = 0 ; i < Ansid.size() ; i++)
        {
           System.out.println(Ansid.get(i).getId());
           System.out.println(Ansid.get(i).getName());
           System.out.println(Ansid.get(i).getCategory());
           System.out.println(Ansid.get(i).getExperience());
        }


        ArrayList<Militant> Ex = findMilitantsLessThanTwoYearsExperience(m);

        if(Ex.size() == 0)
        {
            System.out.println("Not found");
        }
        for(int i = 0 ; i < Ex.size() ; i++)
        {
           System.out.println(Ex.get(i).getId());
           System.out.println(Ex.get(i).getName());
           System.out.println(Ex.get(i).getCategory());
           System.out.println(Ex.get(i).getExperience());
        }



    }    
    
    public static ArrayList<Militant> searchMilitantByMilitantId(Militant[] m, int id)
    {
        ArrayList<Militant> Ansid = new ArrayList<>();
        for(int i = 0 ; i < m.length ; i++) 
        {
            if(m[i].getId() == id)
            {
                Ansid.add(m[i]);
            }
        }
       return Ansid;
    }

    public static ArrayList<Militant> findMilitantsLessThanTwoYearsExperience(Militant[] m)
    {
       ArrayList<Militant> Ex = new ArrayList<>();
       for(int i = 0 ; i < m.length ; i++)
       {
        if( m[i].getExperience() < 2 )
        {
            Ex.add(m[i]);
        }
       }
       return Ex;
    }
}
 