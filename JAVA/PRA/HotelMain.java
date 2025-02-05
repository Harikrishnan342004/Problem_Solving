import java.util.*;

class Hotel {
    private int roomno;
    private String roomType;
    private int capacity;
    private double pricePerNight;
    private boolean isAvailable;

    public Hotel(int roomno, String roomType, int capacity, double pricePerNight, boolean isAvailable) {
        this.roomno = roomno;
        this.roomType = roomType;
        this.capacity = capacity;
        this.pricePerNight = pricePerNight;
        this.isAvailable = isAvailable;
    }

    public int getRoomno() {
        return roomno;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public boolean getisAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

public class HotelMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Hotel> hotels = new ArrayList<>();

        for(int i = 0 ; i < N ; i++)
        {
            int id = sc.nextInt();sc.nextLine();
            String roomType = sc.nextLine();
            int capacity = sc.nextInt();
            double pricePerNight = sc.nextDouble();
            boolean isAvailable = sc.nextBoolean();

            hotels.add(new Hotel(id , roomType, capacity, pricePerNight, isAvailable));
        }

        int findroomId = sc.nextInt();

        Hotel result1 = roomBookingByUsingRoomNo( hotels, findroomId);

        if(result1 == null)
        {
            System.out.println( "No room found with given attributes");
        }
        else
        {
            System.out.println(result1.getRoomno());
            System.out.println(result1.getRoomType());
            System.out.println(result1.getCapacity());
            System.out.println(result1.getPricePerNight());
            
        }


        Hotel res = findMaxCapacityRoomsBasedOnAvailability(hotels);
        if(res == null)
        {
            System.out.println( "No  found with given attributes");
        }
        else
        {
            System.out.println(res.getRoomno());
            System.out.println(res.getRoomType());
            System.out.println(res.getCapacity());
            System.out.println(res.getPricePerNight());   
        }


   }



   public static Hotel roomBookingByUsingRoomNo( ArrayList<Hotel> hotels , int findroomId)
   {
     Hotel H = null;
     for(Hotel e : hotels )
     {
        if(e.getRoomno() == findroomId)
        {
            H = e;
            H.setAvailable(false);
        }
     }
     return H;
   }


   public static Hotel findMaxCapacityRoomsBasedOnAvailability(ArrayList<Hotel> hotels)
   {
      Hotel HO = null;
      for(Hotel e : hotels)
      {
        if(e.getisAvailable() )
        {
           if(HO == null ||  e.getCapacity() > HO.getCapacity() )
           {
            HO = e;
           }
        }
      }
      return HO;
   }
   
}


