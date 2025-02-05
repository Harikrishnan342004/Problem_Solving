import java.util.*;

class NotNeonException extends Exception
{
    public NotNeonException(String str)
    {
        super(str);
    }
}
public class Neon {
    public static int square(int n)
    {
       return n*n;
    }
    public static int s(int sq)
    {
      int ans = 0 ;
      while(sq > 0)
      {
        ans += (sq%10);
        sq /= 10;
      }

      return ans;
    }

    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
         int N =  sc.nextInt();
         int[] array = new int[N]; 
         
         for(int i = 0 ; i < N ; i++)
         {
            array[i] = sc.nextInt();
         }
    for(int n : array)
    {
        int sq = square(n) ;
        int sum = s(sq);
       try
       {
       
        if(n == sum)
        {
          System.out.println(n);
        }
        else
        {
            throw  new NotNeonException(n +" is not a neon number");
        }
       }
       catch(NotNeonException e)
       {
        System.out.println(e.getClass().getSimpleName()+ ": "+ e.getMessage());
       }
    }
}
}
