import java.util.Scanner;
class Minimum {
  int StudentID;
  String StudentName;
  float studentMarks;

  public Minimum(int StudentID , String StudentName , float studentMarks)
  {
    this.StudentID = StudentID;
    this.StudentName = StudentName;
    this.studentMarks = studentMarks;
  }
}
public class Main
{
    public static float findMinimumMarks(Minimum[] students)
    {
       float minMark = Float.MAX_VALUE;
       for( Minimum student : students )
       {
           if(student.studentMarks < minMark )
           {
              minMark = student.studentMarks;
           }
       }
       return minMark;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the count of the students : ");
        int n = sc.nextInt();

        Minimum[] students = new Minimum[n];

        for(int i = 0 ; i < n ; i++)
        {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Student ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            System.out.print("Student Name: ");
            String name = sc.nextLine();
            System.out.print("Student Marks: ");
            float marks = sc.nextFloat();
            sc.nextLine(); // Consume the newline character


            students[i] = new Minimum(id , name , marks);
        }

        float minMarks = findMinimumMarks(students);
        System.out.println("Minimum marks scored by a student"+ minMarks);
        
         
    }
}


 
