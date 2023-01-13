class Main {
  public static void main(String[] args) {
    Hotel cali = new Hotel("Cali", 3);
    cali.requestRoom("Dave");
    cali.requestRoom("Sherry");
    cali.requestRoom("Emmy");
    cali.requestRoom("Andrew");
    cali.requestRoom("Catherine");
    //cali.cancelAndReassign()
    cali.printCurrentReservations();
    cali.printCurrentWaitlist();
    cali.cancelAndReassign(cali.getRooms()[0]);
    cali.printCurrentReservations();
    cali.printCurrentWaitlist();
    
    
    
    
  }
}