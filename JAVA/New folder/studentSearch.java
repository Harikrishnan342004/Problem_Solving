import java.util.Scanner;

class Searching {
    int studentId;
    String studentName;
    float studentMarks;   

    public Searching(   int studentId , String studentName ,float studentMarks) 
    {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentMarks = studentMarks;
    }

}

public class studentSearch
{
    public static void findStudent( Searching[] students , String name  )
    {
       for(Searching student: students)
       {
        if( student.studentName.equalsIgnoreCase(name))
        {
           System.out.println("StudentID :" + student.studentId);
           return;
        }
       }
       System.out.println("No Student Found");
    } 

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.err.println("Enter the Count of the students");
    int n = sc.nextInt();

    sc.nextLine();

    Searching[] students = new Searching[n];

    for (int i = 0 ; i < n ; i++)
    {
        System.out.println("Enter the deatil for the student"+ (i+1) + ":");

        System.out.println("Enter the ID :");
        int id = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter the Name: ");
        String name = sc.nextLine();

        System.out.println("Enter the Mark :");
        float mark = sc.nextFloat();

        students[i] = new Searching(id , name , mark);

    }

    System.out.println("Enter the name of the student");
    sc.nextLine();
    String searchName = sc.nextLine();
    findStudent(students, searchName);
}

}
