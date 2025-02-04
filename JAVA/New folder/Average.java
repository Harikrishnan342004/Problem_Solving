import java.util.Scanner;

public class Average{ 

    private int studentId;
    private String studentName;
    private float studentMark;

   Average(  int studentId ,  String studentName,  float studentMark  )
   {
    this.studentId = studentId;
    this.studentMark = studentMark;
    this.studentName = studentName; 

   }
   public float getMarks()
   {
       return studentMark; 
   }



    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        Average[] students = new Average[n];

        for( int i = 0 ; i < n ; i++ )
        {
            int id = sc.nextInt();
            sc.nextLine();

            String Name = sc.nextLine();
            float marks = sc.nextFloat();

            students[i] = new Average(id , Name , marks);

        }

        float t =0;
        for(Average   : students)
        {
            t += student.getMarks();
        }

        float avg = t / n;
        System.out.println(avg);


}

}