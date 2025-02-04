import java.util.Scanner;

public class TotalMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        sc.nextLine();

        int totalMarks = 0;
        for(int i = 0 ;  i < count ; i++)
        {  
           System.out.println( "Enter the marks"+ (i+1) );
           int marks = sc.nextInt();
           totalMarks += marks;
        }

        System.out.println(totalMarks);
        sc.close();
    
    }
}
