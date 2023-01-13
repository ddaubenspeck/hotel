public class Reservation{

  //Variables
  private String guestName;
  private int roomNumber;

  //Constructor
  public Reservation(String g, int r){
    guestName = g;
    roomNumber = r;
  }

  //Methods

  public int getRoomNumber(){
    return roomNumber;
  }

  public String getGuestName(){
    return guestName;
  }

  public void changeName(String newName){
    guestName = newName;
  }

  public void changeRoom(int r){
    roomNumber = r;
  }

  
}