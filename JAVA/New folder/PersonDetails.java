import java.util.Scanner;
class Store {
    int personid;
    String personName;
    String personAddress;

    public Store(int personid , String personName ,String personAddress)
    {
      this.personid = personid;
      this.personName = personName;
      this.personAddress = personAddress;
    }
    public void displayPerson()
    {
        System.out.println("PersonID :"+ personid);
        System.out.println("PersonName :"+ personName);
        System.out.println("personAddress :"+ personAddress);
        System.out.println("------------------------");
    }

}
public class PersonDetails {
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the number of persons: ");
     int n = sc.nextInt();
     sc.nextLine();

     Store[] persons = new Store[n];

    for( int i = 0 ;i < n  ; i++ )
    {
      System.out.println("Enter the details for person" + (i+1) );
      int id = sc.nextInt();
      sc.nextLine();

      System.out.println("Enter the Name");
      String name = sc.nextLine();

      System.out.println("Adress: ");
      String address = sc.nextLine();

      persons[i] = new Store(id, name, address);
    }

    System.out.println("\nPerson Detail");
    for (Store person : persons)
    {
      person.displayPerson();
    }
    sc.close();
    
     }
    
}