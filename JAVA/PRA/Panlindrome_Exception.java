import java.util.*;

class PalindromeException extends Exception
{
    public PalindromeException(String Str)
    {
        super(Str);
    }
}

public class Panlindrome_Exception {
    public static int validate(int n)
{
    int ans = 0;
    while(n > 0) 
    { 
       int d = n % 10;
       ans = ans * 10 + d;
       n /= 10; 
    }
    return  ans;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        LinkedList<Integer> Array = new LinkedList<>();

        for(int i = 0 ; i < N ; i++)
        {
            Array.add(sc.nextInt());
        }

        // System.out.println(Array);
        for(int  n : Array){
        try
        {
          int reverse = validate(n);
          if(reverse == n)
          {
             throw new PalindromeException("Number is palindrome");
          }
          else
          {
            System.err.println(reverse);
          }
        }
        catch(PalindromeException e)
        {
          System.out.println(e.getClass().getSimpleName()+ ": " + e.getMessage());
        }
    }
}

   
}
