
import java.util.Scanner;

public class Recursion {
      public static int sum(int k)
        {
            if( k >0)
            {
                return k + sum(k-1);  
            }
            else
            {
                return 0;
            }
        }
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            sc.nextLine();
            int data = sc.nextInt();
            int result = sum(data);
            System.out.println(result);
            sc.close();
        }
        
}
