package OOPS;
import java.util.*;


public class Java_String_Reverse {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Yes");
        String A = sc.nextLine();

        int Len = A.length();
        boolean isPalindrome = true;

        for(int i = 0; i < Len ; i++)
        {
           if(A.charAt(i) != A.charAt(Len - i - 1))
           {
              isPalindrome = false;
           }
        }
    
    if(isPalindrome)
    {
        System.out.println("Yes");
    }
    else
    {
        System.out.println("No");  
    }
    }
    
}
