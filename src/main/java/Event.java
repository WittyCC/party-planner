class Event {
  private String mEventname;
  private int mGuestcount;
  private String mPartyfood;
  private String mPartydrinks;
  private String mEntertain;

  public Event(String eventname, int guestcount, String partyfood, String partydrinks, String entertain) {
    mEventname = eventname;
    mGuestcount = guestcount;
    mPartyfood = partyfood;
    mPartydrinks = partydrinks;
    mEntertain = entertain;
  }

  public String getEventName() {
    return mEventname;
  }

  public int getGuestCount() {
    return mGuestcount;
  }

  public String getPartyFood() {
    return mPartyfood;
  }

  public String getPartyDrinks() {
    return mPartydrinks;
  }

  public String getEntertain() {
    return mEntertain;
  }

  // public String getEventName(String eventname) {
  //   mEventname = eventname;
  //   return mEventname;
  // }
  //
  // public int enterGuestCount(int guestcount) {
  //   mGuestcount = guestcount;
  //   return guestcount;
  // }
  //
  // public String selectPartyFood(String partyfood) {
  //   mPartyfood = partyfood;
  //   return partyfood;
  // }
}
