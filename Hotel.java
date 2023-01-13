import java.util.*;

public class Hotel{

  //Variables
  private Reservation[] rooms;
  private ArrayList<String>waitList;
  private String nameOfHotel;
  
  public Hotel(String name, int rooms){
    nameOfHotel = name;
    this.rooms = new Reservation[rooms];
    waitList = new ArrayList<String>();
  }

  public Reservation[] getRooms(){
    return rooms;
  }

  public void printCurrentReservations(){
    for(int i=0; i<rooms.length; i++){
      System.out.println(rooms[i].getGuestName());
      System.out.println(rooms[i].getRoomNumber());
    }
  }

  public void printCurrentWaitlist(){
    for(String i: waitList){
      System.out.println(i);
    }
  }
  
  public Reservation requestRoom(String guestName){

    for(int i=0; i<rooms.length; i++){
      if(rooms[i]==null){
        rooms[i]=new Reservation(guestName,i);
        return rooms[i];
      }
    }
    waitList.add(guestName);
    return null;
  }

  public Reservation cancelAndReassign(Reservation res){
    rooms[res.getRoomNumber()]=null;

    if(waitList.size()==0)
       return null;
    else{
      rooms[res.getRoomNumber()]=new Reservation(waitList.remove(0),res.getRoomNumber());
      
      return rooms[res.getRoomNumber()];
    }
    
  }

  

}