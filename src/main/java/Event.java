class Event {
  private String mEventname;
  private int mGuestcount;
  private String mPartyfood;
  private String mPartydrinks;
  private String mEntertain;
  private int mFoodcost;
  private int mDrinkscost;
  private int mEntertaincost;
  private int mEventCost;

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

  public int computeCost() {
    if (mPartyfood.equals("Appetizers")) {
      mFoodcost = 50;
    } else if (mPartyfood.equals("Full Meal")) {
      mFoodcost = 100;
    } else if (mPartyfood.equals("Desserts")) {
      mFoodcost = 75;
    }

    if (mPartydrinks.equals("Cocktails")) {
      mDrinkscost = 100;
    } else if (mPartydrinks.equals("Beers")) {
      mDrinkscost = 75;
    } else if (mPartydrinks.equals("Juices")) {
      mDrinkscost = 50;
    }

    if (mEntertain.equals("Live Band")) {
      mEntertaincost = 5000;
    } else if (mEntertain.equals("DJ")) {
      mEntertaincost = 2000;
    } else if (mEntertain.equals("None")) {
      mEntertaincost = 0;
    }

    mEventCost = ((mFoodcost + mDrinkscost) * mGuestcount + mEntertaincost);
    return mEventCost;
  }
}
